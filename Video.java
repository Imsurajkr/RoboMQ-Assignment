
public class Video extends mediaItem{
	
	
	public Video(int idNum, String title, int numOfCopies) {
		super(idNum, title, numOfCopies);
		// TODO Auto-generated constructor stub
	}
	private String Director;
	private String genre;
	
	
	public void checkIn() {
		System.out.println("Overriding in MediaItem from Video.");
	}
	
	public void checkOut() {
		System.out.println("Overridding in MediaItem from Video Out ");
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
