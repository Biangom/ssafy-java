package algo;

/*
 * �ڹ�����
 */

public class Z16_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// overloading �����ε�  : �ϳ�(����)�� Ŭ���� ������ �Ȱ��� �̸��� �޼����, �����ڸ� ��� 
		// overriding �������̵� : �� Ŭ���� (�θ�-�ڽ�) ���迡�� �θ�Ŭ������ �޼��带 �ڽ�Ŭ�������� ������ �ϴ� ���
		
		// abstract class�� ��ü�����Ұ�
		
	} // end of main
} // end of class


// ��Ű���� : ù���� �ҹ���
// �������̽��� : ùŬ�ڴ빮��, ~able
// Ŭ������ : ù���� �빮��
// �����ڸ� : ù���� �빮�� ()
// �޼���� : ù���� �ҹ��� ()
// ������ : ù���� �ҹ���

interface Movable {
	void move();
}

interface Fightable {
	void fight();
}

interface Attackable extends Movable, Fightable { // �������̽� ������ ���߻���� ����
	
}

class Attack implements Attackable {

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fight() {
		// TODO Auto-generated method stub
		
	}
	
	
}


interface Testable { // �˸��̴� �ϳ��� ���� ������ �����, (����� �߻�޼��常 ���԰���)
//	int b; �̰� �ȵ�
	// ������ �����ڴ� �����Ϸ��� �߰����ش�.
	int a = 3; // �̰� �� (public static final)�� �����Ȱ� ****************** ����
	public static final int b = 4; // ���
	
	abstract void p();
	void q(); // ������ �����ڴ� �����Ϸ��� �߰����ش�. 
	
}


abstract class Men {
	int a;
	static int b;
	abstract void p(); // ����θ� �ۼ��� �޼���� �߻�޼�����Ѵ�.
	// �߻�޼��尡 �ϳ��� ������ abstract Ŭ������ �ȴ�! *************** ����
	void q() {
		
	}
	
}

class ManMan extends Men {

	@Override
	void p() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}


