package Assignment2;

import java.util.Comparator;

public class sort implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
	int r = (int) ((int)o1.getMemId() - o2.getMemId());
	return r;
	}


}
