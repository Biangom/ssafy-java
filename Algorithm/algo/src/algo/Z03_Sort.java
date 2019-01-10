package algo;
import java.util.Arrays;

/**
 * [����]
 * (1��)
 * ī���� ���� O[N]			// ���� ���� ���� ��� : �������, ������ �����Ͱ� ����(0 �̻��� ����)
 * 	// �Ǽ��� �ȵǰ�, ���ڿ��� �ȵȴ�.
 * 
 * 
 * (1��)
 * ������		O[NlogN]	// �����ϱ� ��ƴ�, �ð��� �߰����� ������.
 * ��������	O[NlogN]
 * ������		O[NlogN]
 * 
 * (10��)
 * ��ǰ����	O[N^2]		// �����ϱ� ����, ��������� �ð��� ���� �ɸ���.
 * ��������	O[N^2]		// �갡 �� ����.
 * ��������	O[N^2]
 * 
 * @author student
 *
 */
public class Z03_Sort {
	public static void main(String[] args) {
		// ��ǰ ����
		// 0~n-1
		// 0~n-2
		int[] arr = {10,5,5,8,3,7,4,6,4,9,2};
		// 11 -> 5 max i = 10
		for(int j = arr.length - 1; j >= 0 ; j--) {
			for (int i = 0; i < j; i++) { 
				if(arr[i] > arr[i+1]) {
					int temp;
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
			if(j == arr.length / 2 )
				break;
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length/2);
		System.out.println(arr[arr.length/2]);
		
		
		
		
	}

}
