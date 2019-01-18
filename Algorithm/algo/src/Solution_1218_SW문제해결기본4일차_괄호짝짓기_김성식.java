import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Solution_1218_SW문제해결기본4일차_괄호짝짓기_김성식 {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		for(int t = 1; t <= 10; t++) {
			Stack<Character> st = new Stack<Character>();
			
			int p = scan.nextInt();
			
			String s = scan.next();
			
			int len = s.length();
			for (int i = 0; i < len; i++) {
				char c = s.charAt(i);
				// 넣어야 할게 닫힌과로면
				// 현재 맨 꼭대기가 열린괄호인지 확인 후 pop한다!
				if ( c == ')') {
					if(!st.empty() ) {
						char pkc = st.peek();
						if(pkc == '(')
							st.pop();	
						else
							break;
					}			
				}
				else if ( c == '}') {
					if(!st.empty() ) {
						char pkc = st.peek();
						if(pkc == '{')
							st.pop();	
						else
							break;
					}	
				}
				else if ( c == ']') {
					if(!st.empty() ) {
						char pkc = st.peek();
						if(pkc == '[')
							st.pop();	
						else
							break;
					}
				}
				else if ( c == '>') {
					if(!st.empty() ) {
						char pkc = st.peek();
						if(pkc == '<')
							st.pop();	
						else
							break;
					}
				}
				else {
					st.push(c);					
				}		
			}
			
			// 비어있찌 않다면 무효한거
			if(!st.empty())
				// 무효함
				System.out.printf("#%d 0\n",t);
			else
				System.out.printf("#%d 1\n",t);
		}			
	} // end of main
} // end of class
