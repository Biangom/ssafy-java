package algo;

import java.util.Iterator;
import java.util.Scanner;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		
		int data[] = {7,4,2,0,0,6,0,7,0};
		
		int maxCnt = 0; // �ִ� ����
		
		for (int i = 0; i < data.length; i++) {
			int cnt = 0; // �� ĭ�� �ڽ� ������ ī����
			for (int j = i+1; j < data.length; j++) {
				if(data[i] > data[j]) {
					cnt++;
				}
				
			}
			if (maxCnt < cnt) maxCnt = cnt;
		}
		System.out.println(maxCnt);
		

//		------------------------------
//		int arr[][] = new int[8][9];
//		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < data[i]; j++) {
//				arr[7-j][i] = 1;			
//			}			
//		}
//		
//		// ���������� 90�� ȸ��
//		int[][] nbox = new int[9][8];
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				nbox[j][7-i] = arr[i][j];
//				
//			}
//			
//		}
//		
//		int maxCnt= 0;
//		// �߷��� �Ʒ������� �߻����Ѽ� �̵� , �ؿ������� �س����ڴ�.
//		for (int i = nbox.length -2; i >= 0 ; i--) { // 9�� 8~0
//			for (int j = 0; j < nbox[i].length; j++) {
//				int cnt = 0; // nbox[i][j]�� �ڽ��� ��ĭ ���������� ������ ����
//				for(int k = 0; k < nbox.length; k++ ) {
//					// �ڽ��� ����������, �� �ڽ������ϰ� �Ʒ�ĭ�� �����̾�� �Ѵ�! index�� ��ȿ������ üũ
//					if(i+k + 1 < nbox.length && nbox[i+k][j] == 1 && nbox[i+k+1][j] == 0) {
//						nbox[i+k][j] = 0;
//						nbox[i+k+1][j] = 1;			
//						cnt++;
//						
//					}
//					if (maxCnt < cnt) maxCnt = cnt;
//				}				
//			}
//		}
//		
//		System.out.println(maxCnt);
//		// �� �ڽ����� ������ ���ϱ�
//		// �� �ڽ����� ������ �ִ��� ���ؼ� ����ϱ�
//		
		
//		int arr[][] = new int[8][9];
//		
//		for (int i = 0; i < 8; i++) {
//			for (int j = 0; j < 9; j++) {
//				arr[i][j] = scan.nextInt();	
//			}			
//		}
//		
//		for (int i = 0; i < 8; i++) {
//			for (int j = 0; j < 9; j++) {
//				System.out.print(arr[i][j]);			
//			}			
//			System.out.println("");
//		}
//		
//		int in = -1;
//		int prevIn = 0;
//		int cnt = 0;
//		int max = 0;
//		for (int i = 0; i < 8; i++) {
//			for (int j = 0; j < 9; j++) {
//				if(arr[i][j] == 1) {
//					if(in != -1) {
//						prevIn = j;
//						cnt = prevIn - in;
//						if ( max < cnt) {
//							max = cnt;
//						}
////						System.out.println(max);
//						in = prevIn;
//					}
//					else
//						in = j;
//					
//				}
//			}
//			in = -1;
//			cnt = 0;
//		}
//		System.out.println(max);
//		
		

	}

}

