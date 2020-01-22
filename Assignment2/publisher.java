package Assignment2;

import java.util.Comparator;

import Assignment2.Book;

public class publisher implements Comparator<Book>{

	@Override
	public int compare(Book publish1, Book publish2) {
		String pub1 = publish1.getPublisher();
		String pub2 = publish2.getPublisher();
		int r = pub1.compareTo(pub2);
		return r;
	}

}
