package com.ssafy;

import java.util.Scanner;

public class MovieTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		MovieMgr m = new MovieMgr();
		
		m.add(new Movie("��Ƽ ���� ��","īƼ�� ����",9,"���","����ִ� ��ȭ�̴�."));
		m.add(new Movie("������ ����","���� �轼",8,"���","��̾��� ��ȭ�̴�."));
		m.add(new Movie("�� �ǽ� ����","�ٴϽ� Ÿ���ġ",7,"��Ÿ��","���� ��ȭ�̴�."));
		m.add(new Movie("�׳࿡��","�˸𵵹�Ʈ",10,"����","�ű��� ��ȭ�̴�."));
		m.add(new Movie("���þ� ����","�������",1,"����","������ ��ȭ�̴�."));
		m.add(new Movie("���� �� �ݷ�����","����Ŭ ����",2,"����","���̰����� ��ȭ�̴�."));
		m.add(new Movie("�õ�ξ�","������",3,"����","������ �ִ� ��ȭ�̴�."));
		
		while(true) {
			System.out.println("<<< ��ȭ ���� ���α׷� >>>");
			System.out.println("1. ��ȭ ���� �Է�");
			System.out.println("2. ��ȭ ���� ��ü �˻�");
			System.out.println("3. ��ȭ�� �˻�");
			System.out.println("4. ��ȭ �帣�� �˻�");
			System.out.println("5. ��ȭ ���� ����");
			System.out.println("6. ��ȭ ������ �˻�");
			System.out.println("0. ����");
			System.out.print("���ϴ� ��ȣ�� �����ϼ���. ");
			int select = scan.nextInt();
			scan.nextLine();
			String str; // �Է¹޴� ���ڿ�
			Movie[] temp; // ������ �����ϴ� Movie�迭
			
			switch(select) {
			case 1: // 1. ��ȭ ���� �Է�
//				������ �����
//				�輺��
//				10
//				���
//				����մ�.
				Movie t = new Movie();
				System.out.print("����  >> ");
				t.setTitle(scan.nextLine());
				System.out.print("���� >> ");
				t.setDirector(scan.nextLine()); 
				System.out.print("���� >> ");
				t.setGrade(scan.nextInt());
				scan.nextLine();
				System.out.print("�帣 >> ");
				t.setGenre(scan.nextLine());
				System.out.print("��� >> ");
				t.setSummary(scan.nextLine());
				m.add(t);
				
				break;
			case 2: // 2. ��ȭ ���� ��ü �˻�
				temp = m.search();
				for(int i = 0; i < m.getSize() ; i++) {
					System.out.println(temp[i].toString());					
				}
				break;
			case 3: // 3. ��ȭ�� �˻�
				System.out.print("��ȭ���� �˻��ϼ��� : ");
				str = scan.next();
				temp = m.search(str);
				for(int i = 0; temp[i] != null; i++) {
					System.out.println(temp[i].toString());					
				}
				break;
			case 4: // 4. ��ȭ �帣�� �˻�
				System.out.print("��ȭ �帣�� �˻��ϼ��� : ");
				str = scan.next();
				temp = m.searchGenre(str);
				for(int i = 0; temp[i] != null; i++) {
					System.out.println(temp[i].toString());					
				}
				break;
			case 5: // 5. ��ȭ ���� ����
				System.out.print("��ȭ ������ �Է��ϼ��� : ");
				str = scan.nextLine();
				m.delete(str);
	
				break;
			case 6: // 6. ��ȭ ���� �˻�
				System.out.print("��ȭ ������ �Է��ϼ��� : ");
				str = scan.next();
				temp = m.searchDirector(str);
				for(int i = 0; temp[i] != null; i++) {
					System.out.println(temp[i].toString());					
				}
				break;
				
			case 0: // 0 ����
				System.exit(0);
				break;
			default:
				System.out.println("�ٸ� ��ȣ�� �Է��ϼ���");
			}
			
			System.out.println("");
		} // end of while

	} // end of main 

} // end of class
