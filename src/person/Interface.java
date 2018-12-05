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
			if (sc.hasNextInt()) {
				int option = sc.nextInt();
				switch (option) {
				case 0:
					System.out.println("The program has been stopped");
					repeat = false;
					break;
				case 1:
					System.out.println("*CREATE A NEW PERSON*");
					x.setPersons();
					
					/*
					 *Person newPerson = new Person();
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
					 */
					
					x.setTelephoneNum();
					x.setAddress();
					break;
				case 2:
					System.out.println("*VIEW A PERSON*");
					System.out.println("Whose information do you want? (Enter hers/his name)");
					int position = x.searchPersonName();
					if (position >= 0) {
						System.out.println("Name: "+x.getPersons(position).getName());
						System.out.println("Age: "+x.getPersons(position).getAge());
						System.out.println("Dni: "+x.getPersons(position).getDni());
						System.out.println("Weight: "+x.getPersons(position).getWeight());
						System.out.println("Height: "+x.getPersons(position).getHeight());
						System.out.println("Telephone number: "+x.getTelephoneNum(position));
						System.out.println("Address: "+x.getAddress(position));
					}else
						System.out.println("There's no person with that name created yet");
					System.out.println();
					break;
				case 3:
					System.out.println("*MODIFY A PERSON*");
					System.out.println("Whose information do you want to change? (Enter hers/his name)");
					boolean flag1 = true;
					position = x.searchPersonName();
					if (position >= 0) {
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
									System.out.println("What's the name you want?");
									x.getPersons(position).setName(sc.next());
									System.out.println(x.getPersons(position).getName());
									break;
								case 2:
									System.out.println("What age do you want?");
									x.getPersons(position).setAge(sc.nextInt());
									System.out.println(x.getPersons(position).getAge());
									break;
								case 3:
									System.out.println("What weight do you want?");
									x.getPersons(position).setWeight(sc.nextInt());
									System.out.println(x.getPersons(position).getWeight());
									break;
								case 4:
									System.out.println("What height do you want?");
									x.getPersons(position).setHeight(sc.nextInt());
									System.out.println(x.getPersons(position).getHeight());
									break;
								case 5:
									System.out.println("What DNI do you want?");
									x.getPersons(position).setDni(sc.next());
									System.out.println(x.getPersons(position).getDni());
									break;
								case 6:
									System.out.println("What mobile number do you want?");
									x.setTelephoneNum();
									x.getTelephoneNum(position);
									break;
								case 7:
									System.out.println("Which is the new address?");
									x.setAddress();
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
					}else{
						System.out.println("The name you entered is not created yet");
					}
					break;
				case 4:
					System.out.println("*DELETE A PERSON*");
					System.out.println("Who do you want to delete?");
					position = x.searchPersonName();
					if (position >= 0) {
						System.out.println("The information about " + x.getPersons(position).getName() + " has been erased");
						x.delInfo(position);
						break;
					}else {
						System.out.println("There's no person with that name created yet");
					}
					break;
				}
			}else {
				System.out.println("Enter a valid number");
			}
		}
	}

}
