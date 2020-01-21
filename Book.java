
public class Book extends WrittenItem {

	
	public Book(int idNum, String title, int numOfCopies) {
		super(idNum, title, numOfCopies, numOfCopies, title);
		// TODO Auto-generated constructor stub
	}

	public void checkIn() {
		System.out.println("Overriding in Check in from Book.");
	}
	
	public void checkOut() {
		System.out.println("Overridding in Check Out from Book.");
	}

	// Override 
	public void getter(){
			
	}
	public void setter() {
			
	}
}
