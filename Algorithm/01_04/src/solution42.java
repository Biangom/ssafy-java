import java.util.Scanner;



// mouse�� ��ǥ
class Spot {
	int r;
	int c;
}

class Move {
	int dir;
	int size;
}


public class solution42 {
	
	static final int JUMPER_ARRIVE = 1;
	static final int JUMP = 2;
	static final int INVALID = 3;
	
	static boolean isValid(int r, int c, int size) {
		return !(r < 0 || r >= size || c < 0 || c >= size);
	}
	
	static int jump(int[][] map, Move move, Spot depart, int size) {
		int destR = depart.r + dir[move.dir][0] * move.size;
		int destC = depart.c + dir[move.dir][1] * move.size;
		
		// ��ȿ���� �ʴٸ�
		if( !isValid(destR, destC, size) ) {
			return INVALID;
		}
		// -1 �̸� ����
		else if(map[destR][destC] == -1 ) {
			return JUMPER_ARRIVE;
		}
		depart.r = destR;
		depart.c = destC;
		return JUMP;
	}
	
	static int dir[][] = {
			{ 0, 0},
			{ 0, 1}, // ��
			{ 0,-1}, // ��
			{ 1, 0}, // ��
			{-1, 0}  // ��
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test_case = 0;
		
		int size;
		Scanner scan = new Scanner(System.in);
		size = scan.nextInt();
		Spot depart = new Spot();
		depart.r = scan.nextInt();
		depart.c = scan.nextInt();
		int numOfJumber = scan.nextInt();
	
		Spot[] jumpArr = new Spot[numOfJumber];
		
		int[][] map = new int[size][size];
		
		for (int i = 0; i < numOfJumber; i++) {
			int row = scan.nextInt() - 1;
			int col = scan.nextInt() - 1;
			map[row][col] = -1;
		}
		
		int numOfMove = scan.nextInt();
		Move[] moveArr = new Move[numOfMove];
		for (int i = 0; i < numOfMove; i++) {
			moveArr[i] = new Move();
			moveArr[i].dir = scan.nextInt();
			moveArr[i].size = scan.nextInt();
		}
		
		// ---------------------------------
		// ���μ��� ����
		// Move�迭�� �ִ� �̵�������
		// �ϳ��� �����Ѵ�!
		for (int i = 0; i < numOfMove; i++) {
			int check = jump(map, moveArr[i], depart, size);
			if ( check == JUMPER_ARRIVE) { // ���ۿ� ���� �ߴٸ�
				System.out.printf("1#%d %d %d\n", test_case, 0, 0);
				break;
			}
			else if ( check == JUMP) {
				continue;
			}
			else if ( check == INVALID){
				System.out.printf("2#%d %d %d\n", test_case, 0, 0);
				break;
			}
			
			if( i == numOfMove - 1) {
				System.out.printf("3#%d %d %d\n", test_case, depart.r, depart.c);
			}
		}
	}
}