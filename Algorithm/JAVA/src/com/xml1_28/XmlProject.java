package com.xml1_28;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XmlProject {
	public static void main(String[] args) throws Exception {
		// �� 4Line �ܿ����� ���迡 ����
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder parser = dbf.newDocumentBuilder();
		
		// dom tree ���� ���� �ִ� ���� ��带 ����Ŵ
		Document xmldoc = parser.parse("./src/com/xml1_28/NewFile.xml");
		
		//root ������Ʈ�� ����Ŵ
		Element list = xmldoc.getDocumentElement();
		
		// �±� �̸� �������� �˻�
		NodeList names = list.getElementsByTagName("name");
		int length = names.getLength();
		
		for(int i = 0; i < length; i++) {
			/*
			 * <name>�±� ��ü�� �� �������Ե�
			 * 
			 */
			Node name = names.item(i); // name element �� ��
			Node text = name.getFirstChild(); 
			// <name>�輺��</name> text node�� "�輺��"�� ����
			// lastChild��� �ص� �ȴ�.
			// �ٷ� �Ȼ̾�����. text�� nodeŸ���̴�. 
			// �׷��� ���������� text node���� ���� �̾ƾ� �ϹǷ� getNodeValue�޼ҵ� ȣ��
			System.out.println(text.getNodeValue());
		}
		
		
//		System.out.println(list.getTextContent());
//		getNode(list);
	}
	
	public static void getNode(Node n) {
		for(Node ch = n.getFirstChild();ch != null; ch = ch.getNextSibling()) {
//			if(ch.getNodeType() == Node.ELEMENT_NODE) {
				System.out.println(ch.getNodeName());
//			}
		}		
	}

}
