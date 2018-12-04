package person;

import java.util.ArrayList;
import java.util.Scanner;

public class Interface {
	public static void main(String[] args) {
		boolean repeat = true;
		Agenda x = new Agenda();
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
				x.setPerson();
				x.setTelephoneNum();
				x.setAddress();
				break;
			case 2:
				System.out.println("*VIEW A PERSON*");
				System.out.println("Whose information do you want? (Enter hers/his name)");
				boolean found = false;
				String name = sc.next();
				for (int i = 0; i < persons.size(); i++) {
					if (name.compareTo(persons.get(i).getName()) == 0) {
						found = true;
						System.out.println("Name: " + persons.get(i).getName());
						System.out.println("Age: " + persons.get(i).getAge());
						System.out.println("Weight: " + persons.get(i).getWeight());
						System.out.println("Height: " + persons.get(i).getHeight());
						System.out.println("DNI: " + persons.get(i).getDni());
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
				for (int i = 0; i < persons.size(); i++) {
					if (name.compareTo(persons.get(i).getName()) == 0) {
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
									persons.get(i).setName(newName);
									break;
								case 2:
									System.out.println("How old are you?");
									int newAge = sc.nextInt();
									persons.get(i).setAge(newAge);
									break;
								case 3:
									System.out.println("What weight do you want?");
									int newWeight = sc.nextInt();
									persons.get(i).setWeight(newWeight);
									break;
								case 4:
									System.out.println("What height do you want?");
									int newHeight = sc.nextInt();
									persons.get(i).setWeight(newHeight);
									break;
								case 5:
									System.out.println("What DNI do you want?");
									String newDni = sc.next();
									persons.get(i).setDni(newDni);
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
				for (int i = 0; i < persons.size(); i++) {
					if (name.compareTo(persons.get(i).getName()) == 0) {
						found = true;
						persons.remove(i);
						address.remove(i);
						telephoneNum.remove(i);
						System.out.println("The information about " + name + " has been erased");
						break;
					}
				}
				if (found == false) {
					System.out.println("There's no " + name + " created yet");
				}
				break;
			}
		}
	}

}
