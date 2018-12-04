package person;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
	private ArrayList<Person> persons = new ArrayList<Person>();
	private ArrayList<Integer> telephoneNum = new ArrayList<Integer>();
	private ArrayList<String> address = new ArrayList<String>();
	Scanner sc = new Scanner(System.in);

	public void setPersons() {
		Person newPerson = new Person();
		System.out.println("Name:");
		newPerson.setName(sc.next());
		boolean flag = true;
		while (flag) {
			System.out.println("Age:");
			if (sc.hasNextInt()) {
				newPerson.setAge(sc.nextInt());
				if (newPerson.getAge() > 0)
					flag = false;
				else
					System.out.println("It has to be a positive number.");
			} else
				System.out.println("It has to be a number.");
		}
		System.out.println("DNI:");
		flag = true;
		while (flag) {
			newPerson.setDni(sc.next());
			if (newPerson.getDni().length() != 9) {
				System.out.println("The DNI has to be 9 digits long. Try again:");
			} else {
				flag = false;
			}
		}
		flag = true;
		System.out.println("Weight:");
		while (flag) {
			if (sc.hasNextInt()) {
				newPerson.setWeight(sc.nextInt());
				flag = false;
			} else {
				System.out.println("You have to enter a number");
			}
		}
		flag = true;
		System.out.println("Height:");
		while (flag) {
			if (sc.hasNextInt()) {
				newPerson.setHeight(sc.nextInt());
				flag = false;
			} else {
				System.out.println("It has to be a number");
			}
		}
		persons.add(newPerson);
	}
	public ArrayList getPersonsName() {
		return persons;
	}
	
	public void setTelephoneNum() {
		System.out.println("Mobile number:");
		boolean flag = true;
		while (flag) {
			if (sc.hasNextInt()) {
				Integer tfn = sc.nextInt();
				if (Integer.toString(tfn).length() != 9) {
					System.out.println("The mobile number has to be of 9 digits. Try again:");
				} else {
					telephoneNum.add(tfn);
					flag = false;
				}
			}
		}
	}
	public ArrayList telephoneNum() {
		return telephoneNum;
	}
	
	public void setAddress() {
		System.out.println("Address:");
		sc.next();
		String adrs = sc.nextLine();
		address.add(adrs);
	}
	public ArrayList getAddress() {
		return address;
	}
}
