

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class IBookManagerImpl implements IBookMgr {
	private ArrayList<Book> bm = new ArrayList<>();
	
	
	
	public IBookManagerImpl() {
		// ó���� ������ �� �ʱ� ������ �� �ִ´�.
		try {
			FileInputStream fis = new FileInputStream("book.dat");

		} catch (FileNotFoundException e) {
			bm.add( new Book("00001","������",20000,2));
			bm.add( new Book("00002","Java ��",25000,4));
			bm.add( new Book("00003","�м�����",15000,6));
			bm.add( new Book("00004","�輳����",10000,5));
			bm.add( new Book("00005","����м�",20000,5));
			
			bm.add( new Magazine("1001","�׸���",12000,5,1));
			bm.add( new Magazine("1002","�Ϻ�",24000,2,2));
			bm.add( new Magazine("1003","�ѱ�",10000,10,3));
			bm.add( new Magazine("1004","�̱�",25000,4,4));
			bm.add( new Magazine("1005","�߱�",30000,1,5));
			this.close();
			bm.clear();
			
		}
		open();
	}

	// 1. ������ �Է� ���
	public void add(Book p) {
		bm.add(p);		
	}
	
	// 2. ������ ��ü �˻� ���
	public ArrayList<Book> search() {
		return bm;
	}

	// 3. ������ �ǸŵǾ� ��� ������ ���� ���
	@Override
	public void sell(String isbn, int quantity) throws QuantityException, ISBNNotFoundException {
		for (Book book : bm) {
			if(book.getIsbn().equals(isbn)) {
				int q = book.getQuantity() - quantity;
				if(q < 0)
					throw new QuantityException();
				book.setQuantity(q);
				return;
			}
		}
		// �ݺ����� ��� ����ߴٴ� ����
		// �˻��� Isbn�� �������� �ʾҴٴ� �̾߱�
		throw new ISBNNotFoundException();
		
	}

	// 4. ������ ���ŵǾ� ��� ������ ���ϴ� ���
	@Override
	public void buy(String isbn, int quantity) throws ISBNNotFoundException {
		for (Book book : bm) {
			if(book.getIsbn().equals(isbn)) {
				int q = book.getQuantity() + quantity;
				book.setQuantity(q);
				return;
			}
		}		
		// �ݺ����� ��� ����ߴٴ� ����
		// �˻��� Isbn�� �������� �ʾҴٴ� �̾߱�
		throw new ISBNNotFoundException();
	}
	
	// 5. ��� �������� ����*�ݾ��� �Ͽ� �� ��� �ݾ��� ���Ͽ� ����
	@Override
	public int getTotalAmount() {
		int sum = 0;
		for (Book book : bm) {
			sum += book.getPrice() * book.getQuantity();
		}
		return sum;
	}

	// 6. Ŭ���� �����ÿ� ȣ��Ǿ� ����, ����("book.dat")�� ����� ������ �о ArrayList�� ����
	@Override
	public void open() {
		try {
			FileInputStream fis = new FileInputStream("book.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			for(Book b; ( b = (Book)ois.readObject() ) != null; ) {
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

	// 7. �ñ׷� ����ÿ� ȣ��Ǿ� ����, ArrayList�� �ִ� ���� ������ ���Ϸ� ����.��
	@Override
	public void close() {
		// ��ü ����
		try {
			FileOutputStream fos = new FileOutputStream("book.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			for (Book book : bm) {
				oos.writeObject(book);			
			}
			oos.close();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}	
	
	public int getSize() {
		return bm.size();
	}
}
