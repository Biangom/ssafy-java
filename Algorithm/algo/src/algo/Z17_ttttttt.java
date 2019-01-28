package algo;

import java.security.KeyStore.Entry;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;


class Cup implements Comparable<Cup>{
	int size;
	String name = "";
	public Cup(int size, String name) {
		this.size = size;
		this.name = name;
	}
	public Cup() {
		// TODO Auto-generated constructor stub
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return String.format("[%d,%s]", size, name);
	}
	
	@Override
	public int compareTo(Cup o) {
		// TODO Auto-generated method stub
		return this.size - o.size;
	}
	
	
}

class Pest {
	int a;
	String s;
	public Pest(int a, String s) {
		this.a = a;
		this.s = s;
	}
	
	@Override
	public String toString() {
		return "Pest [a=" + a + ", s=" + s + "]";
	}
	
	public int hashCode() { // �� Ű�� ���� ����ũ�� hash ���� �����ϴ� �Լ�
		
		return (a+s).hashCode();
	}
	
	// ������ : �θ��� ���������� �ڽ��� ��ü�� ���� �� �ִ� ����
	public boolean equals(Object obj) {
		if (obj == null) return false;
		if ( obj instanceof Pest) {
			Pest g = (Pest)obj;
			return this.a == g.a && this.s.equals(this.s);
		}
		return false;
			
		//instance of *******************����		
	}
}

public class Z17_ttttttt {


	public static void main(String[] args) {
//		List ���� ����, ������ �ߺ�����
//			ArrayList, LinkedList
//		Set	��������, ������ �ߺ��Ұ�
//			HashSet, TreeSet
//		Map	Ű:��	�� ������ �Ǿ�����
//			HashMap, TreeMap
		
		HashSet<Pest> hs = new HashSet<Pest>();
		//Queue<Integer> q = new Queue<Integer>();
		// Hashing ����� ����Ϸ��� Hashcode(), equals()�� �������̵��ؾ���
		
		hs.add(new Pest(1, "123"));
		hs.add(new Pest(2, "132"));
		hs.add(new Pest(4, "156"));
		hs.add(new Pest(4, "156"));
		hs.add(new Pest(5, "112"));
		
		for (Pest Pest : hs) {
			System.out.println(Pest.toString());
		}		
		
		// �ߺ��� ���Ű� �ȵȴ�.
		// HashCode�� equals�� �����ϸ� �ߺ��� ���ŵ� (���� ��ü�� ���ŵ�)
		
		System.out.println("---------------------");
		
		HashMap<Pest, Integer> hm = new HashMap(); // Ű:��
		hm.put(new Pest(22,"������"), 100);
		hm.put(new Pest(21,"�輺��"), 20);
		hm.put(new Pest(23,"�ƶ��"), 50);
		hm.put(new Pest(23,"�ƶ��"), 200);
		// ���� Ű�� ������ ������ش�
		System.out.println(hm);
		
		//���� Ű ������ �������ڴ�.
		Set<Pest> ks = hm.keySet();
		
		
		// 2���� ����� �ִ�. ***
		for (Pest k : ks) {
			System.err.print(k);
			System.err.print(hm.get(k));
		}
		
		Iterator<Pest> iter = ks.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next()+",");
		}
		
//		Set<Entry<Pest, Integer>> es = hm.entrySet();
//		for(Entry<Pest, Integer> entry : es) {
//			System.out.println(entry.getKey() + " ~ " + entry.getValue()+ ", ");
//		}
//		System.out.println();
//		Iterator<Entry<Pest, Integer>> ex = es.iterator();
//		while(ex.hasNext()) {
//			Entry<Pest, Integer> en = ex.next();
//			System.out.println(en.getKey() + ";" + en.getValue());
//		}
		
		
		
		
		
		// BinarySearchTree ����� ����Ϸ��� compareTo(), compare() �� �����ؾ��Ѵ�.
		
		TreeSet<Cup> ts = new TreeSet<Cup>();
		// comparator�� ���� 2��° ���
		// Ŭ���� �ܺ��� �񱳱����� �ۼ�
		TreeSet<Cup> ts2 = new TreeSet<Cup>(
			new Comparator<Cup>() {
				public int compare(Cup o1, Cup o2) {
					return o1.size - o2.size;
				}
			}
		);
		
		ts.add(new Cup(100,"���α�"));
		ts.add(new Cup(100,"���α�"));
		ts.add(new Cup(100,"ȫ�浿"));
		ts.add(new Cup(70, "����"));
		ts.add(new Cup(50, "����"));
		ts.add(new Cup(20, "����"));
		ts.add(new Cup(10, "����"));
		ts.add(new Cup(170, "����"));
		System.out.println(ts);
	}
}


