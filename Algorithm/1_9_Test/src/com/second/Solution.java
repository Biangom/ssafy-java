package com.second;

import java.util.Arrays;
import java.util.Scanner;


//5 1000
//100 200
//300 500
//250 300
//500 1000
//400 400


class Ele {
	int v;
	int w;
}

public class Solution {
	static int[][] dp = new int[20][10001];
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int test_case = scan.nextInt();
		
		for(int t = 0; t < test_case; t++) {
			int N = scan.nextInt(); // �ܹ��� ����
			int M = scan.nextInt(); // �ܹ��� ����
			
			
			Ele[] g = new Ele[N];
			for (int i = 0; i < N; i++) {
				g[i] = new Ele();			
			}
			
			for (int i = 1; i < N; i++) {
				g[i].v = scan.nextInt();
				g[i].w = scan.nextInt();
			}
			
			for (int i = 0; i < N; i++) {
				for(int w = 0; w <= M; w++) dp[i][w] = 0;			
			}
			
			// �ʱ�ȭ
			for(int i = 0; i < 21; i++) {
				for(int j = 0; j < 1001; j++) {
					dp[i][j] = 0;
				}
			}
			
			// ó�� �ܹ���
			for(int j = 0; j <= M; j++ ) {
				// ���� ���԰� ���������ϴ� ���Ժ��� ������ ���ʿ� ���� ���� ��´�.
				if( g[0].w > j ) {
					dp[0][j] = 0;
				}
				else {
					dp[0][j] = dp[0][j-g[0].w] + g[0].v; 
			}
			
			
			// i�� �ܹ��� ����
			for(int i = 1; i < N; i++) {
				for(int j = 0; j <= M; j++ ) {
					// ���� ���԰� ���������ϴ� ���Ժ��� ������ ���ʿ� ���� ���� ��´�.
					if( g[i].w > j ) {
						dp[i][j] = dp[i-1][j];
					}
					else {
						int selected_val = dp[i-1][j-g[i].w] + g[i].v;
						int unselected_val = dp[i-1][j];
						
						dp[i][j] = selected_val > unselected_val ? 
								selected_val : unselected_val;
						dp[i][j] = Math.max(dp[i][j-g[i].w]+g[i].v, dp[i-1][j]);
					}
				}
			}	
			System.out.printf("#%d %d",t+1,dp[N][M]);
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



