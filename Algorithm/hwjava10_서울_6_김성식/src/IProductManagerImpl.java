

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class IProductManagerImpl implements IProductMgr {
	private ArrayList<Product> bm = new ArrayList<>();
	
	
	
	public IProductManagerImpl() {
		// ó���� ������ �� �ʱ� ������ �� �ִ´�.
		try {
			FileInputStream fis = new FileInputStream("product.dat");

		} catch (FileNotFoundException e) {
			try {
				// ��ǰ��ȣ, �̸�, ����, ����, ��ġ, Ÿ��
				
				this.add( new Tv("120","����Ƽ��",20000,100,53,"�ö��"));
				this.add( new Tv("121","����Ƽ��",30000,90,60,"LCD"));
				this.add( new Tv("122","LEƼ��",40000,80,24,"LdD"));
				this.add( new Tv("123","SSƼ��",13000,70,14,"L3D"));
				// ��ǰ��ȣ, �̸�, ����, ����, �뷮
				this.add( new Refrigerator("233","LG�ñ״�ó",20000,150,500));
				this.add( new Refrigerator("212","AB�ñ״�ó",50000,160,600));
				this.add( new Refrigerator("200","EE�ñ״�ó",60000,170,300));
				this.add( new Refrigerator("245","RR�ñ״�ó",70000,180,350));
				
			} catch (DuplicateException e1) {
				e1.printStackTrace();
			}
			this.close();
			bm.clear();
			
		}
		open();
	}

	// 0. ������ �Է� ���
	public void add(Product p) throws DuplicateException {
		for (Product product : bm) {
			if(product.getNum().equals(p.getNum())) {
				throw new DuplicateException();
			}
		}
		bm.add(p);		
	}
	
	// 1. ������ ��ü �˻� ���
	public ArrayList<Product> search() {
		return bm;
	}
	
	// 2. Isbn ��ȣ�� ��ǰ�� �˻�
	public ArrayList<Product> search(String num) throws CodeNotFoundException {
		ArrayList<Product> temp = new ArrayList<>();
		for (int i = 0; i < bm.size(); i++) {
			if(bm.get(i).getNum().equals(num)) 
				temp.add(bm.get(i));
		}
		if(temp.size() == 0)
			throw new CodeNotFoundException();
		return temp;
	}
	
	// 3. ��ǰ������ ��ǰ�� �˻��ϴ� ���
	public ArrayList<Product> searchName(String name) {
		ArrayList<Product> temp = new ArrayList<>();
		for (int i = 0; i < bm.size(); i++) {
			if(bm.get(i).getName().contains(name)) 
				temp.add(bm.get(i));
		}
		return temp;		
	}
	
	// 4. Tv�� �˻��ϴ� ���
	public ArrayList<Product> searchTv() {
		ArrayList<Product> temp = new ArrayList<>();
		for (int i = 0; i < bm.size(); i++) {
			if(bm.get(i) instanceof Tv) {
				temp.add(bm.get(i));
			}
		}
		return temp;
	}
	
	// 5. Refrigerator�� �˻��ϴ� ���
	public ArrayList<Product> searchRefrigerator() {
		ArrayList<Product> temp = new ArrayList<>();
		for (int i = 0; i < bm.size(); i++) {
			if(bm.get(i) instanceof Refrigerator) {
				temp.add(bm.get(i));
			}
		}
		return temp;
	}
	
	// 6. 400L�̻��� Refrigerator �˻�
	public ArrayList<Refrigerator> search400L() throws ProductNotFoundException {
		ArrayList<Refrigerator> temp = new ArrayList<>();
		for (int i = 0; i < bm.size(); i++) {
			if(bm.get(i) instanceof Refrigerator) {
				Refrigerator t = (Refrigerator)bm.get(i);
				if(t.getVolume() < 400) continue;
					temp.add(t);
			}
		}
		if(temp.size() == 0)
			throw new ProductNotFoundException();
		return temp;
	}
	
	// 7. 50inch�̻��� TV �˻�
	public ArrayList<Tv> search50inch() throws ProductNotFoundException {
		ArrayList<Tv> temp = new ArrayList<>();
		for (int i = 0; i < bm.size(); i++) {
			if(bm.get(i) instanceof Tv) {
				Tv t = (Tv)bm.get(i);
				if(t.getInch() < 50) continue;
				temp.add(t);
			}
		}
		if(temp.size() == 0)
			throw new ProductNotFoundException();
		return temp;
	}
	
	// 8. ��ǰ��ȣ�� ������ �Է� �޾� ��ǰ ������ ������ �� �ִ� ���
	public void updatePrice(String num, int price) {
		for (int i = 0; i < bm.size(); i++) {
			if(bm.get(i).getNum().equals(num)) {
				bm.get(i).setPrice(price);
				System.out.println("������Ʈ �Ϸ�!");
			}
		}
	}
	
	// 9. ��ǰ��ȣ�� ��ǰ�� �����ϴ� ���
	public void delete(String num) {
		for (int i = 0; i < bm.size(); i++) {
			if(bm.get(i).getNum().equals(num)) {
				bm.remove(i);
			}
		}
	}
	
	// 10. ��ü ��� ��ǰ �ݾ��� ���ϴ� ���
	public double total() {
		int total = 0;
		for (int i = 0; i < bm.size(); i++) {
			total += bm.get(i).getPrice() * bm.get(i).getAmount();
		}
		return total;
	}
	
	public int getSize() {
		return bm.size();
	}

	@Override
	public void close() {
		// ��ü ����
		try {
			FileOutputStream fos = new FileOutputStream("product.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			for (Product product : bm) {
				oos.writeObject(product);
			}
			oos.close();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void open() {
		try {
			FileInputStream fis = new FileInputStream("product.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			for(Product b; ( b = (Product)ois.readObject() ) != null; ) {
				bm.add(b);
				// fis�� �о �ڵ尪 = fis.read()
				// fos�� write��� �޼ҵ�� �� �ڵ忡 �ش��ϴ� '����'��  ����Ͽ� ���
			}	
			
		} catch (EOFException e) {
			
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("�о�鿩�� ������ �����ϴ�.!");
			e.printStackTrace();
		}
		
		
	}

}
