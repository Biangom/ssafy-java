package com.ssafy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		// �Ŵ��� ��ü ����
		SellMgr rm = new SellMgr();
		PersonMgr pm = new PersonMgr();
		ProductMgr mm = new ProductMgr();
		
		// ȸ�� �⺻ ������ �߰�
		pm.add(new Person(100,"�輺��",23));
		pm.add(new Person(101,"�����",25));
		pm.add(new Person(102,"�̱���",26));
		pm.add(new Person(103,"������",24));
		pm.add(new Person(104,"������",30));
		
		// ��ǰ �⺻ ������ �߰�
		mm.add(new Product(1000,"������s9",10000,20));
		mm.add(new Product(1001,"LG�ñ״�ó",20000,25));
		mm.add(new Product(1002,"MSI��Ʈ��",12000,10));
		mm.add(new Product(1003,"�����ڵ���",15000,30));
		mm.add(new Product(1004,"HP������",16000,35));
		
		// �Ǹ� ���� �⺻ ������ �߰�
		// ȸ��ID, ��ǰID, ���� �Է�
		rm.add( new Sell(101, 1000, 6) );
		rm.add( new Sell(100, 1001, 7) );
		rm.add( new Sell(102, 1002, 10) );
		
		
		while(true) {
			System.out.println("<<< ��ǰ ���� ���� ���α׷� >>>");
			System.out.println(" 1. ȸ�� ���� ����");
			System.out.println(" 2. ȸ�� ���� �˻�");
			System.out.println(" 3. ȸ�� ���� �̸� ����");
			System.out.println(" 4. ȸ�� ���� ����");
			System.out.println(" 5. ȸ�� ���� ���");
			System.out.println("-------------------------");
			System.out.println(" 6. ��ǰ ���� ����");
			System.out.println(" 7. ��ǰ ���� �˻�");
			System.out.println(" 8. ��ǰ ���� ����");
			System.out.println(" 9. ��ǰ ���� ����");
			System.out.println("10. ��ǰ�� �������� ���");
			System.out.println("-------------------------");
			System.out.println("11. ��ǰ�Ǹ��ϱ�");
			System.out.println("12. ��ǰ�Ǹ� ���� ���");
			System.out.println();
			
			System.out.print("���ϴ� ��ȣ�� �����ϼ���. ");
			int select = scan.nextInt();
			scan.nextLine();
			String str; // �Է¹޴� ���ڿ�
			String str2; // �ٲ� ���ڿ�
		
			// �ӽ������� ��ü ������ ���� ��ü ����
			Person p;
			Product m;
			Sell r;
			
			switch(select) {
			case 1: // 1. ȸ�� ���� �Է�
				p = new Person();
				System.out.print("ID  >> ");
				p.setId(scan.nextInt());
				System.out.print("Name >> ");
				p.setName(scan.next());
				System.out.print("Age >> ");
				p.setAge(scan.nextInt());;
				pm.add(p);
				break;
				
			case 2: // 2. ȸ�� ���� �˻�
				System.out.print("ȸ�� �̸��� �Է��ϼ��� : ");
				str = scan.next();
				p = pm.search(str);
				System.out.println(p.toString());
				break;
				
			case 3: // 3. ȸ�� �̸� ����
				System.out.print("������ ȸ�� �̸��� �Է��ϼ��� >> ");
				str = scan.next();
				System.out.print("�ٲ� �̸��� �Է��ϼ��� >> ");
				str2 = scan.next();
				pm.update(str, str2);				
				break;
				
			case 4: // 4. ȸ�� ���� ����
				System.out.print("������ �̸��� �Է��ϼ��� >> ");
				str = scan.next();
				pm.delete(str);
				break;
				
			case 5: // 5. ȸ�� ���� ���
				pm.info();				
				break;
			case 6: // 6. ��ǰ ���� ����
				m = new Product();
				System.out.print("ID  >> ");
				m.setId(scan.nextInt());
				System.out.print("Name >> ");
				m.setName(scan.next()); 
				System.out.print("Price >> ");
				m.setPrice(scan.nextInt());
				System.out.print("Amount >> ");
				m.setAmount(scan.nextInt());
				mm.add(m);
				break;
				
			case 7: // 7. ��ǰ ���� �˻�
				System.out.print("��ǰ �̸��� �Է��ϼ��� >> ");
				str = scan.next();
				m = mm.search(str);
				System.out.println(m.toString());
				break;
				
			case 8: // 8. ��ǰ �̸� ����
				System.out.print("������ ��ǰ �̸��� �Է��ϼ��� >> ");
				str = scan.next();	
				System.out.print("�ٲ� �̸��� �Է��ϼ��� >> ");
				str2 = scan.next();
				mm.update(str, str2);
				
				break;
				
			case 9: // 9. ��ǰ ���� ����
				System.out.print("������ ��ǰ�� �Է��ϼ��� >> ");
				str = scan.next();
				mm.delete(str);
				break;
				
			case 10: // 10. ��ǰ�� ������ ���
				Collections.sort(mm.list, mm.nameCompare);
				mm.info();
				break;
			
			case 11: // 11. ��ǰ �Ǹ��ϱ�
				int amount;
				r = new Sell();
				System.out.print("��ǰ �̸��� �Է��ϼ��� >> ");
				str = scan.next();
				System.out.print("ȸ�� �̸��� �Է��ϼ��� >> ");
				str2 = scan.next();
				System.out.print("������ ������ �Է��ϼ��� >> ");
				amount = scan.nextInt();
				
				m = mm.search(str); // ��ǰ �̸��� �ش��ϴ� movie ��ü ã��
				p = pm.search(str2); // ȸ�� �̸��� �ش��ϴ� person ��ü ã��
				
				r.setmId(m.getId()); // ��ǰ �̸��� �ش��ϴ� id�� Register���� set
				r.setpId(p.getId()); // ȸ�� �̸��� �ش��ϴ� id�� Register���� set
				r.setAmount(amount);
				
				rm.add(r); // Register���� ad
				break;
				
			case 12: // 12. �Ǹ� ���� ���
				for (Sell re : rm.list) {
					p = pm.search(re.getpId());
					m = mm.search(re.getmId());
					System.out.print(p.toString());
					System.out.print(" | ");
					System.out.print(m.toString());
					System.out.print(" | ");
					System.out.print("�Ǹż��� :" + re.getAmount());
					System.out.println();
				}
				break;				
			default:
				System.out.println("�ٸ� ��ȣ�� �Է��ϼ���");
				
			} // end of switch
			System.out.println("");
		} // end of while
	} // end of main		
} // end of class
