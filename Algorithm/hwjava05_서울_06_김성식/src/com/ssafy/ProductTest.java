package com.ssafy;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv[] t = new Tv[4];
		Refri[] r = new Refri[4];
		t[0] = new Tv("120","����Ƽ��",498000,100,33,"�ö��");
		t[1] = new Tv("121","����Ƽ��",398000,90,34,"LCD");
		t[2] = new Tv("122","LEƼ��",412000,80,24,"LdD");
		t[3] = new Tv("123","SSƼ��",123000,70,14,"L3D");
		
		r[0] = new Refri("233","LG�ñ״�ó",898000,150,100);
		r[1] = new Refri("212","AB�ñ״�ó",123000,160,120);
		r[2] = new Refri("200","EE�ñ״�ó",456000,170,130);
		r[3] = new Refri("245","RR�ñ״�ó",222000,180,140);
		
		System.out.println("***************Ƽ�� ���***************");
		for (Tv te : t) {
			System.out.println(te.toString());			
		}
		
		
		System.out.println("***************����� ���***************");
		for (Refri refri : r) {
			System.out.println(refri.toString());
		}
		

	}

}
