package com.ssafy;

public interface Manageable<T> {
	// ����
	void add();
	
	// �˻�
	T search();
	
	// ����
	void update();
	
	// ����
	void delete();

}
