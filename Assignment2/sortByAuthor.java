package Assignment2;

import java.util.Comparator;

import Assignment2.Book;

public class sortByAuthor implements Comparator<Book>{

	@Override
	public int compare(Book auth1, Book auth2) {
		String data1 = auth1.getAuthor();
		String data2 = auth2.getAuthor();
		int r = data1.compareTo(data2);
		return r;
	}

}
