package com.computer;

// Parts�� ��� ���� �ڽ� Ŭ����(Monitor, Mouse, MainFrame, Keyboard)�� �����ϴ� Ŭ����
public class ComputerManager {

    // ��ǰ ������ �迭 ����
    private Parts[] p;
    private int index = 0;
    public int size;
    
    public ComputerManager(int size) {
        p = new Parts[size];
        this.size = size;
    }

    // �迭�ȿ� ��ǰ ����
    // �迭�� ���� : size check
    public void add(Parts data) {
    	if(index < size) {
        	p[index++] = data;    		
    	}        
    	else
    		System.err.println("error! ");
    }

    // �迭�ȿ� �ִ� ��� ��ǰ ����
    public Parts[] allParts() {
        return p;
    }

    // ��ǰ �˻�
    public Parts findPart(int num) {
    	for (int i = 0; i < index; i++) {
    		if( p[i].getNum() == num)
    			return p[i];
			
		}
  
        return null;
    }
    
    // ��ǰ ����
    public void deletePart(int num) {
    	for (int i = 0; i < index; i++) {
    		if( p[i].getNum() != num) continue;
    		// ��ĭ�� �����
    		for(int j = i; j < index - 1; j++) {
    			p[j] = p[j+1];
    			
    		}
			
		}        
    }
}