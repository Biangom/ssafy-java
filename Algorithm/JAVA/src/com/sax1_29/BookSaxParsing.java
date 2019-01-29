package com.sax1_29;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class BookSaxParsing extends DefaultHandler {
	
	public BookSaxParsing() {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser parser;
		try {
			parser = factory.newSAXParser();
			parser.parse("xml/book.xml", new FindBookEventHandler("author", "�̱Թ�")); // ��� ó���� �ڵ鷯�� ���ڷ� �־������
			// this : parsing ���� �߻��ϴ� ���ó���� ����� ��ü
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	// ������ ������ ���
	// ������ ���� ó�� �κ�. Document�� ������ �Ǹ�
	@Override
	public void startDocument() throws SAXException {
		System.out.println("document ����!");
	}

	// ������ ���� ���
	// ������ ���� ������ �κ�. Document�� ������
	@Override
	public void endDocument() throws SAXException {
		System.out.println("document ��");
	}

	// �������� �����ϴ� ������Ʈ�� ������ ��� ȣ����
	// ������Ʈ ������ �Ǹ�
	@Override											    // �±��̸�		   // �Ӽ�
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if(qName.equals("booklist")) {
			System.out.println("<booklist>");
		} else if (qName.equals("book")) {
			System.out.println("<book kind = " + attributes.getValue("kind") +">");
		} else if (qName.equals("title")) {
			System.out.println("<title>");
		} else if (qName.equals("author")) {
			System.out.println("<author>");
		} else if (qName.equals("publisher")) {
			System.out.println("<publisher>");
		} else if (qName.equals("price")) {
			System.out.println("<price>");
		}
	}

	// �������� ������ ������Ʈ�� ������ ��� ȣ����
	// ������Ʈ�� ������
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if(qName.equals("booklist")) {
			System.out.println("</booklist>");
		} else if (qName.equals("book")) {
			System.out.println("</book>");
		} else if (qName.equals("title")) {
			System.out.println("</title>");
		} else if (qName.equals("author")) {
			System.out.println("</author>");
		} else if (qName.equals("publisher")) {
			System.out.println("</publisher>");
		} else if (qName.equals("price")) {
			System.out.println("</price>");
		}
	}


	//�ؽ�Ʈ�� ������
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		String str = new String(ch, start, length);
		System.out.println(str);
	}



	public static void main(String[] args) {
		new BookSaxParsing();
	}
}
