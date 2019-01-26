package com.ssafy;

import java.util.ArrayList;
import java.util.Comparator;

public class MovieMgr implements Manageable<Movie>{
	ArrayList<Movie> list = new ArrayList<Movie>();
	int size;
	NameCompare nameCompare = new NameCompare();
	TimeCompare timeCompare = new TimeCompare();
	
	//����	
	public void add(Movie m) {
		list.add(m);		
	}
	
	//�˻� , ��ȭ �̸����� �˻��� �� �̸��� ��ġ�ϴ� ��ü ��ȯ
	public Movie search(String name) {		
		for (Movie Movie : list) {
			if(Movie.getName().equals(name))
				return Movie;
		}
		return null;		
	}
	
	//�˻�, ��ȭ ���̵�� �˻� �� ��ü ��ȯ
	public Movie search(int id) {
		for (Movie Movie : list) {
			if(Movie.getId() == id)
				return Movie;
		}
		return null;	
		
	}
	
	//�˻�, ��ü�� ID��ȯ
	public int search(Movie m) {
		for (Movie movie : list) {
			if(movie.equals(m) ) {
				return movie.getId();
			}
		}
		return -1;
	}
	
	//����, �̸��� �̸��� �Է��Ͽ� ��ȭ�̸� ����
	void update(String name, String str) {
		int len = list.size();
		for (int i = 0; i < len; i++) {
			if( list.get(i).getName().equals(name) ) {
				list.get(i).setName(str);				
			}
		
		}
	}
	
	//����, ��ȭ �̸��� �ð� �Է��Ͽ� �� �̸��� �ش��ϴ� �ð� ����
	void update(String name, int time) {
		int len = list.size();
		for (int i = 0; i < len; i++) {
			if( list.get(i).getName().equals(name) ) {
				list.get(i).setTime(time);			
			}		
		}
	}
	
	//��ü ���
	void info() {
		for (Movie movie : list) {
			System.out.println(movie.toString());
		}
	}
	
	// ����
	public void delete(String s) {
		for (Movie movie : list) {
			if(movie.getName().equals(s)) {
				list.remove(movie);
				return;
			}
		}
	}
	
	// Comperator ����
	class NameCompare implements Comparator<Movie> {
		@Override
		public int compare(Movie o1, Movie o2) {
			// TODO Auto-generated method stub
			return o1.getName().compareTo(o2.getName());
		}
	}
	
	class TimeCompare implements Comparator<Movie> {
		@Override
		public int compare(Movie o1, Movie o2) {
			// TODO Auto-generated method stub
			return o1.getTime() - o2.getTime();
		}
	}
}
