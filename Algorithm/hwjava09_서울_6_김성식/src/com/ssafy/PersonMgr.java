package com.ssafy;

import java.util.ArrayList;

public class PersonMgr implements Manageable<Person> {
	ArrayList<Person> list = new ArrayList<Person>();
	//Person[] am = new Person[100];
	int size;
	
	//����	
	public void add(Person p) {
		list.add(p);		
	}
	
	//�˻� , ���̵�� �˻�
	public Person search(int num) {		
		for (Person person : list) {
			if(person.getId() == num)
				return person;
		}
		return null;		
	}
	
	//�˻�, �̸����� �˻�
	public Person search(String name) {
		for (Person person : list) {
			if(person.getName().equals(name))
				return person;
		}
		return null;
	}
	//�˻�, ��ü�� �Է¹޾� id�� ��ȯ
	public int search(Person p) {
		for (Person person : list) {
			if(person.equals(p))
				return person.getId();
		}
		return -1;
	}
	
	//����, �̸��� �̸��� �Է��Ͽ� �̸� ����
	void update(String name, String str) {
		int len = list.size();
		for (int i = 0; i < len; i++) {
			if( list.get(i).getName().equals(name) ) {
				list.get(i).setName(str);				
			}
		
		}
	}
	//����, �̸��� ���̸� �Է��Ͽ� �� �̸��� �ش��ϴ� ���� ����
	void update(String name, int age) {
		int len = list.size();
		for (int i = 0; i < len; i++) {
			if( list.get(i).getName().equals(name) ) {
				list.get(i).setAge(age);				
			}		
		}
	}
	
	//��ü ���
	void info() {
		for (Person person : list) {
			System.out.println(person.toString());
		}
	}
	
	//����
	public void delete(String s) {
		for (Person person : list) {
			if(person.getName().equals(s)) {
				list.remove(person);
				System.out.println("���� �Ϸ�!");
				return;
			}
		}
	}
}
