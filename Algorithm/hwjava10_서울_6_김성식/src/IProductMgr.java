

import java.util.ArrayList;

public interface IProductMgr {
	
	// 1. ������ �Է� ���
	public void add(Product p) throws DuplicateException;
	
	// 2. ������ ��ü �˻� ���
	public ArrayList<Product> search();
	
	// 3. Isbn ��ȣ�� ��ǰ�� �˻�
	public ArrayList<Product> search(String num) throws CodeNotFoundException;
	
	// 4. ��ǰ������ ��ǰ�� �˻��ϴ� ���
	public ArrayList<Product> searchName(String name);
	
	// 5. Tv�� �˻��ϴ� ���
	public ArrayList<Product> searchTv();
	
	// 6. Refrigerator�� �˻��ϴ� ���
	public ArrayList<Product> searchRefrigerator();
	
	// 7. 400L�̻��� Refrigerator �˻�
	public ArrayList<Refrigerator> search400L() throws ProductNotFoundException;
	// 9. 50inch�̻��� TV �˻�
	public ArrayList<Tv> search50inch() throws ProductNotFoundException;
	// 10. ��ǰ��ȣ�� ������ �Է� �޾� ��ǰ ������ ������ �� �ִ� ���
	public void updatePrice(String num, int price);
	
	// 11. ��ǰ��ȣ�� ��ǰ�� �����ϴ� ���
	public void delete(String num);
	
	// 12. ��ü ��� ��ǰ �ݾ��� ���ϴ� ���
	public double total();
	
	// 13.
	public void close();
	
	// 14.
	public void open();
	
	public int getSize();

}
