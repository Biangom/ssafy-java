

import java.util.ArrayList;
import java.util.Scanner;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		IProductManagerImpl pm = new IProductManagerImpl();
		
		
		while(true) {
			System.out.println("<<< å ���� ���α׷� >>>");
			System.out.println("0. ��ǰ ���� �Է�");
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
			System.out.println("99. ����");
			System.out.print("���ϴ� ��ȣ�� �����ϼ���. ");
			int select = scan.nextInt();
			scan.nextLine();
			String str; // �Է¹޴� ���ڿ�
			int input;
			
			ArrayList<Product> temp; // ������ �����ϴ�  Product�迭
			ArrayList<Refrigerator> tempR;
			ArrayList<Tv> tempT;
			
			switch(select) {
			case 0: // 0. ��ǰ���� �Է�
				System.out.println("1. ����� �Է�");
				System.out.println("2. TV �Է�");
				int c = scan.nextInt();
				scan.nextLine();

				if(c == 0) {
					Refrigerator r = new Refrigerator();
					System.out.print("Num  >> ");
					r.setNum(scan.nextLine());
					System.out.print("Name >> ");
					r.setName(scan.nextLine());
					System.out.print("Price >> ");
					r.setPrice(scan.nextInt());
					scan.nextLine();
					System.out.print("Amount >> ");
					r.setAmount(scan.nextInt());
					scan.nextLine();
					System.out.print("Volume >> ");
					r.setVolume(scan.nextInt());
					scan.nextLine();
					try {
						pm.add(r);
					} catch (DuplicateException e) {
						System.out.println("�ߺ� ������!");
					}
				}
				else if( c == 1) {
					Tv t = new Tv();
					System.out.print("Num  >> ");
					t.setNum(scan.nextLine());
					System.out.print("Name >> ");
					t.setName(scan.nextLine());
					System.out.print("Price >> ");
					t.setPrice(scan.nextInt());
					scan.nextLine();
					System.out.print("Amount >> ");
					t.setAmount(scan.nextInt());
					scan.nextLine();
					System.out.print("Inch >> ");
					t.setInch(scan.nextInt());
					scan.nextLine();
					System.out.print("Type >> ");
					t.setType(scan.nextLine());
					
					
					try {
						pm.add(t);
					} catch (DuplicateException e) {
						System.out.println("�ߺ� ������!");
					}
				}				
				break;
			case 1: // 1. ��ǰ���� ��ü�� �˻�
				temp = pm.search();
				for(int i = 0; i < temp.size() ; i++) {
					System.out.println(temp.get(i).toString());					
				}
				break;
			case 2: // 2. ��ǰ��ȣ�� ��ǰ�� �˻�
				System.out.print("��ǰ��ȣ�� �Է��ϼ��� : ");
				str = scan.next();
				try {
					temp = pm.search(str);
					for(int i = 0; i < temp.size() ; i++) {
						System.out.println(temp.get(i).toString());					
					}
				} catch (CodeNotFoundException e1) {
					System.out.println("���ܹ߻�!");
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
				try {
					tempR = pm.search400L();
					for(int i = 0; i < tempR.size(); i++) {
						System.out.println( tempR.get(i).toString());					
					}
				} catch (ProductNotFoundException e) {
					System.out.println("���ܹ߻�!");
				}

				break;
				
			case 7: // 7. 50inch �̻��� Tv �˻�
				try {
					tempT = pm.search50inch();
					for(int i = 0; i < tempT.size(); i++) {
						System.out.println( tempT.get(i).toString());					
					}
				} catch (ProductNotFoundException e) {
					System.out.println("���ܹ߻�!");
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
				
			case 99: // 0 ����
				System.exit(0);
				break;
			default:
				System.out.println("�ٸ� ��ȣ�� �Է��ϼ���");
			} // end of switch
			System.out.println("");
			
		} // end of while

		

	}

}
