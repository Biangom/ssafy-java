package com.ssafy;

import java.util.Iterator;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] b = new Book[5];
		Magazine[] m = new Magazine[5];
		
		b[0] = new Book("00001","Java ��","����","jjja.kr",19500,"�ڹٱ⺻����");
		b[1] = new Book("00002","Java ��","���߻�","jjjb.kr",24000,"c++����");
		b[2] = new Book("00003","�м�����","�̱���","kkkc.kr",56004,"SW��");
		b[3] = new Book("00004","�輳����","������","kkkd.kr",24352,"HW��");
		b[4] = new Book("00005","����м�","�輺��","kkke.kr",35212,"12��");

		m[0] = new Magazine("12344","Java�ް���!","ȫ��ȣ","java.com",2018,2,5000,"ù����");
		m[1] = new Magazine("25233","c�ް���!","ȫ��ȣ","jaaa.com",2017,2,6600);
		m[2] = new Magazine("12423","c++�ް���!","ȫ��ȣ","jada.com",2014,2,2200,"3����");
		m[3] = new Magazine("11888","J�ް���!","ȫ��ȣ","ja2a.com",2012,2,1100,"4����");
		m[4] = new Magazine("12357","Jaa�ް���!","ȫ��ȣ","j3va.com",2011,2,1500,"5����");
		
		System.out.println("*********************** ���� ��� **************************");
		for (Book book : b) {
			System.out.println(book.toString());			
		}
		
		System.out.println("*********************** ���� ��� **************************");
		for (Magazine magazine : m) {
			System.out.println(magazine.toString());
			
		}
	}

}
