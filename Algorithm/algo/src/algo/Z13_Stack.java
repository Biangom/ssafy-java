package algo;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

/**
 * 
 * Stack : LIFO ���� ����
 * 
 * 
 * 
 */

public class Z13_Stack {
	static char[][] pair = {
		{'(',')'},
		{'{','}'},
		{'[',']'}		
	};
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stack<Character> st = new Stack<Character>();
		
		String s = scan.next();
		
		int len = s.length();
		for (int i = 0; i < len; i++) {
			char c = s.charAt(i);
			// �־�� �Ұ� �������θ�
			// ���� �� ����Ⱑ ������ȣ���� Ȯ�� �� pop�Ѵ�!
			if ( c == ')') {
				if(!st.empty() ) {
					char pkc = st.peek();
					if(pkc == '(')
						st.pop();						
				}
		
			}
			else if ( c == '}') {
				if(!st.empty() ) {
					char pkc = st.peek();
					if(pkc == '{')
						st.pop();		
				}
				
			}
			else if ( c == ']') {
				if(!st.empty() ) {
					char pkc = st.peek();
					if(pkc == '[')
						st.pop();	
				}
			}
			else
				st.push(c);		
		}

		if(!st.empty())
			System.out.println("��ȣ�� ����� ������ �ʾҽ��ϴ�.");
		else
			System.out.println("��ȣ�� ����� ���� ����");
		
		
		
		
		
	} // end of main


} // end of class
