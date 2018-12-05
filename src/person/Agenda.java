package person;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
	private ArrayList<Contact> contacts = new ArrayList<Contact>();
	
	Scanner sc = new Scanner(System.in);

	public void setContacts(ArrayList<Contact> _contacts) {
		this.contacts = _contacts;
	}
	public ArrayList<Contact> getContacts() {
		return contacts;
	}
	
	public void setPersons() {
		
		persons.add(newPerson);
	}

	public Person getPersons(int i) {
		return persons.get(i);
	}

	public void delInfo(int i) {
		persons.remove(i);
		telephoneNum.remove(i);
		address.remove(i);
	}

	public void setTelephoneNum() {
		System.out.println("Mobile number:");
		boolean flag = true;
		while (flag) {
			if (sc.hasNextInt()) {
				int tfn = sc.nextInt();
				if (Integer.toString(tfn).length() != 9) {
					System.out.println("The mobile number has to be of 9 digits. Try again:");
				} else {
					telephoneNum.add(tfn);
					flag = false;
				}
			}
		}
	}

	public int getTelephoneNum(int i) {
		return telephoneNum.get(i);
	}

	public void setAddress() {
		sc.nextLine();
		System.out.println("Address:");
		String adrs = sc.nextLine();
		address.add(adrs);
	}

	public String getAddress(int i) {
		return address.get(i);
	}

	public int searchPersonName() {
		String name =sc.nextLine();
		int position = -1;
		for (int i = 0; i < persons.size(); i++) {
			if (name.compareTo(persons.get(i).getName()) == 0) {
				position = i;
			}
		}
		return position;
	}
}
