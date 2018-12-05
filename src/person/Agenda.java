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
