
public abstract class mediaItem extends item {

	@SuppressWarnings("unused")
	private int duration;
	
	public mediaItem(int idNum, String title, int numOfCopies) {
		super(idNum, title, numOfCopies);
	}
	public void checkIn() {
		System.out.println("Overriding in Media Item.");
	}
	
	public void checkOut() {
		System.out.println("Overridding in Media Item out");
	}

	// Override 
	public void getter(){
			
	}
	public void setter() {
			
	}
	
}
