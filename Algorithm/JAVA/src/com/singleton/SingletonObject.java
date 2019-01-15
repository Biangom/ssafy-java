package com.singleton;

// Singleton Pattern : �޸� �󿡼�  ������ ��ü�� �ϳ����� �����ϴ� ����������

class A {

}

public class SingletonObject {
	// ����1. �ʵ忡 private static�� �ٿ� �־����
	// static�� �ٿ��־ �޸� ����
	private static SingletonObject instance;
	
	// ����2. �����ڿ� private
	// �����ڴ� ���ο����� ȣ���ϱ� ���ؼ� private
	private SingletonObject() {
		
	}
	
	// ����3. ��ü ���� �޼ҵ�� public static����
	// ���� �޼ҵ常 public �̾����. �޼ҵ�� ��ü �����ϱ� ���ؼ�.
	// CA�� �ִ� ��ü�� ��ȯ�Ѵ�. �̹� �����Ǿ������� �Ǵٽ� �������� �ʴ´� (�ʵ尡 static�� ����)
	public static SingletonObject getInstance() {
		if(instance == null) {
			instance = new SingletonObject();
		}
		return instance;
	}
	
	public void test() {
		System.out.println("hello...");
	}
	

}
