package com.basic;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class WrapperTest {

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Hello";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 123; // �⺻��
		count++;
		//int --> Integer 
		Integer i = new Integer(count);
		// ��ü�� �ٲ���� ������ ������ �ȵȴ�.
		i++; //125�� �ȴ�. auto-unboxing�� �Ǿ� ������ �����ϰ�
		// �ٽ� auto-boxing�ؼ� Integer ��ü�� ����
		System.out.println(i);
		
		String snum = "567";
		int num = Integer.parseInt(snum);
		System.out.println(num);
		
		double d = 3.14;
		//Wrapper class�� �ٲٱ�
		
		String snum2 = "2.56";
		//snum2�� doubleŸ������ �ٲٱ�
		System.out.println(++d);
		
		WrapperTest w = new WrapperTest();
		System.out.println(w.toString());
		
		

	}

}
