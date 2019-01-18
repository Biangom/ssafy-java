package com.ssafy;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RegisterMgr rm = new RegisterMgr();
		MovieMgr mm = new MovieMgr();
		PersonMgr pm = new PersonMgr();
		
		pm.add(new Person(100,"�輺��",23));
		pm.add(new Person(101,"�����",25));
		pm.add(new Person(102,"�̱���",26));
		pm.add(new Person(103,"������",24));
		pm.add(new Person(104,"������",30));
		
		mm.add(new Movie("�ٶ����Բ��������",100));
		mm.add(new Movie("�μ���",200));
		mm.add(new Movie("�ָԿն���",120));
		mm.add(new Movie("����",150));
		mm.add(new Movie("�ڹ�",160));
		
		rm.add(new Register(mm.search("�μ���"), pm.search(100)));
		rm.add(new Register(mm.search("�ٶ����Բ��������"), pm.search(101)));
		rm.add(new Register(mm.search("�ָԿն���"), pm.search(102)));
		rm.add(new Register(mm.search("����"), pm.search(103)));
		rm.add(new Register(mm.search("�ڹ�"), pm.search(104)));
		
		rm.print();
		

	}

}
