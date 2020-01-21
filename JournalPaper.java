
public class JournalPaper extends WrittenItem {
	
	private int year;
	public JournalPaper(int idNum, String title, int numOfCopies) {
		super(idNum, title, numOfCopies, numOfCopies, title);
		// TODO Auto-generated constructor stub
	}

	public void checkIn() {
		System.out.println("Overriding in Check in from Journal Paper.");
	}
	
	public void checkOut() {
		System.out.println("Overridding in Check Out from Journal Paper ");
	}

	// Override 
	public void getter(){
			
	}
	public void setter() {
			
	}
}
