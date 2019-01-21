package com.io1_21MON;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// �������� �ٶ� �����ִ� ���� �߿� �־����
public class FileCopy {
	public static void main(String[] args) {
		FileInputStream fis;
		FileOutputStream fos;
		
		// args[0] : ���� ����
		// args[1] : ���纻 ����
		
		try {
			fis = new FileInputStream(args[0]);
			fos = new FileOutputStream(args[1]);
			
			// i�� �����Ų �Ŀ� -1�� �ƴ϶�� ��� �۾�
			// ������ ���� ������ -1�� ����
			for(int i; (i = fis.read()) != -1; ) {
				fos.write(i);
				// fis�� �о �ڵ尪 = fis.read()
				// fos�� write��� �޼ҵ�� �� �ڵ忡 �ش��ϴ� '����'��  ����Ͽ� ���
			}
			
			fis.close();
			fos.close();
			
			
		} catch (Exception e) {
		
		}
		
		
	}
	
}