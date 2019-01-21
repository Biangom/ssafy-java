

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		IBookManagerImpl bm = new IBookManagerImpl();
		
	
		
		while(true) {
			System.out.println("<<< å ���� ���α׷� >>>");
			System.out.println("0. Magazine ���� �Է�");
			System.out.println("1. Book ���� �Է�");
			System.out.println("2. å ���� ��ü �˻�");
			System.out.println("3. ���� �Ǹ�");
			System.out.println("4. ���� ����");
			System.out.println("5. �� ��� �ݾ� ���ϱ�");
			System.out.println("9. ����");
			System.out.print("���ϴ� ��ȣ�� �����ϼ���. ");
			int select = scan.nextInt();
			scan.nextLine();
			String str; // �Է¹޴� ���ڿ�
			String str2; // �Է¹޴� ���ڿ�2
			int input; // ���� Ȥ�� ������ �Է¹��� ���ڿ�
			ArrayList<Book> temp; // ������ �����ϴ� Movie�迭
			
			switch(select) {
			case 0: // 0. Magazine ���� �Է�
				Magazine m = new Magazine();
				System.out.print("isbn  >> ");
				m.setIsbn(scan.nextLine());
				System.out.print("���� >> ");
				m.setTitle(scan.nextLine()); 
				System.out.print("���� >> ");
				m.setPrice(scan.nextInt());
				scan.nextLine();
				System.out.print("���� >> ");
				m.setQuantity(scan.nextInt());
				scan.nextLine();
				System.out.print("�� >> ");
				m.setMonth(scan.nextInt());
				scan.nextLine();
				bm.add(m);
				
				break;
			case 1: // 1. å ���� �Է�
				Book t = new Book();
				System.out.print("isbn  >> ");
				t.setIsbn(scan.nextLine());
				System.out.print("���� >> ");
				t.setTitle(scan.nextLine()); 
				System.out.print("���� >> ");
				t.setPrice(scan.nextInt());
				scan.nextLine();
				System.out.print("���� >> ");
				t.setQuantity(scan.nextInt());
				scan.nextLine();
				bm.add(t);
				
				break;
			case 2: // 2. å ���� ��ü �˻�
				temp = bm.search();
				for(int i = 0; i < bm.getSize() ; i++) {
					System.out.println(temp.get(i).toString());					
				}
				break;
			case 3: // 3. ���� �Ǹ�
				System.out.print("Isbn�� �Է��ϼ��� : ");
				str = scan.next();
				System.out.print("�Ǹ��� �� �Է��ϼ��� : ");
				input = scan.nextInt();
		
				try {
					bm.sell(str, input);
				} catch (QuantityException e) {
					System.out.println("���� �����մϴ�.!");
				} catch (ISBNNotFoundException e) {
					System.out.println("���� ISBN�Դϴ�.!");
				}
				break;
			case 4: // 4. ���� ����
				System.out.print("Isbn�� �Է��ϼ��� : ");
				str = scan.next();
				System.out.print("������ �� �Է��ϼ��� : ");
				input = scan.nextInt();
				
				
				try {
					bm.buy(str, input);
				} catch (ISBNNotFoundException e) {
					System.out.println("���� ISBN�Դϴ�.!");
				}		
				break;
			case 5: // 5. �� ��� �ݾ� ���Ͽ� ����
				System.out.println( "�� ��� �ݾ� : " + 
						bm.getTotalAmount());

				break;				
			case 9: // 0 ����
				bm.close();
				System.out.println("���� ! ");
				System.exit(0);
				break;
			default:
				System.out.println("�ٸ� ��ȣ�� �Է��ϼ���");
			} // end of switch
			System.out.println("");
			
		} // end of while
	} // end of main
} // end of class
