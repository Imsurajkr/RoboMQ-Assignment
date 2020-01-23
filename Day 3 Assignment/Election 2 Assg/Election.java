package Assignment3;


public class Election implements Comparable<Election>{
	public Election(int electionId, String name, String electiondate, String district, String constituency,
			String countingDate) {
		super();
		ElectionId = electionId;
		this.name = name;
		this.electiondate = electiondate;
		District = district;
		Constituency = constituency;
		CountingDate = countingDate;
	}
	@Override
	public String toString() {
		return "\nElection [ElectionId=" + ElectionId + ", name=" + name + ", electiondate=" + electiondate
				+ ", District=" + District + ", Constituency=" + Constituency + ", CountingDate=" + CountingDate + "]";
	}
	private int ElectionId;
	private String name;
	private String electiondate;
	private String District;
	private String Constituency;
	private String CountingDate;
	
	public int getElectionId() {
		return ElectionId;
	}
	public void setElectionId(int electionId) {
		ElectionId = electionId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getElectiondate() {
		return electiondate;
	}
	public void setElectiondate(String electiondate) {
		this.electiondate = electiondate;
	}
	public String getDistrict() {
		return District;
	}
	public void setDistrict(String district) {
		District = district;
	}
	public String getConstituency() {
		return Constituency;
	}
	public void setConstituency(String constituency) {
		Constituency = constituency;
	}
	public String getCountingDate() {
		return CountingDate;
	}
	public void setCountingDate(String countingDate) {
		CountingDate = countingDate;
	}
	

	public int hashCode() {
		return name.hashCode();
	}
	public boolean equals(Object o) {
		boolean flag=false;
		if (o instanceof Election) {
			Election e =(Election)o;
					if(e.ElectionId==this.ElectionId)
						flag=true;
		}
		return flag;
	}
	@Override
	public int compareTo(Election e1) {
		int r=this.getName().compareTo(e1.getName());
		return r;
	}

	
}
