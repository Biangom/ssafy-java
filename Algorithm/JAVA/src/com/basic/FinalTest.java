package com.basic;

// ��� �Ұ�
final class Test{}

// public class FinalTest extends Test {
// public class FinalTest extends String {
// ������ ���� ����.

class Test2{
	// overriding�� �ȵ�
	final void go() {}
	void stop() {}
}

public class FinalTest extends Test2{
	// final field : �� ������ �ȵ�.
	static final int x = 90;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalTest t = new FinalTest();

	}

}
