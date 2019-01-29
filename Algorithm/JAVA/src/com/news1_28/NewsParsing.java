package com.news1_28;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class NewsParsing {

	public static void main(String[] args) {
		new NewsParsing().process();

		

	}

	private static void process() {
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder parser = dbf.newDocumentBuilder();
			Document doc = parser.parse("src/com/xml1_28/news.xml");
			
			NodeList itemList = doc.getElementsByTagName("item");
			
			int len = itemList.getLength();
			
			for(int i = 0; i < len; i++) {
				Node item = itemList.item(i);
				NodeList childList = item.getChildNodes();
				
				for(int j = 0; j < childList.getLength(); j++) {
					Node child = childList.item(j);
					String nodeName = child.getNodeName();
					
					if(nodeName.equals("title")) {
						// �̸� ���
						System.out.println(child.getFirstChild().getNodeValue());
					}
					else if(nodeName.equals("pubDate")) {
						// �ּ� ���
						// �ڽ��� ������ 1���ۿ� ���� ������ FirstChild�� �ؼ� ����ϸ��.
						System.out.println(child.getFirstChild().getNodeValue());
					}
					
				}
				
				
			}
			
			
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}

}
