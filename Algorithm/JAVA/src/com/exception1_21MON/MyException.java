package com.exception1_21MON;

// ����� ���� ���� Ŭ����
// ���� : Exception ũ���� ��� �޾ƾ� ��
public class MyException extends Exception {
	
	MyException() {
		System.out.println("MyException �߻�!");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "MyException!!!";
	}
	
}
