package com.exception1_21MON;

public class ThreadTest {

// checked exception��. 
	// �̷��� exception�� non-Runtime exception��
	public static void main(String[] args) {
		Thread t = new Thread();

		try {
			t.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // ���α׷� ������ �־��� �ð����� ��� ���ߴ� �޼ҵ�
		System.out.println("hello, world");
		
		try {
			t.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
