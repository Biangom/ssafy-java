package com.exception1_21MON;

public class ArrayTest {

	public static void main(String[] args) {
		int[] ar = { 1, 2, 3, 4, 5 };

		try {
			for (int i = 0; i <= ar.length; i++) {
				System.out.println(ar[i] + ": hello");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// e: �߻��� ���� ������ ��� �ִ� ����
//			System.out.println("-----------------");
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//			System.out.println("�ε��� ��Ż�ƴ� ���~");
//			try {
//				System.out.println("!");
//				System.out.println(ar[5]);
//			} catch (ArrayIndexOutOfBoundsException t) {
//				System.out.println("@");
//				System.out.println(ar[5]);
//			}
//			finally { // ���� �߻����ο� ������� �Ź� ����Ǵ� ��
//				System.out.println("finally...");				
//			}
//		

		}
		
		System.out.println(ar[5]);

		System.out.println("done...");

	}
}
