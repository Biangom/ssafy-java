

import java.util.ArrayList;

public interface IBookMgr {
		// 1. ������ �Է� ���
		public void add(Book p);
		
		// 2. ������ ��ü ��� ���
		public ArrayList<Book> search();
		
		// 3. ������ �ǸŵǾ� ��� ������ ���� ���
		void sell(String isbn, int quantity) throws QuantityException, ISBNNotFoundException;
		
		// 4. ������ ���ŵǾ� ��� ������ ���ϴ� ���
		void buy(String isbn, int quantity) throws ISBNNotFoundException;
		
		// 5. ��� �������� ����*�ݾ��� �Ͽ� �� ��� �ݾ��� ���Ͽ� ����
		int getTotalAmount();
		
		// 6. Ŭ���� �����ÿ� ȣ��Ǿ� ����, ����("book.dat")�� ����� ������ �о
		// ArrayList�� �����Ѵ�.
		void open();
		
		// 7. ���α׷� ����ÿ� ȣ��Ǿ� ����, ArrayList�� �ִ� ���� ������ ���Ϸ� �����Ѵ�.
		void close();
}
