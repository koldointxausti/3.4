package com.zubiri.agenda;
import java.util.ArrayList;

public class Contact {
	private Person person = new Person();
	private int telephoneNum;
	private String address;
	
	public void setPerson(Person person) {
		this.person=person;
	}
	public Person getPerson(){
		return this.person;
	}
	
	public void setTelephoneNum(int tfn) {
		this.telephoneNum=tfn;
	}
	public int getTelephoneNum(){
		return this.telephoneNum;
	}
	
	public void setAddress(String adrs) {
		this.address=adrs;
	}
	public String getAddress(){
		return this.address;
	}
}
