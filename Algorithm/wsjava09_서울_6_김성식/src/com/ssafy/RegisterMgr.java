package com.ssafy;

import java.util.ArrayList;

public class RegisterMgr implements Manageable<Register> {
	ArrayList<Register> list = new ArrayList<Register>();

	// ����
	public void add(Register r) {
		list.add(r);
	}

	@Override
	public Register search(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Register search(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int search(Register t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(String s) {
		// TODO Auto-generated method stub
		
	}
}
