package person;

import java.util.Scanner;
import java.util.ArrayList;

public class Agenda {
	public static void main(String[] args) {
		boolean repeat = true;

		ArrayList<Person> contacts = new ArrayList<Person>();
		ArrayList<Integer> telephoneNum = new ArrayList<Integer>();
		ArrayList<String> address = new ArrayList<String>();

		while (repeat) {
			System.out.println("*MENU*");
			System.out.println("[1] Create a new person");
			System.out.println("[2] View an existing person");
			System.out.println("[3] Modify an existing person");
			System.out.println("[4] Delete an existing person");
			System.out.println("[0] Exit");
			Scanner sc = new Scanner(System.in);
			int option = sc.nextInt();
			switch (option) {
			case 0:
				System.out.println("The program has been stopped");
				repeat = false;
				break;
			case 1:
				System.out.println("*CREATE A NEW PERSON*");
				Person a = new Person();
				System.out.println("Name:");
				a.setName(sc.next());
				boolean flag = true;
				while (flag) {
					System.out.println("Age:");
					if (sc.hasNextInt()) {
						a.setAge(sc.nextInt());
						if (a.getAge() > 0)
							flag = false;
						else
							System.out.println("It has to be a positive number.");
					} else
						System.out.println("It has to be a number.");
				}
				System.out.println("DNI:");
				flag = true;
				while (flag) {
					a.setDni(sc.next());
					if (a.getDni().length() != 9) {
						System.out.println("The DNI has to be 9 digits long. Try again:");
					} else {
						flag = false;
					}
				}
				flag = true;
				System.out.println("Weight:");
				while (flag) {
					if (sc.hasNextInt()) {
						a.setWeight(sc.nextInt());
						flag = false;
					} else {
						System.out.println("You have to enter a number");
					}
				}
				flag = true;
				System.out.println("Height:");
				while (flag) {
					if (sc.hasNextInt()) {
						a.setHeight(sc.nextInt());
						flag = false;
					} else {
						System.out.println("It has to be a number");
					}
				}
				contacts.add(a);
				System.out.println("Mobile number:");
				flag = true;
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
				System.out.println("Address:");
				sc.next();
				String adrs = sc.nextLine();
				address.add(adrs);
				System.out.println();
				break;
			case 2:
				System.out.println("*VIEW A PERSON*");
				System.out.println("Whose information do you want? (Enter hers/his name)");
				boolean found = false;
				String name = sc.next();
				for (int i = 0; i < contacts.size(); i++) {
					if (name.compareTo(contacts.get(i).getName()) == 0) {
						found = true;
						System.out.println("Name: " + contacts.get(i).getName());
						System.out.println("Age: " + contacts.get(i).getAge());
						System.out.println("Weight: " + contacts.get(i).getWeight());
						System.out.println("Height: " + contacts.get(i).getHeight());
						System.out.println("DNI: " + contacts.get(i).getDni());
						System.out.println("Telephone number: " + telephoneNum.get(i));
						System.out.println("Address: " + address.get(i));
						break;
					}
				}
				if (found == false) {
					System.out.println("There's no " + name + " created yet");
				}
				System.out.println();
				break;
			case 3:
				System.out.println("*MODIFY A PERSON*");
				System.out.println("Whose information do you want to change? (Enter hers/his name)");
				found = false;
				name = sc.next();
				for (int i = 0; i < contacts.size(); i++) {
					if (name.compareTo(contacts.get(i).getName()) == 0) {
						found = true;
						boolean flag1 = true;
						while (flag1) {
							System.out.println("What do you want to change?");
							System.out.println(" - 1 - Name");
							System.out.println(" - 2 - Age");
							System.out.println(" - 3 - Weight");
							System.out.println(" - 4 - Height");
							System.out.println(" - 5 - DNI");
							System.out.println(" - 6 - Telephone number");
							System.out.println(" - 7 - Address");
							System.out.println(" - 0 - None");
							if (sc.hasNextInt()) {
								int change = sc.nextInt();
								switch (change) {
								case 0:
									flag1 = false;
									break;
								case 1:
									System.out.println("What name do you want?");
									String newName = sc.next();
									contacts.get(i).setName(newName);
									break;
								case 2:
									System.out.println("How old are you?");
									int newAge = sc.nextInt();
									contacts.get(i).setAge(newAge);
									break;
								case 3:
									System.out.println("What weight do you want?");
									int newWeight = sc.nextInt();
									contacts.get(i).setWeight(newWeight);
									break;
								case 4:
									System.out.println("What height do you want?");
									int newHeight = sc.nextInt();
									contacts.get(i).setWeight(newHeight);
									break;
								case 5:
									System.out.println("What DNI do you want?");
									String newDni = sc.next();
									contacts.get(i).setDni(newDni);
									break;
								case 6:
									System.out.println("What mobile number do you want?");
									Integer newTelephoneNum = sc.nextInt();
									newTelephoneNum = telephoneNum.get(i);
									break;
								case 7:
									System.out.println("Which is the new address?");
									String newAdrs = sc.nextLine();
									newAdrs = address.get(i);
									break;
								default:
									System.out.println("Enter one of the options bellow:");
									System.out.println();
								}
								System.out.println();
							} else {
								System.out.println("You have to enter the number of the option you want:");
								System.out.println();
							}
						}
					}
				}
				if (found == false) {
					System.out.println("There's no " + name + " created yet");
				}
				System.out.println();
				break;
			case 4:
				System.out.println("*DELETE A PERSON*");
				System.out.println("Who do you want to delete?");
				found = false;
				name = sc.next();
				for(int i = 0; i<contacts.size();i++) {
					if(name.compareTo(contacts.get(i).getName())==0) {
						found=true;
						contacts.remove(i);
						System.out.println("The information about "+name+" has been erased");
						break;
					}
				}
				if(found==false) {
					System.out.println("There's no "+name+" created yet");
				}
				break;
			}
		}
	}

}
