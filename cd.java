
public class cd extends mediaItem {
	
	private int artist;
	private int genre;

	public cd(int idNum, String title, int numOfCopies) {
		super(idNum, title, numOfCopies);
		// TODO Auto-generated constructor stub
	}
	public void checkIn() {
		System.out.println("Overriding in MediaItem from cd.");
	}
	
	public void checkOut() {
		System.out.println("Overridding in MediaItem from cd.");
	}

	// Override 
	public void getter(){
			
	}
	public void setter() {
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
