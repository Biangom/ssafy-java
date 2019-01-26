package com.ssafy;

import java.util.ArrayList;
import java.util.Comparator;

public class ProductMgr implements Manageable<Product>{
	ArrayList<Product> list = new ArrayList<Product>();
	int size;
	NameCompare nameCompare = new NameCompare();
	
	//����	
	public void add(Product m) {
		list.add(m);		
	}
	
	//�˻� , ��ǰ �̸����� �˻��� �� �̸��� ��ġ�ϴ� ��ü ��ȯ
	public Product search(String name) {		
		for (Product Movie : list) {
			if(Movie.getName().equals(name))
				return Movie;
		}
		return null;		
	}
	
	//�˻�, ��ǰ ���̵�� �˻� �� ��ü ��ȯ
	public Product search(int id) {
		for (Product Movie : list) {
			if(Movie.getId() == id)
				return Movie;
		}
		return null;	
		
	}
	
	//�˻�, ��ü�� ID��ȯ
	public int search(Product m) {
		for (Product movie : list) {
			if(movie.equals(m) ) {
				return movie.getId();
			}
		}
		return -1;
	}
	
	//����, �̸��� �̸��� �Է��Ͽ� ��ǰ�̸� ����
	void update(String name, String str) {
		int len = list.size();
		for (int i = 0; i < len; i++) {
			if( list.get(i).getName().equals(name) ) {
				list.get(i).setName(str);				
			}
		
		}
	}
	
	//��ü ���
	void info() {
		for (Product movie : list) {
			System.out.println(movie.toString());
		}
	}
	
	// ����
	public void delete(String s) {
		for (Product movie : list) {
			if(movie.getName().equals(s)) {
				list.remove(movie);
				return;
			}
		}
	}
	
	// Comperator ����
	class NameCompare implements Comparator<Product> {
		@Override
		public int compare(Product o1, Product o2) {
			// TODO Auto-generated method stub
			return o1.getName().compareTo(o2.getName());
		}
	}
	
}
