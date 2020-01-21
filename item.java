
public abstract class item {
	
	private int idNum;
	private String title;
	private int numOfCopies;
	
	public item(int idNum , String title, int numOfCopies) {
		this.setIdNum(idNum);
		this.numOfCopies = numOfCopies;
		this.title = title;
	}
	
	
	public void checkIn() {
		System.out.println("The user Check in Int class.");
	}
	
	public void checkOut() {
		System.out.println("The User check out of int class.");
	}
	public void getter() {
		
	}
	public void setter() {
		
	}	
	// Getting the values 
	public int getIdNum() {
		return idNum;
	}
	public String getTitle() {
		return title;
	}
	public int getNumOfCopies() {
		return numOfCopies;
	}
	// Setting the values 
	public void setIdNum(int idNum) {
		this.idNum = idNum;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setNumOfCopies(int numOfCopies) {
		this.numOfCopies = numOfCopies;
	}

}
