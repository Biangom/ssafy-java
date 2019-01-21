package com.io1_21MON;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class CharacterStreamTest {
	
	public static void main(String[] args) throws Exception {
		// character stream : �ѱ����� ������ 2byte�� ��Ƽ� ����
		
		// �ӽ� ���� ����
		File f = File.createTempFile("sample", "txt");
		// temp �����ϳ� �������
		
		//System.out.println(f);
		
		// ���Ͽ� ������ ���� ������
		// �װ� �����ٰ� ���ο� �ָ� �ϳ� ����
		FileWriter fw = new FileWriter(f); // node stream(�������� ���� ����Ǿ� ���� �۾� ����)
		BufferedWriter bw = new BufferedWriter(fw); // filter stream buffer ����� �ִ� ���� stream 
		
		
		bw.write("�ȳ��ϼ���");
		bw.newLine(); // ������ �Է�
		bw.write("���� ���� ���� �ʹ�");
		bw.newLine();
		
		bw.close();
		fw.close();
		
		// ���⼭���ʹ� ���� �о���� ���
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr); // ���ʹ� �Ϲ� ��Ʈ���� �־���Ѵ�.
		
		// InputStreamReader : InputStream Ÿ���� ��Ʈ���� Reader Ÿ���� ��Ʈ������ ���������!!
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		// ���ʹ� �Ϲ� ��Ʈ���� �־���Ѵ�. , InputStream�� Reader�������� �ٲ۴�. System.in�� ���̴�.!
		
		
		// ��Ʈ���� �־�� ������ �����ϴ�.
		for (String str; (str = br.readLine())!=null;) {
			System.out.println(str);
		}
		br.close();
		fr.close();
		
	}//end of main
}//end of class