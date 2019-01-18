package com.ssafy;

import java.util.ArrayList;

public class PersonMgr {
	ArrayList<Person> pm = new ArrayList<Person>();
	//Person[] am = new Person[100];
	int size;
	
	//����	
	void add(Person p) {
		pm.add(p);		
	}
	
	//�˻� , ���̵�� �˻�
	Person search(int num) {		
		for (Person person : pm) {
			if(person.getId() == num)
				return person;
		}
		return null;		
	}
	
	//�˻�, �̸����� �˻�
	Person search(String name) {
		for (Person person : pm) {
			if(person.getName().equals(name))
				return person;
		}
		return null;
	}
	
	//����, �̸��� �̸��� �Է��Ͽ� �̸� ����
	void update(String name, String str) {
		int len = pm.size();
		for (int i = 0; i < len; i++) {
			if( pm.get(i).getName().equals(name) ) {
				pm.get(i).setName(str);				
			}
		
		}
	}
	//����, �̸��� ���̸� �Է��Ͽ� �� �̸��� �ش��ϴ� ���� ����
	void update(String name, int age) {
		int len = pm.size();
		for (int i = 0; i < len; i++) {
			if( pm.get(i).getName().equals(name) ) {
				pm.get(i).setAge(age);				
			}		
		}
	}
	
	//����
	void delete(Person p) {
		pm.remove(p);
	}
}
