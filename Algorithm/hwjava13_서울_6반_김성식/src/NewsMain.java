

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


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
	JTextArea ta;
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
		li.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				News n = (News)dao.search(li.getSelectedIndex());
//				News n = (News)li.getSelectedValue();
				try {
					ta.setText(n.getDesc());
				}
				catch(Exception e1) {
					
				}
			}
		});
	}

	protected void showList() {
		// dao���׼� �Ľ��� ����� ��� �ִ� ArrayList �ٴ����
		// �޾ƿ� ArrayListfh ghkaus(JList)�� �Ѹ���
		List<News> data = dao.getNewsList("http://rss.etnews.com/Section902.xml");
		
		li.removeAll();
		
		// ArrayList�� �迭�� �ٲ۴����� ����־��ָ�
		// �ϳ��� �ϳ��� ������ list�� ���پ� �����ش�.
		System.out.println(Arrays.toString(data.toArray()));
		li.setListData(data.toArray());
	}

	private void createGUI() {
		f = new JFrame("NewsList");
		JPanel p = new JPanel();
		b = new JButton("News List ȣ��");
		li = new JList();

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportView(li);
		
		ta = new JTextArea();
		ta.setLineWrap(true);
		
		p.setLayout(new BorderLayout());
		p.add(b, "North");
		p.add(scrollPane);
		
		f.setLayout(new GridLayout(2,1,5,5));
		f.add(p);
		f.add(ta);
		f.setSize(400, 500);
		f.setVisible(true);
	}
	

	public static void main(String[] args) {
		new NewsMain();
	}


}
