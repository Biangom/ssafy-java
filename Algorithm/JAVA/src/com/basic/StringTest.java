package com.basic;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "mylimeorange";
		String t = new String("mylimeorange");
		
		if(s == t)
			System.out.println("s == t");
		
		if(s.equals(t))
			System.out.println("s.equlas(t)");
		
		// ���ı��Լ��� s�� ���� �ٲ��� �ʴ´�.
		// �׷��� p�� ������ �ϰ� p�� ����Ѵ�.
		String p = s.toUpperCase();
		System.out.println(p);
		
		s.concat("hello");
		System.out.println(s);
		
		s = s + "hello";
		System.out.println(s);
		
		// ������ ���� ����! �Ϲ����� String�̶� �ٸ���.
		StringBuilder sb = new StringBuilder("mylimeorange");
		System.out.println(sb.length());
		sb.append("123"); // append�� ���ڿ� ����
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.charAt(4));
		
		System.out.println(sb.indexOf("o"));
		
		String str = "hello123123";
		String s2 = str.substring(2, 7); // �ε��� 2���� 6���� ����!
		System.out.println(s2);
		
		
		
		
		

	}

}
