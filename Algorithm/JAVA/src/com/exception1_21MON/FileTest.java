package com.exception1_21MON;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FileTest().go();

	}
	
	private void go() {
		hello();
	}
	
	private void hello() {
		// ���Ϸκ��� ������ �о� ���̴� �Է� ������
		try {
			FileInputStream fis = new FileInputStream("data.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); // ���� ��ô�ؼ� ȭ�鿡 �ѷ��ֱ�
		}
		
	}

}
