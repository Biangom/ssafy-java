package com.ssafy;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book("21424","Java ��","����","jjjj.kr",19800,"�ڹٱ⺻����");
		Book b2 = new Book("35355","�м�����","�̱���","kkkk.kr",39800,"SW��");

		Magazine m = new Magazine("12345","Java�ް���!","ȫ��ȣ","java.com",2018,2,8000,"ù����");
		
		System.out.println("*********************** �������**************************");
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		System.out.println(m.toString());
	}

}
