
public class Solution1 {
	
	public boolean solution(int[] arrA, int[] arrB) {
		
		
		boolean answer = true;
		// ù��° ���� �� ���� ã�´�.
		int len = arrA.length;
		int lenB = arrB.length;
		if(len != lenB) return false;
		int j = 0;
		
		int index = 0;
		// ���粨�� �տ����� �޶����� ���������� index �����ؾ���
		for(int i = 0; i < len; i++ ) {
			// �ε��� ���� �� �߻̾ƾ���
			// ���� ���� ������ �ִٸ� �ű⸦ �ǹ����� ��´�.
			// + ���粨�� �ڿ����� �ٸ��ٸ�
			if(arrA[j] == arrB[i]) {
				int next = j + 1;
				if(next == len) next = 0;
				if( arrA[j] != arrA[next] ) {
					index = i;
					break;
				}
				else {
					j++;
				}
					
				//��¿�� ��Ƽ�� ���� �� ���������͵� ������ ++���ش�.
//				if(j+1 == len) j = -1;
//				if(arrA[j+1] == arrB[i]) {
//					++j;
//					continue;
//				}
			}
		} // end of for 2
		
//		System.out.println(index);
//		System.out.println(index);
		 
		int temp = index;
		int cnt = 0;
		for(int i = j; (cnt <= j); i++) {
			if( i == len) i = 0;
			if( arrA[i] != arrB[index] ) {
				answer = false;
				break;
			}
			index++;
			if(index == lenB)
				index = 0;
			cnt++;
		}

		
		// �װź��� ��� �´� �� ��
		return answer;
	}

	public static void main(String[] args) {
//		for(int i = 0; i < 1500; i++) {
//			System.out.print(1500+",");
//		}
		
		Solution1 s = new Solution1();
		System.out.println(s.solution(new int[] {1500,1500,1500,1499,1500,1500}, new int[] {1500,1499,1500,1500,1500,1500}));
		System.out.println(s.solution(new int[] {1,2,3,4}, new int[] {2,3,4,1}));

	}

}
