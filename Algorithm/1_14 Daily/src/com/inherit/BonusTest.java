package com.inherit;

public class BonusTest {
	
	// �Ű������� ������ ū �θ�� �޴´�.
	public void printBonus(Employee who) {
		
		// �׸��� �� Ÿ���� �ڽ�Ÿ���̶�� �ٸ��� ����
		// �� ���� ��Ӱ��谡 �ִ����� �����ؾ��Ѵ�.
		if(who instanceof Manager) {
			System.out.println("hello,,,");
		}
		System.out.println(who.getClass().getName());
		System.out.println(who.getBonus());
	}
	
//	public void printBonus(Manager who) {
//		System.out.println(who.getClass().getName());
//		System.out.println(who.getBonus());
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BonusTest bt = new BonusTest();
		Employee tom = new Employee(100, "tom", 5000);
		Manager bill = new Manager(200, "bill", 5000, 1);
		
		bt.printBonus(tom); // Employee.getBonus ȣ��
		bt.printBonus(bill); // Manager.getBonus ȣ��

	}

}
