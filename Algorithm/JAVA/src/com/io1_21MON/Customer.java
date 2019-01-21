package com.io1_21MON;

import java.io.Serializable;

// ��ü�� ��Ʈ���� ���� �̵��� �� �ʿ� ���� : ����ȭ(Serialization)�� �Ǿ��־����
// Serializable �������̽� �������ָ� ��
// ����ȭ : ��ü ���� ��� �����͸� ����Ʈ �迭�� ��ȯ���� �̵��� ����
public class Customer implements Serializable { // Customer�� ����ȭ ��ü�� ��
	private int num;
	private String name;
	private String address;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(int num, String name, String address) {
		this.num = num;
		this.name = name;
		this.address = address;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
