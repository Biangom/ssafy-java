package com.basic;

public class StaticTest {
	// static�� ��ü ������ �ʾƵ� ��� ����
	static int scount; // ������ ���������� static, Ŭ���� ����, ��ü�� ���� ������, class area�� ����
	// runtime ���� �̹� �������
	int count = 3; // �ν��Ͻ�(��ü) ����, ��ü �ȿ��� ������, heap�� ����, runtime �߿� �������

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticTest s1 = new StaticTest();
		StaticTest s2 = new StaticTest();		
		StaticTest s3 = new StaticTest();
		
		int count = 5;
		
		System.out.println(count);
		
		System.out.println(StaticTest.scount);
		System.out.println(++s1.scount);
		System.out.println(++s2.scount);
		System.out.println(++s1.scount);
		
		

	}

}
