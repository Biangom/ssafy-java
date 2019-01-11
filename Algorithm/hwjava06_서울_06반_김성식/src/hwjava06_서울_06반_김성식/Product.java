package hwjava06_����_06��_�輺��;

public class Product {
	private String isbn; // ��ǰ��ȣ
	private String name; // ��ǰ��
	private int price; // ����
	private int amount; // ������
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String isbn, String name, int price, int amount) {
		super();
		this.isbn = isbn;
		this.name = name;
		this.price = price;
		this.amount = amount;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public String toString() {
		String str;
		str = String.format("%-10s\t|%-10s\t|%-3d\t|%-3d\t", isbn, name, price, amount);
		return str;	
	}
	
}
