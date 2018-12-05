package person;
import java.util.ArrayList;

public class Contact {
	private ArrayList<Person> persons = new ArrayList<Person>();
	private ArrayList<Integer> telephoneNum = new ArrayList<Integer>();
	private ArrayList<String> address = new ArrayList<String>();
	
	public void setPersons(ArrayList<Person> pers) {
		this.persons=pers;
	}
	public ArrayList<Person> getPersons(){
		return this.persons;
	}
	
	public void setTelephoneNum(ArrayList<Integer> tfn) {
		this.telephoneNum=tfn;
	}
	public ArrayList<Integer> getTelephoneNum(){
		return this.telephoneNum;
	}
	
	public void setAddress(ArrayList<String> adrs) {
		this.address=adrs;
	}
	public ArrayList<String> getAddress(){
		return this.address;
	}
}
