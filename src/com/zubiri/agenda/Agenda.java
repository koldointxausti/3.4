package com.zubiri.agenda;

import java.util.ArrayList;

public class Agenda {
	private ArrayList<Contact> contacts = new ArrayList<Contact>();
	private ArrayList<Contact> favContacts = new ArrayList<Contact>();

	public void setContacts(ArrayList<Contact> _contacts) {
		this.contacts = _contacts;
	}

	public ArrayList<Contact> getContacts() {
		return this.contacts;
	}
	
	public void setFavContacts(ArrayList<Contact> _favContacts) {
		this.favContacts=_favContacts;
	}
	public ArrayList<Contact> getFavContacts(){
		return this.favContacts;
	}
	
	/**
	 * @author koldo
	 * This method adds objects to agenda's ArrayList
	 * @param contact class object
	 */
	public void addContact(Contact _contact) {
		this.contacts.add(_contact);
	}
	
	/**
	 * @author Koldo
	 * <p>This method finds a contact by hers/his name</p>
	 * @param name the name of the contact you want to find
	 * @return the position of the ArrayList or the number '-1' if the name doesn't match
	 */
	public int findContact(String name) {
		int position = -1;
		for (int i = 0; i < contacts.size(); i++) {
			if (name.compareTo(contacts.get(i).getPerson().getName()) == 0) {
				position = i;
			}
		}
		return position;
	}
	
	/**
	 * @author Koldo 
	 * <p>This method deletes a contact</p>
	 * @param index the position on the ArrayList of the contact we want to delete
	 */
	public void deleteContact(int index) {
		contacts.remove(index);
	}
	
	/**
	 * @author Koldo
	 * @param index the position of the contact you want
	 * @return Contact class object
	 * <p>This method gives you a contact in the position you ask</p>
	 */
	public Contact getContact(int index) {
		return contacts.get(index);
	}
	
	/**
	 * @author Koldo
	 * @param _contact the Contact class object
	 * @param index the position in the ArrayList where you want to set it
	 * <p>This method sets a contact in the position of the ArrayList you specify</p>
	 */
	public void modifyContact(Contact _contact, int index) {
		contacts.add(index, _contact);
	}
	
	/**
	 * @author Koldo
	 * <p>This method gives a list of the names of each of the elements in the ArrayList</p>
	 */
	public void listContacts() {
		for (int i = 0; i < contacts.size(); i++) {
			System.out.println(contacts.get(i).getPerson().getName());
		}
	}
	
	/**
	 * @author Koldo
	 * @param contact - the contact object you want to add to favorites
	 * <p>This method adds a contact object to an ArrayList of favorite contacts</p>
	 */
	public void addToFavorites(Contact contact) {
		favContacts.add(contact);
	}
	
	/**
	 * @author Koldo
	 * @param contact - the contact object you want to delete from favorites
	 * <p>This method removes a contact object from an ArrayList of favorite contacts</p>
	 */
	public void deleteFavorite(Contact contact) {
		favContacts.remove(contact);
	}
	
	/**
	 * @author Koldo
	 * <p>This method gives the list of names of favorites contacts
	 */
	public void listFavorites() {
		for(int i= 0; i<favContacts.size();i++) {
			System.out.println(favContacts.get(i).getPerson().getName());
		} 
	}
	
	/**
	 * @author Koldo
	 * @param contact - the contact you want to copy
	 * @param times - how many times to you want to copy
	 */
	public void duplicateContact(Contact contact, int times) {
		for(int i=0; i<times;i++) {
			int counter = 0;
			for(int x=0; x<contacts.size();x++) {
				if(contacts.get(x).getPerson().getName().compareTo(contact.getPerson().getName())==0) {
					counter++;
				}
			}
			Contact newContact = new Contact();
			contact = newContact;
			newContact.getPerson().setName(contact.getPerson().getName() + "("+counter+")");
			contacts.add(newContact);
		}
	}
	
	public void orderContacts() {
		for (int i = 0; i < contacts.size()-2; i++) {
			if(contacts.get(i).getPerson().getName().compareTo(contacts.get(i + 1).getPerson().getName())>0) {
				int aux = i + 1;
				
			}
		}
	}
}
