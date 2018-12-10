package person;

import java.util.ArrayList;

public class Agenda {
	private ArrayList<Contact> contacts = new ArrayList<Contact>();

	public void setContacts(ArrayList<Contact> _contacts) {
		this.contacts = _contacts;
	}

	public ArrayList<Contact> getContacts() {
		return this.contacts;
	}

	public void addContact(Contact _contact) {
		this.contacts.add(_contact);
	}

	public int findContact(String name) {
		int position = -1;
		for (int i = 0; i < contacts.size(); i++) {
			if (name.compareTo(contacts.get(i).getPerson().getName()) == 0) {
				position = i;
			}
		}
		return position;
	}

	public void deleteContact(int i) {
		contacts.remove(i);
	}
	
	public Contact getContact(int index) {
		return contacts.get(index);
	}

	public void modifyContact(Contact _contact, int index) {
		contacts.add(index, _contact);
	}

	public void listContacts() {
		for (int i = 0; i < contacts.size(); i++) {
			System.out.println(contacts.get(i).getPerson().getName());
		}
	}

}
