package com.basic;

// Ŭ���� �ȿ� �߻� �޼ҵ尡 �ֵ��� Ŭ������ �߻��� �Ǿ�� ��. �̿ϼ� Ŭ����

// �߻� Ŭ������ ��� �޴� �ڽ� Ŭ������ ����� �� �ڽ� Ŭ�������� �θ� ������ �ִ�
// �̿ϼ��� �߻� �޼ҵ带 �ϼ�(����, implement) ���� ������
abstract class AbstractClass{	
	// �߻� �޼ҵ� : �޼ҵ��� �ٵ�({})�� ����. �̿ϼ� �޼ҵ�. �ڽ��� �������־����.	
	abstract public void hello();	
	public void go() {}	
}

class MyAbstractClass extends AbstractClass{

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("hello, abstract class....");
		
	}
	
}



public class AbsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyAbstractClass c = new MyAbstractClass();
		c.hello();

	}

}
