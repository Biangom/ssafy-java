package com.ssafy;

public class Register {
	private int pId;
	private int mId;
	
	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Register(int pId, int mId) {
		super();
		this.pId = pId;
		this.mId = mId;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public int getmId() {
		return mId;
	}
	public void setmId(int mId) {
		this.mId = mId;
	}

//	@Override
//	public String toString() {
//		return "��ȭ����" + m +" "+ p;
//	}	

}
