package com.ssafy;

import java.util.ArrayList;

public class MovieMgr {
	ArrayList<Movie> mArr = new ArrayList<Movie>();
	int size;
	
	//����	
	void add(Movie m) {
		mArr.add(m);		
	}
	
	//�˻� , ��ȭ �̸�����
	Movie search(String name) {		
		for (Movie Movie : mArr) {
			if(Movie.getName().equals(name))
				return Movie;
		}
		return null;		
	}
	
	//����, �̸��� �̸��� �Է��Ͽ� ��ȭ�̸� ����
	void update(String name, String str) {
		int len = mArr.size();
		for (int i = 0; i < len; i++) {
			if( mArr.get(i).getName().equals(name) ) {
				mArr.get(i).setName(str);				
			}
		
		}
	}
	//����, ��ȭ �̸��� �ð� �Է��Ͽ� �� �̸��� �ش��ϴ� �ð� ����
	void update(String name, int time) {
		int len = mArr.size();
		for (int i = 0; i < len; i++) {
			if( mArr.get(i).getName().equals(name) ) {
				mArr.get(i).setTime(time);			
			}		
		}
	}
	
	//����
	void delete(Movie m) {
		mArr.remove(m);
	}

}
