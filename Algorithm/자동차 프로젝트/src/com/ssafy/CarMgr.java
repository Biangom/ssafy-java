package com.ssafy;

import java.util.Iterator;

public class CarMgr {
	private Car[] cars = new Car[100];
	private int index;
	
	public void add(Car c) {
		cars[index] = c;
		index++;
	}
	
	public Car[] search() {
		return cars;
	}
	
	/** �Ķ���ͷ� ���޵� ��ȣ�� ���� ���� ������ �����Ѵ�.*/
	public Car search(String num) {
		for (int i = 0; i < index; i++) {
			Car car = cars[i];
			if(car.getNum().equals(num) ) {
				return car;
			}	
		}
		return null;
		
	}
	
	/** �Ķ���ͷ� ���޵� ���ݺ��� ���� ���� �������� �����Ѵ�.*/
	public Car[] search(int price) {
		Car[] temp;
		int cnt = 0; // price���� ���� ������ ����
		
		for (int i = 0; i < index; i++) {
			Car car = cars[i];
			if(car.getPrice() < price ) {
				cnt++;
			}	
		}
		
		temp = new Car[cnt];
		int tempCnt = 0; // �ϳ��� �����ϸ鼭 �迭�� �ֱ� ���� ����
		for (int i = 0; i < index; i++) {
			if(cars[i].getPrice() < price)
				temp[tempCnt++] = cars[i];
		}
		return temp;		
	}
	
	public void update(String num, int price) {
		
		for (int i = 0; i < index; i++) {
			Car car = cars[i];
			if(car.getNum().equals(num)) {
				car.setPrice(price);
				break;
			}		
		}
	}
	
	// �Ķ���ͷ� ���޵� ��ȣ�� ������ �����Ѵ�.
	public void delete(String num) {
		for (int i = 0; i < index; i++) {
			// ��ġ�Ѵٸ� ������ �����
			if(cars[i].getNum().equals(num)) {
				// �׷��� i--�� ���� ��
				
				// ����� �۾�
				for(int j = i; j < index-1; j++) {
					cars[j] = cars[j+1];
				}
				i--; // �� ��ġ�� �ٽ� ���ؾ��Ѵ�
				index--;
				System.out.println("�����Ǿ����ϴ�!");
			}
		}
	}
	
	public int size() {
		return index;
		
	}
	
	public int totalPrice() {
		int total = 0;
		for (int i = 0; i < index; i++) {
			total += cars[i].getPrice();
		}
		return total;
	}
}
