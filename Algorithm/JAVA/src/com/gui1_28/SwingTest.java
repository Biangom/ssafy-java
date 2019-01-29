package com.gui1_28;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
1.SwingTest�� MouseListener�� ��ӹ޴� ���
2.SwingTest�� MouseAdapter�� ��ӹ޴� ���
2���� ����� �ֵ�.
2��° ����� �������̵��ϰ���� �޼ҵ常 �����ϸ� �ȴ�.

 */

// 1. Ŭ���� ����ÿ� listener implements����
// 2. ����� �߻��ϴ� ���������� �ٿ��־��
public class SwingTest extends MouseAdapter implements ActionListener{
	//field
	JFrame f;
	JButton ok, cancel;
	JLabel la;
	JTextArea ta; // ���� �� �Է� ĭ
	JTextField tf; // ���� �Է� ĭ
	JList list; // ��Ϲ�
	
	public SwingTest() {
		//ȭ�� ����� �۾�
		f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // â �ݱ� ��ư Ŭ���� ���α׷� ����
		f.setLayout(new BorderLayout()); // layout manager ����
		
		
		
		ok = new JButton("ok");
		cancel = new JButton("cancel");
		
		// 2. ����� �߻� ��� ������ ���
		ok.addActionListener(this);
		cancel.addActionListener(this);
		
		la = new JLabel("Swing Test", JLabel.CENTER);
		Font font = new Font("���� ���", Font.BOLD, 50);
		la.setFont(font);
		la.setForeground(Color.PINK);
		
		ta = new JTextArea(5, 30); // 5�� 30����
		ta.setFont(font);
		
		JScrollPane pane = new JScrollPane(ta); // JScrollPane ���� ta�� �ø�
		
		JPanel panel = new JPanel(new FlowLayout()); // JFrame���� ���� �����̳�(���ο� �ٸ� ȭ�� ������Ҹ� ���� �� ����)
		// ��ü�� ȭ�鿡 �����ֱ� ���� ����̾ƴ϶�
		// �׷����ν� ���� ���� ���
		panel.add(ok);
		panel.add(cancel);
		
		tf = new JTextField(30); 
		String[] season = {"spring", "summer", "fall", "winter"};
		list = new JList<>(season);
		list.setVisibleRowCount(4);
		list.addMouseListener(this);
		
		JScrollPane pane2 = new JScrollPane(list);
		
		
		Container c = f.getContentPane();
		c.add(la, "North");
//		c.add(ok, "South");
//		c.add(cancel);
		c.add(list, "Center");
//		c.add(ta);
//		c.add(tf);
//		c.add(pane2);
//		c.add(list,"South");
		c.add(panel,"South");
		
		f.setSize(500, 500);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		new SwingTest();
	}

	// ActionListener�� ������ �ִ� �߻� �޼ҵ�
	// 3. ����� �߻����� �� ó���ؾ��� �۾� ����
	@Override
	public void actionPerformed(ActionEvent e) {
		// �ǳ� �Ȱ��� �۾����ؼ�
		// �����ؼ� ������ �ʿ䰡 �ֵ�!
		Object o = e.getSource(); // Source : ����� �߻��� ���
		if(o == ok) {
			System.out.println("press me!");
		}
		else {
			System.out.println("don't press me!");
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println(list.getSelectedValue());
		int index = list.getSelectedIndex();
		System.out.println(index);
		
	}



}
