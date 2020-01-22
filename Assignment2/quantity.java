package Assignment2;

import java.util.Comparator;

import Assignment2.Book;

public class quantity implements Comparator<Book>{

	@Override
	public int compare(Book quant1, Book quant2) {
		int r = (int)((int)quant1.getQuantity() - quant2.getQuantity());
		return r;
	}

}
