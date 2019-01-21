package com.second;

import java.util.Arrays;
import java.util.Scanner;


//5 1000
//100 200
//300 500
//250 300
//500 1000
//400 400

abstract class Test {
	
}

class Subtest extends Test {
	
}


class Ele {
	int v;
	int w;
}

public class Solution {
	static int[][] dp = new int[21][10001];
	public static void main(String args[]) throws Exception
	{
		
//		Test t = new Subtest();
//		Test t = new Test();
		/*
		   �Ʒ��� �޼ҵ� ȣ���� ������ ǥ�� �Է�(Ű����) ��� input.txt ���Ϸκ��� �о���ڴٴ� �ǹ��� �ڵ��Դϴ�.
		   �������� �ۼ��� �ڵ带 �׽�Ʈ �� ��, ���Ǹ� ���ؼ� input.txt�� �Է��� ������ ��,
		   �� �ڵ带 ���α׷��� ó�� �κп� �߰��ϸ� ���� �Է��� ������ �� ǥ�� �Է� ��� ���Ϸκ��� �Է��� �޾ƿ� �� �ֽ��ϴ�.
		   ���� �׽�Ʈ�� ������ ������ �Ʒ� �ּ��� ����� �� �޼ҵ带 ����ϼŵ� �����ϴ�.
		   ��, ä���� ���� �ڵ带 �����Ͻ� ������ �ݵ�� �� �޼ҵ带 ����ų� �ּ� ó�� �ϼž� �մϴ�.
		 */
		//System.setIn(new FileInputStream("res/input.txt"));

		/*
		   ǥ���Է� System.in ���κ��� ��ĳ�ʸ� ����� �����͸� �о�ɴϴ�.
		 */
		Scanner scan = new Scanner(System.in);
		int T;
		T=scan.nextInt();
		/*
		   ���� ���� �׽�Ʈ ���̽��� �־����Ƿ�, ������ ó���մϴ�.
		*/
        

		for(int test_case = 1; test_case <= T; test_case++)
		{
		
			int N = scan.nextInt();
			int M = scan.nextInt();
			Ele[] g = new Ele[N+1];
			for (int i = 0; i <= N; i++) {
				g[i] = new Ele();			
			}
			
			for (int i = 1; i <= N; i++) {
				g[i].v = scan.nextInt();
				g[i].w = scan.nextInt();
			}
			
			for (int i = 0; i <= N; i++) {
				for(int w = 0; w <= M; w++) dp[i][w] = 0;			
			}
			
			for(int i = 1; i <= N; i++) {
				for(int w = 0; w <= M; w++) {
//					System.out.println(i + " " + w);
					// ���� �ش��ϴ� j�� ���� �� �ִٸ�
					if(g[i].w > w) {
						dp[i][w] = dp[i-1][w]; 
					}
					else {
						int selected_val = dp[i-1][w-g[i].w] + g[i].v;
						int unselected_val = dp[i-1][w];
						
						dp[i][w] = selected_val > unselected_val ? 
								selected_val : unselected_val;
						
					}
					
				}
			}
			
			System.out.printf("#%d %d\n",test_case,dp[N][M]);

		}
	}
}



//for(int i = 1; i <= N; i++) {
//for(int w = 0; w <= M; w++) {
////	System.out.println(i + " " + w);
//	// ���� �ش��ϴ� j�� ���� �� �ִٸ�
//	if(g[i].w > w) {
//		dp[i][w] = dp[i-1][w]; 
//	}
//	else {
//		int selected_val = dp[i-1][w-g[i].w] + g[i].v;
//		int unselected_val = dp[i-1][w];
//		
//		dp[i][w] = selected_val > unselected_val ? 
//				selected_val : unselected_val;
//		
//	}
//	
//}
//}



