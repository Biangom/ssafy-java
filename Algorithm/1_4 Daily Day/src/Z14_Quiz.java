import java.util.Random;

/**
 * ����, ���� ������, ��Ÿ
 * @author student
 *
 */
public class Z14_Quiz {
	
	// �������� : Ŭ���� ���� && �޼��� �ٱ��ʿ� ����
	// �ʱⰪ : �� Ÿ���� �⺻�� ���� : 0, �Ǽ�:0,0, ����:\u0000, ����:false, ������:null
	int b; // non-static����, �ν��Ͻ� ������� �Ѵ�.
			// ������ : ��ü���� ���� ~ �������� �������� ����
			// �������� : ���������� ��������, ������ �÷��Ϳ� ���� �ڵ����� ����
	
	static int c; // static ���� ~ �ӵ��� ������.
				// ������ : Ŭ���������� ó�� �ε��ɶ� ~ ���α׷����� �ñ���
				// �������� : ���α׷� �����
				// ���������� static �޼���, ������ ���� ���� �ȵȴ�. �� �� �ִ� �޸𸮰� �پ��� ������.
				// �˰��� ��ȸ������ static ���� ����. ������ ������
	
//	�˰��� ������
//	1. BruteForce
//	2. Greedy
//	3. BackTracking
//	4. Divid & Conquer
//	5. DP
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		���� 2������ �ִ�. in java
		Math.random(); // ������ ���� double ���� 0.0 <= x < 1.0
		// �ڹٿ����� �տ��� ����, �ڿ��� ������
		
		Random ran = new Random();
		System.out.println(ran.nextInt(45)); // 0<= a < 45
		
		// 
		

	}

}
