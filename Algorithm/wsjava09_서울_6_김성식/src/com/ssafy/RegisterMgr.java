package com.ssafy;

import java.util.ArrayList;

public class RegisterMgr {
	ArrayList<Register> am = new ArrayList<Register>();

	
	// ����
	void add(Register r) {
		am.add(r);
	}
	
	// �˻�
	Register search(Person p) {
		Register r = new Register();
		return r;		
	}
	
	// ����
	void update(Person p) {
		
	}
	
	
	// ����
	void remove(Person p) {
		
	}
	
	//
	void print() {
		for (Register register : am) {
			System.out.println(register.toString());			
		}
	}

	
	
	
	

}
