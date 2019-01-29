package wsjava13_����_6��_�輺��;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class WeatherDAO {
	// �޾ƿ� �� ListŸ���̿��� List�� ������
	private static WeatherDAO weatherDAO;
	private List<Weather> list; // �Ľ̵� ����� ����Ǿ� �ִ� ����Ʈ
	String url = "http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=1162058500";
			
	Document doc;
	private WeatherDAO() throws Exception {
		list = new ArrayList<Weather>();
		//�غ��۾�
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder parser = dbf.newDocumentBuilder();
//		InputStream in = new URL(url).openConnection().getInputStream();
		// InputStream �ؼ� �޾ƿ´�
		
		// �ٷ� �ּҸ� �־ �ȴ�.
//		doc = parser.parse(in);
		doc = parser.parse(url);
			// Document doc = parser.parse("xml/member.xml");
	}
	
	public static WeatherDAO getInstance() throws Exception {
		if(weatherDAO == null) {
			weatherDAO = new WeatherDAO();
		}
		return weatherDAO;
	}
	
	public List<Weather> getWeatherData() {
		// ���� ���� ����� ���� vo�ȿ� ������ ���ѳ��ƾ� �Ѵ�.
		// loop�ȿ��� ������ �������� new��ü �����ϸ鼭, vo�� ������ �س��ƾ��Ѵ�.
		
		NodeList itemList = doc.getElementsByTagName("data");
		
		int len = itemList.getLength();
		list.clear();
		
		for(int i = 0; i < len; i++) {
			Weather w = new Weather();
			Node item = itemList.item(i);
			NodeList childList = item.getChildNodes();
			
			for(int j = 0; j < childList.getLength(); j++) {
				Node child = childList.item(j);
				String nodeName = child.getNodeName();
				
				if(nodeName.equalsIgnoreCase("hour")) {
					// �̸� ���
					w.setHour(Integer.parseInt(child.getFirstChild().getNodeValue()) );
//					System.out.println(child.getFirstChild().getNodeValue());
				}
				else if(nodeName.equalsIgnoreCase("temp")) {
					w.setTemp(Double.parseDouble( child.getFirstChild().getNodeValue()) );
				}
				else if(nodeName.equalsIgnoreCase("wfKor")) {
					w.setWfKor(child.getFirstChild().getNodeValue());
				}
				else if(nodeName.equalsIgnoreCase("reh")) {
					w.setReh(Integer.parseInt(child.getFirstChild().getNodeValue()) );
				}
			} // end of childList
			list.add(w); // ArrayList ����
			// �̷��� DAO�� ������ ����
		}// end of itemList
		return list;
		
		
		
	}

}
