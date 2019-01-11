package hwjava06_����_06��_�輺��;

import java.util.Scanner;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		ProductMgr pm = new ProductMgr();

		pm.add(new Product("1000","HTC",10000,5));
		pm.add(new Product("1001","������",1000,5));
		pm.add(new Product("1002","����Ʈ",2500,4));
		pm.add(new Product("1003","G6",500,8));
		pm.add(new Product("1004","�ȼ�2",1200,5));
		pm.add(new Product("1005","������X",3000,5));
		pm.add(new Product("1006","����ζ�",5000,2));
		
		while(true) {
			System.out.println("<<< ��� ���� ���α׷� >>>");
			System.out.println("1. ��� ���� �Է�");
			System.out.println("2. ��� ���� ��ü �˻�");
			System.out.println("3. ��ǰ��ȣ �˻�");
			System.out.println("4. ��ǰ�� �˻�");
			System.out.println("5. ��ǰ���� ����");
			System.out.println("6. ��ǰ��ȣ�� ��ǰ ����");
			System.out.println("7. ��ü ��� ��ǰ �ݾ� ���");			
			System.out.println("0. ����");
			System.out.print("���ϴ� ��ȣ�� �����ϼ���. ");
			int select = scan.nextInt();
			scan.nextLine();
			String str; // �Է¹޴� ���ڿ�
			Product[] temp; // ������ �����ϴ� Movie�迭
			
			switch(select) {
			case 1: // 1. ��ǰ ���� �Է�
				Product t = new Product();
				System.out.print("��ǰ��ȣ  >> ");
				t.setIsbn(scan.nextLine());
				System.out.print("��ǰ�� >> ");
				t.setName(scan.nextLine()); 
				System.out.print("��ǰ���� >> ");
				t.setPrice(scan.nextInt());
				scan.nextLine();
				System.out.print("��ǰ���� >> ");
				t.setAmount(scan.nextInt());
				scan.nextLine();
				
				pm.add(t);
				
				break;
			case 2: // 2. ��ǰ ���� ��ü �˻�
				temp = pm.search();
				for(int i = 0; i < pm.getSize() ; i++) {
					System.out.println(temp[i].toString());					
				}
				break;
			case 3: // 3. ��ǰ��ȣ�� ��ǰ�� �˻�
				System.out.print("��ǰ��ȣ�� �˻��ϼ��� : ");
				str = scan.next();
				temp = pm.search(str);
				for(int i = 0; temp[i] != null; i++) {
					System.out.println(temp[i].toString());					
				}
				break;
			case 4: // 4. ��ǰ������ ��ǰ�� �˻�
				System.out.print("��ǰ���� �˻��ϼ��� : ");
				str = scan.next();
				temp = pm.searchName(str);
				for(int i = 0; temp[i] != null; i++) {
					System.out.println(temp[i].toString());					
				}
				break;
			case 5: // 5. ��ǰ��ȣ�� ������ �Է� �޾� ��ǰ ���� ����
				System.out.print("��ǰ��ȣ�� �Է��ϼ��� : ");
				String inIsbn = scan.next();
				System.out.print("������ �Է��ϼ��� : ");
				int inPrice = scan.nextInt();
				
				pm.update(inIsbn, inPrice);
	
				break;
			case 6: // 6. ��ǰ��ȣ�� ��ǰ�� ����
				System.out.print("��ǰ��ȣ�� �Է��ϼ��� : ");
				str = scan.next();
				pm.delete(str);
				break;
			case 7: // 7. ��ü ��� ��ǰ �ݾ��� ���ϱ�
				System.out.println("��ü ��� ��ǰ �ݾ� : "+ pm.total());
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
