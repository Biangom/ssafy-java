package com.ssafy;

import java.util.ArrayList;

public class IProductManagerImpl implements IProductMgr{
	private ArrayList<Product> bm = new ArrayList<>();
	
	// 0. ������ �Է� ���
	public void add(Product p) {
		bm.add(p);		
	}
	
	// 1. ������ ��ü �˻� ���
	public ArrayList<Product> search() {
		return bm;
	}
	
	// 2. Isbn ��ȣ�� ��ǰ�� �˻�
	public ArrayList<Product> search(String num) {
		ArrayList<Product> temp = new ArrayList<>();
		for (int i = 0; i < bm.size(); i++) {
			if(bm.get(i).getNum().equals(num)) 
				temp.add(bm.get(i));
		}
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
	public ArrayList<Refrigerator> search400L() {
		ArrayList<Refrigerator> temp = new ArrayList<>();
		for (int i = 0; i < bm.size(); i++) {
			if(bm.get(i) instanceof Refrigerator) {
				Refrigerator t = (Refrigerator)bm.get(i);
				
				if(t.getVolume() < 400) continue;
					temp.add(t);
			}
		}
		return temp;
	}
	
	// 7. 50inch�̻��� TV �˻�
	public ArrayList<Tv> search50inch() {
		ArrayList<Tv> temp = new ArrayList<>();
		for (int i = 0; i < bm.size(); i++) {
			if(bm.get(i) instanceof Tv) {
				Tv t = (Tv)bm.get(i);
				if(t.getInch() < 50) continue;
				temp.add(t);
			}
		}
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
	public void open() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

}
