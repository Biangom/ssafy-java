package com.first;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int test_case = scan.nextInt();
		
		for(int t = 0; t < test_case; t++) {
			String input;
			input = scan.next();
			
			//��� �Է¹޴ٰ� �������� �ٸ��� ++
			char first = input.charAt(input.length() - 1); //�ʱⰪ
			int cnt = 0; // ��� �����ؾ��� ���� ���� ����
			for (int i = input.length() - 1 ; i >= 0 ; i--) {
				if(first != input.charAt(i)) {
					cnt++;
					first = input.charAt(i);
				}
				if(i == 0) {
					if(input.charAt(i) == '1') {
						cnt++;
					}
				}
			}			
			System.out.printf("#%d %d\n",t+1,cnt);			
		}
	}
}
