package algo;

import java.util.Arrays;

/**
 * 
 * ���̺��� Ž����
 * 6���� ����ī�忡�� ���� ���ڸ� ī����
 * 
 * @author student
 *
 */

public class Z05_GreedyBabygin {
	
	static final int MOVE = 2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {4,4,4,3,4,1};
		int[] cnt = new int[12];
		
		for (int i = 0; i < num.length; i++) {
			cnt[ num[i]]++;
		}
		System.out.println(Arrays.toString(cnt));
		
		boolean triple = false;
		boolean run = false;
		
		
		
		for (int i = 0; i < 10; i++) {

			if(cnt[i] >= 3) {
				cnt[i ] = cnt[i] - 3;
				System.out.println("Ʈ���÷�");
				triple = true;
			}
			if(cnt[i] >=1 && cnt[i+1] >= 1 && cnt[i+2] >= 1) {
				System.out.println("��");
				run = true;
				cnt[i]--;
				cnt[i+1]--;
				cnt[i+2]--;			
			}
		}

//		for (int i = 0; i < cnt.length; i++) {
//
//			if(cnt[i] >= 3) {
//				cnt[i ] = cnt[i] - 3;
//				triple = true;
//				
//				if(i - 1 >= 0 && i + 1 < cnt.length) {
//					if(cnt[i-1] >=1 && cnt[i] >= 1 && cnt[i+1] >= 1)
//						run = true;
//				}
//				
//				
//			}
//		}
		
		
		//System.out.println(Arrays.toString(cnt));
		

		if(triple && run)
			System.out.println("Babygin!!");

	} // end of main
} // end of class
