package com.ssafy;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		IProductManagerImpl pm = new IProductManagerImpl();
		
		// ��ǰ��ȣ, �̸�, ����, ����, ��ġ, Ÿ��
		pm.add( new Tv("120","����Ƽ��",20000,100,53,"�ö��"));
		pm.add( new Tv("121","����Ƽ��",30000,90,60,"LCD"));
		pm.add( new Tv("122","LEƼ��",40000,80,24,"LdD"));
		pm.add( new Tv("123","SSƼ��",13000,70,14,"L3D"));
		
		// ��ǰ��ȣ, �̸�, ����, ����, �뷮
		pm.add( new Refrigerator("233","LG�ñ״�ó",20000,150,500));
		pm.add( new Refrigerator("212","AB�ñ״�ó",50000,160,600));
		pm.add( new Refrigerator("200","EE�ñ״�ó",60000,170,300));
		pm.add( new Refrigerator("245","RR�ñ״�ó",70000,180,350));
		
		while(true) {
			System.out.println("<<< å ���� ���α׷� >>>");
			System.out.println("1. ��ǰ ���� ��ü �˻�");
			System.out.println("2. ��ǰ��ȣ�� ��ǰ�� �˻�");
			System.out.println("3. ��ǰ������ ��ǰ�� �˻�");
			System.out.println("4. Tv������ �˻�");
			System.out.println("5. Refrigerator�� �˻�");
			System.out.println("6. 400L�̻��� Refri�˻�");
			System.out.println("7. 50inch�̻��� tv �˻�");
			System.out.println("8. ��ǰ��ȣ�� ���� �Է¹޾� ���� ����");
			System.out.println("9. ��ǰ��ȣ�� ��ǰ ����");
			System.out.println("10. ��ü ��� ��ǰ �ݾ� ���ϱ�");
			System.out.println("0. ����");
			System.out.print("���ϴ� ��ȣ�� �����ϼ���. ");
			int select = scan.nextInt();
			scan.nextLine();
			String str; // �Է¹޴� ���ڿ�
			int input;
			
			ArrayList<Product> temp; // ������ �����ϴ�  Product�迭
			ArrayList<Refrigerator> tempR;
			ArrayList<Tv> tempT;
			
			switch(select) {
			case 1: // 1. ��ǰ���� ��ü�� �˻�
				temp = pm.search();
				for(int i = 0; i < temp.size() ; i++) {
					System.out.println(temp.get(i).toString());					
				}
				break;
			case 2: // 2. ��ǰ��ȣ�� ��ǰ�� �˻�
				System.out.print("��ǰ��ȣ�� �Է��ϼ��� : ");
				str = scan.next();
				temp = pm.search(str);
				for(int i = 0; i < temp.size() ; i++) {
					System.out.println(temp.get(i).toString());					
				}
				break;
			case 3: // 3. ��ǰ������ ��ǰ�� �˻��ϴ� ���
				System.out.print("Title�� �Է��ϼ��� : ");
				str = scan.next();
				temp = pm.searchName(str);
				for(int i = 0; i < temp.size() ; i++) {
					System.out.println(temp.get(i).toString());					
				}
				break;
			case 4: // 4. Tv������ �˻�
				temp = pm.searchTv();
				for(int i = 0; i < temp.size(); i++) {
					System.out.println(temp.get(i).toString());					
				}
				break;
			case 5: // 5. Refrigerator�� �˻��ϴ� ���
				temp = pm.searchRefrigerator();
				for(int i = 0; i < temp.size(); i++) {
					System.out.println(temp.get(i).toString());					
				}
				break;
				
			case 6: // 6. 400L�̻��� Refrigerator �˻�
				tempR = pm.search400L();
				for(int i = 0; i < tempR.size(); i++) {
					System.out.println( tempR.get(i).toString());					
				}
				break;
				
			case 7: // 7. 50inch �̻��� Tv �˻�
				tempT = pm.search50inch();
				for(int i = 0; i < tempT.size(); i++) {
					System.out.println( tempT.get(i).toString());					
				}
				break;
			
			case 8: // 8. ��ǰ��ȣ�� ������ �Է� �޾� ��ǰ ������ ������ �� �ִ� ���
				System.out.println("��ȣ�� ������ ���ʷ� �Է��ϼ���");
				pm.updatePrice(scan.next(), scan.nextInt());
				break;
				
			case 9: // 9. ��ǰ��ȣ�� ��ǰ���� �����ϴ� ���
				System.out.println("��ǰ��ȣ�� �Է��ϼ���");
				pm.delete(scan.next());
				break;
				
			case 10: // 10. ��ü ��� ��ǰ �ݾ��� ���ϴ� ���
				System.out.println("��ü�ݾ� : " + pm.total());
				break;
				
			case 0: // 0 ����
				System.exit(0);
				break;
			default:
				System.out.println("�ٸ� ��ȣ�� �Է��ϼ���");
			} // end of switch
			System.out.println("");
			
		} // end of while

		

	}

}
