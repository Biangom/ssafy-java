package com.ssafy;


public class BookManager {
	private Book[] bm = new Book[100];
	private int index;
	
	
	// 1. ������ �Է� ���
	public void add(Book p) {
		bm[index++] = p;		
	}
	
	// 2. ������ ��ü �˻� ���
	public Book[] search() {
		return bm;
	}
	
	// 3. Isbn ��ȣ�� ��ǰ�� �˻�
	public Book[] search(String isbn) {
		Book[] temp = new Book[100];
		int tempCnt = 0;
		for (int i = 0; i < index; i++) {
			if(bm[i].getIsbn().equals(isbn)) 
				temp[tempCnt++] = bm[i];
		}
		return temp;
	}
	
	// 4. Title ���� ��ǰ�� �˻��ϴ� ���
	public Book[] searchName(String name) {
		Book[] temp = new Book[100];
		int tempCnt = 0;
		for (int i = 0; i < index; i++) {
			if(bm[i].getTitle().contains(name)) 
				temp[tempCnt++] = bm[i];
		}
		return temp;		
	}
	
	// 5. Book�� �˻��ϴ� ���
	public Book[] searchBook() {
		Book[] temp = new Book[100];
		int tempCnt = 0;
		for (int i = 0; i < index; i++) {
			if(bm[i] instanceof Magazine) continue;
			temp[tempCnt++] = bm[i];
		}
		return temp;
	}
	
	// 6. Magazine�� �˻��ϴ� ���
	public Book[] searchMagazine() {
		Book[] temp = new Book[100];
		int tempCnt = 0;
		for (int i = 0; i < index; i++) {
			if(bm[i] instanceof Magazine) {
				temp[tempCnt++] = bm[i];
			}
		}
		return temp;
	}
	
	// 7. Magazine�� ���� ������ �˻��ϴ� ���
	public Magazine[] searchYear(int n) {
		Magazine[] temp = new Magazine[100];
		int tempCnt = 0;
		for (int i = 0; i < index; i++) {
			if(bm[i] instanceof Magazine) {
				Magazine t = (Magazine)bm[i];
				if (t.getYear() == n)
					temp[tempCnt++] = t;
			}
		}
		return temp;
	}
	
	// 8. ���ǻ�� �˻��ϴ� ���
	public Book[] searchPub(String pub) {
		Book[] temp = new Book[100];
		int tempCnt = 0;
		for (int i = 0; i < index; i++) {
			if(bm[i].getPublisher().equals(pub)) {
				temp[tempCnt++] = bm[i];
			}
		}
		return temp;
	}
	
	// 9. �������� �˻� ���
	public Book[] searchPrice(int price) {
		Book[] temp = new Book[100];
		int tempCnt = 0;
		for (int i = 0; i < index; i++) {
			if(bm[i].getPrice() < price) {
				temp[tempCnt++] = bm[i];
			}
		}
		return temp;
	}
	
	// 10. ����� ��� ������ �ݾ� �հ踦 ���ϴ±��
	public int totalPrice() {
		int total = 0;
		for (int i = 0; i < index; i++) {
			total += bm[i].getPrice();
		}
		return total;
	}
	
	// 11. ����� ��� ������ �ݾ� ����� ���ϴ� ���
	public double totalAverage() {
		int total = totalPrice();
		double avg = (double)total / index;
		return avg;
	}
	
	public int getSize() {
		return index;
	}

	
}
