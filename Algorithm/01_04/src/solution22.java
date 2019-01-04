import java.util.Scanner;

// �ұ����� Ŭ����
class Point {
	int r;
	int c;
	int dir;
	boolean state = true;
}


public class solution22 {
	
	static int N; // ������ ũ��
	static int num;
	static int[][] map;

	static int[][] d = {
			{ 0, 0},
			{-1, 0}, // ��
			{ 1, 0}, // ��
			{ 0,-1},	// ��
			{ 0, 1}	// ��
			};
	
	static boolean isValid(int r, int c) {
		return !(r < 0 || r >= N || c < 0 || c >= N);
	}
	
	// cnt��ŭ dir�������� �����ϱ�
	static boolean jump(Point an, int cnt) {
		
		int jR = an.r + d[an.dir][0] * cnt;
		int jC = an.c + d[an.dir][1] * cnt;
		map[an.r][an.c] = 0;
		// ���� ���̾ false
		if(!isValid(jR,jC)) {
			return false;
		}
		// �ٴ� �ڸ��� �ִٸ� false
		if(map[jR][jC] == 1) {
			return false;
		}
		else {
			map[an.r][an.c] = 0;
			an.r = jR;
			an.c = jC;
			map[jR][jC] = 1;
			return true;
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int t_case = scan.nextInt(); 
		for(int t = 0; t < t_case; t++) {
			
			N = scan.nextInt();
			num = scan.nextInt();
			int alive = num;
			
			map = new int[N][N];
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					map[i][j] = 0;
				}			
			}
			
			Point[] animal = new Point[num];
			for(int i = 0; i < num; i++) {
				animal[i] = new Point();
			}
			
			for(int i = 0; i < num; i++) {
				int r = animal[i].r = scan.nextInt();
				int c = animal[i].c = scan.nextInt();
				animal[i].dir = scan.nextInt(); // ����
				
				// �̹� �ִٸ�
				if(map[r][c] == 1) {
					alive--;
					animal[i].state = false;
				}
				map[r][c] = 1;			
			}
			
			// ���� ��� �ұ����� �� ��ŭ ��ȸ
			for (int i = 0; i < num; i++) {
				// �̹� �����ָ� continue
				if(animal[i].state == false)
					continue;
				// �ٱ�
				// 3�� �ڴ� 3,2,1ĭ��
				for (int j = 3; j >= 1; j--) {
					
					boolean check = jump(animal[i], j);

					// ���� �浹�ؼ� �׾�����
					if(!check) {
						alive--;
						break; // ���̻� ������ �ʿ� ����.
					}				
				}
			}
			System.out.printf("#%d %d\n",t+1,alive);		
			// �߰��� ����� �� (num --)		
		}
	}

}
