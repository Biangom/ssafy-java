package com.ssafy;

public class ProductMgr {
	private Product[] bm = new Product[100];
	private int index;
	
	
	// 1. ������ �Է� ���
	public void add(Product p) {
		bm[index++] = p;		
	}
	
	// 2. ������ ��ü �˻� ���
	public Product[] search() {
		return bm;
	}
	
	// 3. Isbn ��ȣ�� ��ǰ�� �˻�
	public Product[] search(String num) {
		Product[] temp = new Product[100];
		int tempCnt = 0;
		for (int i = 0; i < index; i++) {
			if(bm[i].getNum().equals(num)) 
				temp[tempCnt++] = bm[i];
		}
		return temp;
	}
	
	// 4. ��ǰ������ ��ǰ�� �˻��ϴ� ���
	public Product[] searchName(String name) {
		Product[] temp = new Product[100];
		int tempCnt = 0;
		for (int i = 0; i < index; i++) {
			if(bm[i].getName().contains(name)) 
				temp[tempCnt++] = bm[i];
		}
		return temp;		
	}
	
	// 5. Tv�� �˻��ϴ� ���
	public Product[] searchTv() {
		Product[] temp = new Product[100];
		int tempCnt = 0;
		for (int i = 0; i < index; i++) {
			if(bm[i] instanceof Tv) {
				temp[tempCnt++] = bm[i];
			}
		}
		return temp;
	}
	
	// 6. Refrigerator�� �˻��ϴ� ���
	public Product[] searchRefrigerator() {
		Product[] temp = new Product[100];
		int tempCnt = 0;
		for (int i = 0; i < index; i++) {
			if(bm[i] instanceof Refrigerator) {
				temp[tempCnt++] = bm[i];
			}
		}
		return temp;
	}
	
	// 7. 400L�̻��� Refrigerator �˻�
	public Refrigerator[] search400L() {
		Refrigerator[] temp = new Refrigerator[100];
		int tempCnt = 0;
		for (int i = 0; i < index; i++) {
			if(bm[i] instanceof Refrigerator) {
				Refrigerator t = (Refrigerator)bm[i];
				
				if(t.getVolume() < 400) continue;
				temp[tempCnt++] = t;
			}
		}
		return temp;
	}
	
	// 9. 50inch�̻��� TV �˻�
	public Tv[] search50inch() {
		Tv[] temp = new Tv[100];
		int tempCnt = 0;
		for (int i = 0; i < index; i++) {
			if(bm[i] instanceof Tv) {
				Tv t = (Tv)bm[i];
				if(t.getInch() < 50) continue;
				temp[tempCnt++] = t;
			}
		}
		return temp;
	}
	
	// 10. ��ǰ��ȣ�� ������ �Է� �޾� ��ǰ ������ ������ �� �ִ� ���
	public void updatePrice(String num, int price) {
		for (int i = 0; i < index; i++) {
			if(bm[i].getNum().equals(num)) {
				bm[i].setPrice(price);
				System.out.println("������Ʈ �Ϸ�!");
			}
		}
	}
	
	// 11. ��ǰ��ȣ�� ��ǰ�� �����ϴ� ���
	public void delete(String num) {
		for (int i = 0; i < index; i++) {
			// ��ġ�Ѵٸ� ������ �����
			if(bm[i].getNum().equals(num)) {
				
				// ����� �۾�
				for(int j = i; j < index-1; j++) {
					bm[j] = bm[j+1];
				}
				i--; // �� ��ġ�� �ٽ� ���ؾ��Ѵ�
				index--; // ��ȿ�� ������ ������ �ϳ� ���δ�.
				System.out.println("�����Ǿ����ϴ�!");
			}
		}
	}
	
	// 12. ��ü ��� ��ǰ �ݾ��� ���ϴ� ���
	public double total() {
		int total = 0;
		for (int i = 0; i < index; i++) {
			total += bm[i].getPrice() * bm[i].getAmount();
		}
		return total;
	}
	
	public int getSize() {
		return index;
	}

}
