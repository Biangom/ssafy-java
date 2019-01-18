package algo;

/**
 * �˻�
 * �����˻� : O[N]
 * �����˻� : O[lon N] - �����Ͱ� ���ĵ� ���¿����Ѵ�.
 * �ؽð˻� : O[1]
 * @author student
 *
 */

public class Z08_BinarySearch {
	public static void binarySearch(int[] m, int key, int l, int r) {
		if(l > r) { // ������Ʈ
			System.out.println("��ã��");
		}
		else { // �����Ʈ
			int mid = (l + r) / 2;
			if(key == m[mid]) System.out.println(m[mid]+" ã��");
			else if (key < m[mid]) binarySearch(m, key, l, mid-1);
			else binarySearch(m, key, mid+1, r);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] m = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int l = 0; // �˻������� ���� �� index
		int r = 9; // �˻� ������ ������ �� index m.length - 1
		int key = 80; // ã�� ���� ��
		
		while(l <= r) {
			int mid = (l + r) / 2; // �߰� �ε���
			if ( key == m[mid]) {
				System.out.println(m[mid] + "ã��");
				break;
			}
			else if (key < m[mid]){
				r = mid - 1;
			}
			else
				l = mid + 1;
		}
		if( l > r)
			System.out.println("ã������");
		
		l = 0;
		r = 9;
		binarySearch(m, 9, l, r);
		
		
	} // end of main
} // end of class
