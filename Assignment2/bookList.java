package Assignment2;

import java.util.*;


public class bookList  {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Book> books = new ArrayList<Book>();
		books.add(new Book(1, "Suraj", "Kumar", "Penguin", 10));
		books.add(new Book(2, "Ravi", "Kumawat", "WallMart", 20));
		books.add(new Book(3, "Anurag", "Bhimra", "Goldmine", 30));
		books.add(new Book(4, "Naveen", "Sharma", "Harlik", 40));
		
		System.out.println(books);
		
		ListIterator litr=books.listIterator();
		Book b = null;
		while(litr.hasNext()) {
			b = (Book)litr.next();
			System.out.println(b.getName());
			
		}
		while(true) {
			System.out.println("1: Member Id Sort \n 2: Name Sort \n 3: Author Sort \n 4: Publisher Sort \n 5: Quantity sort \n 6: For Exit ");
			int ch = sc.nextInt();
			if(ch == 1) {
				System.out.println("Sorted by Member Id");
				sort s = new sort();
				books.sort(s);
				System.out.println(books);
			}
			else if(ch == 2) {
				System.out.println("Sorted by Name");
				SortByName sn = new SortByName();
				books.sort(sn);
				System.out.println(books);
			}
			else if(ch == 3) {
				System.out.println("Sorted by Author");
				sortByAuthor ab = new sortByAuthor();
				books.sort(ab);
				System.out.println(books);
			}
			else if(ch == 4) {
				System.out.println("Sorted by publisher");
				publisher pb = new publisher();
				books.sort(pb);
				System.out.println(books);
			}
			else if(ch == 5) {
				System.out.println("Sorted by Quantity");
				quantity q = new quantity();
				books.sort(q);
				System.out.println(books);
			}
			else if(ch == 6) {
				System.exit(1);
			}
			else {
				System.out.println("Please Input a valid Argument");
				//break;
			}
		}
		
	}

}
