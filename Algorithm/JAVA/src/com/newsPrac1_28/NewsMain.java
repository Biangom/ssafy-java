package com.newsPrac1_28;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;


/*
 * DAO�� �ϴ� ���� 1. XML������ �о �Ľ�
 * 2. �Ľ��� ����� LIST�� ��Ƴ��´�.
 * 
 * Main GUI Event ó��
 * 
 */
public class NewsMain {
	JFrame f;
	JButton b ;
	JList li ;
	NewsDAO dao;

	public NewsMain() {
		try {
			dao = new NewsDAO();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		createGUI();
		addEvent();
	}

	private void addEvent() {
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				showList();
			}
		});
	}

	protected void showList() {
		// dao���׼� �Ľ��� ����� ��� �ִ� ArrayList �ٴ����
		// �޾ƿ� ArrayListfh ghkaus(JList)�� �Ѹ���
		List<News> data = dao.getNewsData();
		
		// ArrayList�� �迭�� �ٲ۴����� ����־��ָ�
		// �ϳ��� �ϳ��� ������ list�� ���پ� �����ش�.
		System.out.println(Arrays.toString(data.toArray()));
		li.setListData(data.toArray());
	}

	private void createGUI() {
		f = new JFrame("News Info");
		b = new JButton("call News");
		
		
		li = new JList();
		JScrollPane pane = new JScrollPane(li);
		Container c = f.getContentPane();
		
		c.add(b, "North");
		c.add(pane, "Center");
		
		f.setSize(1200, 1200);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new NewsMain();
	}


}
