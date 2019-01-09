
import java.util.Scanner;

public class solution13 {
	
	static final int MAX_NUM = 20;
	static char[][] arr;
	static int[][] cnt;
	static int N;
	
	static int[][] dir = {
			{-1, -1}, {-1, 0},  {-1, 1},
			{0, -1},			{0, 1},
			{1, -1},  {1, 0},	{1, 1}			
	};
	
	
	static boolean checkBound(int i, int j) {
		for(int k = 0; k < dir.length; k++ ) {
			if( arr[i + dir[k][0] ][j + dir[k][1] ] == 'G') 
				return false;
		}
		return true;
	}
	
	static int cntAxis(int r, int c) {
		int sum = 0;
		for(int k = 1; k <= N; k++ ) {
			if ( arr[k][c] == 'B' ) sum++;
			if ( arr[r][k] == 'B' ) sum++;
		}
		// ���� �ڸ��� 2�� ������ ������
		sum--;
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int test_case = scan.nextInt();
		for (int t = 1; t <= test_case; t++) {
			N = scan.nextInt();

			arr = new char[N+2][N+2];
			cnt = new int[N+2][N+2];
			// �迭�� ��踦 ����� ������ �ذ��ϱ� ���ؼ�
			
			// �Էº�
			for(int i = 1; i <= N; i++) {
				for(int j = 1; j <= N; j++) {
					arr[i][j] = scan.next().charAt(0);
				}
			}
			
			// ó����
			// ���� ������ȹ�� G�� ���� ��� ã��
			int max = Integer.MIN_VALUE;
			
			for(int i = 1; i <= N; i++) {
				for (int j = 1; j <= N ; j++) {
					if( arr[i][j] == 'B' ) {
						if ( checkBound(i, j) ) {
							int result = cntAxis(i,j);
							System.out.println(result);
							if ( max < result)
								max = result;
						}
					}
					
				}
			}
			
			System.out.println("#" + t + " " + max);


		}
	}
}
