package algo;
/**
 * �ڹ�����1
 * @author student
 *
 */
public class Z15_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� : �⺻��, ������
		String s = "c";
		switch (s) { // ���ǰ� : int, String
		case "d":
			System.out.println("hello");
			break;
		case "e":
			break;
		case "c":
			System.out.println("hellc");
			break;
		default:
			break;	
		}
		
		Boy boy = new Boy(26, "���α�");
		System.out.println(boy.name);
/*
		switch�� �ѹ��� �����´�
		case "c"�� �ѹ��� ������!
*/
		CC c = new CC();
		c.pp();
		
	} // end of main
} // end of class

// class�� ����� �� �ִ� ���������� public, default
class Boy { // fields, �������� : Ŭ���� ���� && �޼��� �ٱ��ʿ� ������ ����, ��Ÿ���� �ʱⰪ���� �ʱ�ȭ�ȴ�.
	int age;
	String name = ""; // null
	// ���ڿ��� �ִ°� ���α׷��� ����
	
	// ��� Ŭ�������� �ݵ�� �ϳ� �̻��� �����ڰ� �־�� �Ѵ�.
	// �����ڸ� �ϳ��� �ۼ����� ������, �����Ϸ��� �⺻ �����ڸ� �߰����ش�.
	// �����ڸ� ���� �ۼ��ϸ�, �����Ϸ��� ���ƽ� �⺻ �����ڸ� �߰������� �ʴ´�.
	
	// �����ڴ� Ŭ������� ������ �̸��� ����. ���� ���� �� �� ����.
	// public �� modifier�� �Ѵ�. (������)
	// ��ü�� ������ ������ ������� �ѹ��� ȣ���, �ν��Ͻ��������� �ʱ�ȭ �۾��� �ַ� ���
	public Boy() { // �⺻ ������ : �Ű������� �ϳ��� ���� ������
		this(1,"ȫ�浿"); // ���� Ŭ������ �Ǵٸ� ������ ȣ��, ������ ù���ῡ �־����
		int z = 3;
		
	}
	
	// ��� �������� ù��° �ٿ��� �� �ٸ� �����ڸ� ȣ���ؾ� �Ѵ�.!!
	// �����ڿ��� �ٸ� �����ڸ� ȣ������ ������, �����Ϸ��� �θ��� �⺻ �����ڸ� ȣ���ϴ� super();
	// �� ������ �ش�.
	public Boy(int age, String name) {
		super(); // �θ��� �⺻������ ȣ��, �̰Ͷ��� ù�ٿ� �����ؾ��Ѵ�.
		this.age = age;
		this.name = name;
	}
	
	
}

// this : �� �ڽ��� ��ü�� ����Ű�� ��������
// super : �θ��� ��ü�� ����Ű�� ��������
class GP{
	int x = 40;
	public int getX() {
		return x;
	}
}
class PP extends GP {
	int x = 30;
	// ���� �����ڸ� �������� ������ �⺻�����ڸ� ���� �Ǿ��ִµ�
	// ����� ���� �����ڸ� ����� �⺻�����ڰ� ���ǵ��� ����
	// �׷��� �⺻�����ڸ� ���� �����������(����� ���� �����ڸ� ������� ���)
	PP(int a ) {
		
	}
	PP () {}
	
	public int getX() {
		return x;
	}
	public int getX(int i) {
		return i;
	}
	
}
class CC extends PP{ // this, super Ű����
	int x = 20;
	
	void pp () {
		int x = 1;
		// ���� �⺻ ��Ģ : ������ ��ġ���� ����� ���� ����� ������ �����Ѵ�.
		// �������� > �������� > �θ� > �ҹ貨 ������� ������ �����Ѵ�!
		x = 50;

		System.out.println(x);
		System.out.println(this.x); // ���� �������� �̻��� ����� ������ �� �ִ�.
		System.out.println(super.x);
		System.out.println(this.getX());
	}
}

