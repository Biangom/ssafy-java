package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * �ڹ� ��!!
 *
 */

// Tip!!!!!

public class Z09_Source {

	public static void main(String[] args) throws IOException {
		// ���� ū ���
		// Scanner�� BufferRead�� �ٲٴ°� ���� ������.
		
		// 1���� ��� **********************
		
		Scanner sc = new Scanner(System.in);
//		sc.nextLine(); // ���Ͱ��Էµɋ����� ������ ���������
		
		// ���⼭���ʹ� ���͸� ���ܳ��´�. �׷��� nextLine���� �����ؾ���
//		sc.next();
//		sc.nextInt(); // �տ� white space�� �����ϰ� �� �����. ���ʹ� ���ܳ�!!
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//br.readLine();
//		for(int i = 0; i < 10; i++ ) {
//			int in = br.read() - '0';
//			System.out.printf("%3d",in);
//			
//			
//		}
		
		
		
		// 2��° ��� *********************
		
		
		// Scanner => BufferedReader
		
//		System.out.println(); 
		String ss = "";
		ss += "sdfsdf\n";
		ss += "�ι�����\n";
		System.out.println(ss);
		
		
		
		// 3���� ��� ***********������ ���������� �ð� �پ��� �� 1/10ũ�� ������ �پ��
		// ���ڿ� �ɰ���
		String str = "���� ȣ���� �� ��� �ٳ��� ����";
		String[] srr = str.split(" "); // �����ڷ� �ɰ�
		System.out.println(Arrays.toString(srr));
		
		StringTokenizer st = new StringTokenizer(str, " ");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		//System.out.println(Arrays.toString(st));
		
		
		// br�� �о������ split���� ¥����
		// parsint�� ���־���Ѵ�.
		String s = "1 2 3";
		for (int i = 0; i < s.length(); i+=2) {
			System.out.println(s.charAt(i) - '0');
		}
		
		String ss1[] = s.split(" ");
		for (int i = 0; i < ss1.length; i++) {
			System.out.println(Integer.parseInt(ss1[i]));
			
		}
		
	} // end of main
} // end of class
