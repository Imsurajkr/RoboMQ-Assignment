package com.robomq.pojo;

public class Customer {
	
	public Customer(int custid, int mobno, String name, String email, String address) {
		super();
		this.custid = custid;
		this.mobno = mobno;
		this.name = name;
		this.email = email;
		this.address = address;
	}
	public Customer(){
		
	}
	private int custid,mobno;
	private String name, email,address;
	
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public int getMobno() {
		return mobno;
	}
	public void setMobno(int mobno) {
		this.mobno = mobno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", mobno=" + mobno + ", name=" + name + ", email=" + email + ", address="
				+ address + "]";
	}
}
