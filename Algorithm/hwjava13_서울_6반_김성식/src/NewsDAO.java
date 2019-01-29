

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

public class NewsDAO implements INewsDAO{
	// �޾ƿ� �� ListŸ���̿��� List�� ������
	List<News> list; // �Ľ̵� ����� ����Ǿ� �ִ� ����Ʈ

	Document doc;
	NewsDAO() {}

	@Override
	public List<News> getNewsList(String url) {
		list = new ArrayList<News>();
		//�غ��۾�
		DocumentBuilder parser;
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			parser = dbf.newDocumentBuilder();
			InputStream in = new URL(connectNews()).openConnection().getInputStream();
//			InputStream in = new URL().openConnection().getInputStream();
			
			doc = parser.parse(in);
		} catch (ParserConfigurationException | IOException | SAXException e) {
			e.printStackTrace();
		}
		// InputStream �ؼ� �޾ƿ´�
		
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
//							System.out.println(child.getFirstChild().getNodeValue());
				}
				else if(nodeName.equalsIgnoreCase("description")) {
					// �ּ� ���
					// �ڽ��� ������ 1���ۿ� ���� ������ FirstChild�� �ؼ� ����ϸ��.
					w.setDesc(child.getFirstChild().getNodeValue());
//							System.out.println(child.getFirstChild().getNodeValue());
				}
				else if(nodeName.equalsIgnoreCase("link")) {
					// �ּ� ���
					// �ڽ��� ������ 1���ۿ� ���� ������ FirstChild�� �ؼ� ����ϸ��.
					w.setLink(child.getFirstChild().getNodeValue());
//							System.out.println(child.getFirstChild().getNodeValue());
				}
			} // end of childList
			list.add(w); // ArrayList ����
			// �̷��� DAO�� ������ ����
		}// end of itemList
		return list;
	}

	@Override
	public News search(int index) {
		return list.get(index);
	}
	
	private String connectNews() {
		String url = "http://rss.etnews.com/Section902.xml";
		return url;
	}
}
