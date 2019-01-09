package com.second;

/////////////////////////////////////////////////////////////////////////////////////////////
// �⺻ �����ڵ�� ���� �����ص� ���� �����ϴ�. ��, ����� ���� ����
// �Ʒ� ǥ�� ����� ���� �ʿ�� �����ϼ���.
// ǥ�� �Է� ����
// int a;
// double b;
// char g;
// String var;
// long AB;
// a = sc.nextInt();                           // int ���� 1�� �Է¹޴� ����
// b = sc.nextDouble();                        // double ���� 1�� �Է¹޴� ����
// g = sc.nextByte();                          // char ���� 1�� �Է¹޴� ����
// var = sc.next();                            // ���ڿ� 1�� �Է¹޴� ����
// AB = sc.nextLong();                         // long ���� 1�� �Է¹޴� ����
/////////////////////////////////////////////////////////////////////////////////////////////
// ǥ�� ��� ����
// int a = 0;                            
// double b = 1.0;               
// char g = 'b';
// String var = "ABCDEFG";
// long AB = 12345678901234567L;
//System.out.println(a);                       // int ���� 1�� ����ϴ� ����
//System.out.println(b); 		       						 // double ���� 1�� ����ϴ� ����
//System.out.println(g);		       						 // char ���� 1�� ����ϴ� ����
//System.out.println(var);		       				   // ���ڿ� 1�� ����ϴ� ����
//System.out.println(AB);		       				     // long ���� 1�� ����ϴ� ����
/////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;
import java.io.FileInputStream;

/*
   ����ϴ� Ŭ�������� Solution �̾�� �ϹǷ�, ������ Solution.java �� ����� ���� �����մϴ�.
   �̷��� ��Ȳ������ �����ϰ� java Solution ������� ���α׷��� �����غ� �� �ֽ��ϴ�.
 */

//
//class Ele {
//	int v;
//	int w;
//}

public class Solution1
{
    static int[][] dp = new int[21][10001];
	public static void main(String[] args) throws Exception
	{
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
			int N = scan.nextInt(); // �ܹ��� ����
			int M = scan.nextInt(); // �ܹ��� ����
			
			
			Ele[] g = new Ele[N+1];
			for (int i = 0; i < N; i++) {
				g[i] = new Ele();			
			}
			
			for (int i = 0; i < N; i++) {
				g[i].v = scan.nextInt();
				g[i].w = scan.nextInt();
			}
			
			for (int i = 0; i <= N; i++) {
				for(int w = 0; w <= M; w++) dp[i][w] = 0;			
			}
			
			// �ʱ�ȭ
			for(int i = 0; i < 20; i++) {
				for(int j = 0; j < 1001; j++) {
					dp[i][j] = 0;
				}
			}
			
			// ó�� �ܹ���
			for(int k = 0; k <= M; k++ ) {
				// ���� ���԰� ���������ϴ� ���Ժ��� ������ ���ʿ� ���� ���� ��´�.
				if( g[0].w > k ) {
					dp[0][k] = 0;
				}
				else {
					dp[0][k] = dp[0][k-g[0].w] + g[0].v; 
				}
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
			System.out.printf("#%d %d",test_case,dp[N-1][M]);
		
			/////////////////////////////////////////////////////////////////////////////////////////////
			/*
				 �� �κп� �������� �˰��� ������ ���ϴ�.
			 */
			/////////////////////////////////////////////////////////////////////////////////////////////

		}
	}
}