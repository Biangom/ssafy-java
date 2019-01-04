import java.util.Scanner;

// �ұ����� Ŭ����
class Animal {
	int r;
	int c;
	int dir;
	boolean state = true;
}


public class solution21 {
	
	static int N; // ������ ũ��
	static int num;
	static int[][] map;

	static int[][] d = {
			{ 0, 0},
			{ 1, 0}, // ��
			{ 0, 1}	// ��
	};
	
	static boolean isValid(int r, int c) {
		return !(r < 0 || r >= N || c < 0 || c >= N);
	}
	
	// cnt��ŭ dir�������� �����ϱ�
	static boolean jump(int num, Animal an, int cnt) {
		
		int jR = an.r + d[an.dir][0] * cnt;
		int jC = an.c + d[an.dir][1] * cnt;
		// ���� ���̾ false
		if(!isValid(jR,jC)) {
			// ���̸� �̵����� �ʴ´�.
			return true;
		}
		// �ٴ� �ڸ��� �ִٸ� false
		if(map[jR][jC] == 1) {
			return false;
		}
		// �װԾƴ϶�� ����!
		else {
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
			
			Animal[] animal = new Animal[num];
			for(int i = 0; i < num; i++) {
				animal[i] = new Animal();
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
xx:			for (int i = 0; i < num; i++) {
				// �̹� �����ָ� continue
				if(animal[i].state == false)
					continue;
				// �ٱ�
				// 3�� �ڴ� 3,2,1ĭ��
				for (int j = 3; j >= 1; j--) {
					
					boolean check = jump(i+1, animal[i], j);
					
					//		--------------------
							for(int zi = 0; zi < N; zi++) {
								for(int zj = 0; zj < N; zj++) {
									System.out.printf("%d ", map[zi][zj]);
								}
								System.out.println("");
							}
							System.out.println("");
					//		-------------------

					// ���� �ڸ��� �پ��ٸ�
					if(!check) {
						System.out.printf("#%d %d\n",t+1,i+1);
						break xx;
					}				
				}
				
				if( i == num - 1)
					System.out.printf("#%d %d\n",t+1,0);
			}
			
		} // end of test for
	} // end of main

}
