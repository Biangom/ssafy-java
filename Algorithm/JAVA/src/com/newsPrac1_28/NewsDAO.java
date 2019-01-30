package com.newsPrac1_28;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class NewsDAO {
	// �޾ƿ� �� ListŸ���̿��� List�� ������
	List<News> list; // �Ľ̵� ����� ����Ǿ� �ִ� ����Ʈ
	String url = "http://api.newswire.co.kr/rss/industry/600";
			
	Document doc;
	NewsDAO() throws Exception {
		list = new ArrayList<News>();
		//�غ��۾�
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder parser = dbf.newDocumentBuilder();
		InputStream in = new URL(url).openConnection().getInputStream();
		// InputStream �ؼ� �޾ƿ´�
		
		doc = parser.parse(in);
			// Document doc = parser.parse("xml/member.xml");
	}
	
	public List<News> getNewsData() {
		// ���� ���� ����� ���� vo�ȿ� ������ ���ѳ��ƾ� �Ѵ�.
		// loop�ȿ��� ������ �������� new��ü �����ϸ鼭, vo�� ������ �س��ƾ��Ѵ�.
		
		NodeList itemList = doc.getElementsByTagName("item");
		
		int len = itemList.getLength();
		
		for(int i = 0; i < len; i++) {
			News w = new News();
			Node item = itemList.item(i);
			NodeList childList = item.getChildNodes();
			
			for(int j = 0; j < childList.getLength(); j++) {
				Node child = childList.item(j);
				String nodeName = child.getNodeName();
				
				if(nodeName.equalsIgnoreCase("title")) {
					// �̸� ���
					w.setTitle(child.getFirstChild().getNodeValue());
//					System.out.println(child.getFirstChild().getNodeValue());
				}
				else if(nodeName.equals("pubDate")) {
					// �ּ� ���
					// �ڽ��� ������ 1���ۿ� ���� ������ FirstChild�� �ؼ� ����ϸ��.
					w.setPubDate(child.getFirstChild().getNodeValue());
//					System.out.println(child.getFirstChild().getNodeValue());
				}
			} // end of childList
			list.add(w); // ArrayList ����
			// �̷��� DAO�� ������ ����
		}// end of itemList
		return list;
		
		
		
	}
}
