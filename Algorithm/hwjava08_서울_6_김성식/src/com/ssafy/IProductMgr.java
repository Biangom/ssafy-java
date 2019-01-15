package com.ssafy;

import java.util.ArrayList;

public interface IProductMgr {
	
	// 1. ������ �Է� ���
	public void add(Product p);
	
	// 2. ������ ��ü �˻� ���
	public ArrayList<Product> search();
	
	// 3. Isbn ��ȣ�� ��ǰ�� �˻�
	public ArrayList<Product> search(String num);
	
	// 4. ��ǰ������ ��ǰ�� �˻��ϴ� ���
	public ArrayList<Product> searchName(String name);
	
	// 5. Tv�� �˻��ϴ� ���
	public ArrayList<Product> searchTv();
	
	// 6. Refrigerator�� �˻��ϴ� ���
	public ArrayList<Product> searchRefrigerator();
	
	// 7. 400L�̻��� Refrigerator �˻�
	public ArrayList<Refrigerator> search400L();
	// 9. 50inch�̻��� TV �˻�
	public ArrayList<Tv> search50inch();
	// 10. ��ǰ��ȣ�� ������ �Է� �޾� ��ǰ ������ ������ �� �ִ� ���
	public void updatePrice(String num, int price);
	
	// 11. ��ǰ��ȣ�� ��ǰ�� �����ϴ� ���
	public void delete(String num);
	
	// 12. ��ü ��� ��ǰ �ݾ��� ���ϴ� ���
	public double total();
	
	public int getSize();

}
