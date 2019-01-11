package hwjava06_����_06��_�輺��;

public class ProductMgr {
	private Product[] products = new Product[100];
	private int index;
	
	public void add(Product p) {
		products[index++] = p;		
	}
	
	public Product[] search() {
		return products;
	}
	
	// 3. ��ǰ ��ȣ�� ��ǰ�� �˻�
	public Product[] search(String isbn) {
		Product[] temp = new Product[100];
		int tempCnt = 0;
		for (int i = 0; i < index; i++) {
			if(products[i].getIsbn().equals(isbn)) 
				temp[tempCnt++] = products[i];
		}
		return temp;
	}
	
	// 4. ��ǰ������ ��ǰ�� �˻��ϴ� ���
	public Product[] searchName(String name) {
		Product[] temp = new Product[100];
		int tempCnt = 0;
		for (int i = 0; i < index; i++) {
			if(products[i].getName().equals(name)) 
				temp[tempCnt++] = products[i];
		}
		return temp;		
	}
	
	// 5. ��ǰ��ȣ�� ������ �Է� �޾� ��ǰ������ ����
	public void update(String isbn, int price) {
		for (int i = 0; i < index; i++) {
			if(products[i].getIsbn().equals(isbn)) 
				products[i].setPrice(price);
		}
	}
	
	// 6. ��ǰ��ȣ�� ��ǰ�� �����ϴ� ���
	public void delete(String isbn) {
		for (int i = 0; i < index; i++) {
			// ��ġ�Ѵٸ� ������ �����
			if(products[i].getIsbn().equals(isbn)) {
				
				// ����� �۾�
				for(int j = i; j < index-1; j++) {
					products[j] = products[j+1];
				}
				i--; // �� ��ġ�� �ٽ� ���ؾ��Ѵ�
				index--; // ��ȿ�� ������ ������ �ϳ� ���δ�.
				System.out.println("�����Ǿ����ϴ�!");
			}
		}
	}
	
	// 7. ��ü ��� ��ǰ �ݾ��� ���ϴ� ���
	public int total() {
		int sum = 0;
		for (int i = 0; i < index; i++) {
			Product p = products[i];
			sum += p.getAmount() * p.getPrice();	
		}
		return sum;
	}
	
	public int getSize() {
		return index;
	}

}
