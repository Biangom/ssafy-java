package com.ssafy;

public interface Manageable<T> {
	// ����
	void add(T t);
	
	// �˻�
	T search(int i);
	T search(String s);
	int search(T t);
	
	
	// ����
	void delete(String s);
}
