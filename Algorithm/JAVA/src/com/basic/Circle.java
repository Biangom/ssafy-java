package com.basic;


//Shape�� �ڽ� Ŭ���� Shape�� ������ �ִ� �̿ϼ� �޼ҵ� 2��(getArea(), getCircum())�� �ϼ� ���Ѿ���
public class Circle extends Shape{
	int r;

	
	
	
	public Circle(int r) {
		this.r = r;
	}

	public Circle() {
		super();
		System.out.println("3");
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return r * r * Math.PI;
	}

	@Override
	public double getCircum() {
		// TODO Auto-generated method stub
		return 2 * r * Math.PI;
	}
	
	
}