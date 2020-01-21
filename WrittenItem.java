
public abstract class WrittenItem extends item {
	
	private int authorId;
	private String authorName;
	
	public WrittenItem(int idNum, String title, int numOfCopies, int authorId, String authorName) {
		super(idNum, title, numOfCopies);
		this.authorId = authorId;
		this.authorName = authorName;
		// TODO Auto-generated constructor stub
	}
	


	public void checkIn() {
		System.out.println("Overriding in Check in from Written Item.");
	}
	
	public void checkOut() {
		System.out.println("Overridding in Check Out from Written Item ");
	}
// Override 
	public void getter(){
		
	}
	public void setter() {
		
	}
}
