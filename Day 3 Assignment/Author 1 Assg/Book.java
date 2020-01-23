package Assignment3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Book {

	public void displayAll(TreeMap<String, Author> books) {
		System.out.println(books);
	}

	public void displayAuthorBooks(TreeMap<String, Author> books) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		Set<String> keys = books.keySet();
		Author author;
		for (String s : keys) {
			author = books.get(s);
			String s1 = author.getName();

			if (!map.containsKey(s1)) {
				map.put(s1, 1);
			} else {
				int count = map.get(s1);
				map.put(s1, count + 1);
				System.out.println(s1);
			}
		}
	}

	public static void main(String[] args) {
		TreeMap<String, Author> books = new TreeMap<String, Author>();
		books.put("An Autobiography", new Author(1001, "Jawaharlal Nehru", "India"));
		books.put("Gita Govinda", new Author(1002, "Jayadev", "India"));
		books.put("Harry Potter and the Sorcerer's Stone (Book 1)", new Author(1004, "J. K. Rowling ", "USA"));
		books.put("The Lord of the Rings", new Author(1003, "J. R. R. Tolkien", "Russia"));
		books.put("Life of Pi", new Author(1005, "Yann Martel", "England"));
		books.put("The Fellowship of the Ring", new Author(1003, "J. R. R. Tolkien", "Russia"));
		books.put("Harry Potter and the Half-Blood Prince", new Author(1004, "J. K. Rowling ", "USA"));

		Book b1 = new Book();
		b1.displayAll(books);
		b1.displayAuthorBooks(books);

	}
}
