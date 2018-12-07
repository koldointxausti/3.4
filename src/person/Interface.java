package person;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Interface {
	public static void main(String[] args) {
		boolean repeat = true;
		Agenda x = new Agenda();
		while (repeat) {
			System.out.println("*MENU*");
			System.out.println("[1] Create a new contact");
			System.out.println("[2] Created contacts");
			System.out.println("[3] View an existing contact");
			System.out.println("[4] Modify an existing contact");
			System.out.println("[5] Delete an existing contact");
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
					System.out.println("*CREATE A NEW CONTACT*");
					Contact newContact = new Contact();
					//ask for Person's class information
					Person info = new Person();
					System.out.println("Name:");
					info.setName(sc.next());
					System.out.println("Age:");
					boolean flag = true;
					while (flag) {
						if (sc.hasNextInt()) {
							info.setAge(sc.nextInt());
							flag = false;
						} else
							System.out.println("It has to be a number");
					}
					flag = true;
					System.out.println("Weight:");
					while (flag) {
						if (sc.hasNextInt()) {
							info.setWeight(sc.nextInt());
							flag = false;
						} else
							System.out.println("It has to be a number");
					}
					flag = true;
					System.out.println("Height:");
					while (flag) {
						if (sc.hasNextInt()) {
							info.setHeight(sc.nextInt());
							flag = false;
						} else
							System.out.println("It has to be a number");
					}
					System.out.println("DNI:");
					flag=true;
					while (flag) {
	
							String dni = sc.next();
							if (dni.length() != 9)
								System.out.println("The DNI has to be of 9 digits. Try again:");
							else {
								info.setDni(dni);
								flag = false;
							}

					}
					newContact.setPerson(info); //save this Person in a Contact
					//add this information to de Contact:
					System.out.println("Mobile number:");
					flag=true;
					while (flag) {
						if (sc.hasNextInt()) {
							int tfn = sc.nextInt();
							if (Integer.toString(tfn).length() != 9)
								System.out.println("The mobile number has to be of 9 digits. Try again:");
							else {
								newContact.setTelephoneNum(tfn);
								;
								flag = false;
							}
						}
					}
					System.out.println("Address:");
					sc.nextLine();
					newContact.setAddress(sc.nextLine());
					//add this Contact to the ArrayList of class Agenda
					x.addContact(newContact);
					break;
				case 2:
					x.listContacts();
					System.out.println();
					break;
				case 3:
					System.out.println("*VIEW A CONTACT*");
					System.out.println("Whose information do you want? (Enter hers/his name)");
					int position = x.findContact(sc.next());
					if (position >= 0) {
						System.out.println("Name: " + x.getContacts().get(position).getPerson().getName());
						System.out.println("Age: " + x.getContacts().get(position).getPerson().getAge());
						System.out.println("Dni: " + x.getContacts().get(position).getPerson().getDni());
						System.out.println("Weight: " + x.getContacts().get(position).getPerson().getWeight());
						System.out.println("Height: " + x.getContacts().get(position).getPerson().getHeight());
						System.out.println("Telephone number: " + x.getContacts().get(position).getTelephoneNum());
						System.out.println("Address: " + x.getContacts().get(position).getAddress());
					} else
						System.out.println("There's no person with that name created yet");
					System.out.println();
					break;
				case 4:
					System.out.println("*MODIFY A CONTACT*");
					System.out.println("Whose information do you want to change? (Enter hers/his name)");
					boolean flag1 = true;
					position = x.findContact(sc.next());
					if (position >= 0) {
						while (flag1) {
							System.out.println("What do you want to change?");
							System.out.println(" - 1. Name");
							System.out.println(" - 2. Age");
							System.out.println(" - 3. Weight");
							System.out.println(" - 4. Height");
							System.out.println(" - 5. DNI");
							System.out.println(" - 6. Telephone number");
							System.out.println(" - 7. Address");
							System.out.println(" - 0. None");
							if (sc.hasNextInt()) {
								int change = sc.nextInt();
								switch (change) {
								case 0:
									flag1 = false;
									break;
								case 1:
									System.out.println("Your actual name is "+x.getContacts().get(position).getPerson().getName());
									System.out.println("What's the name you want?");
									x.getContacts().get(position).getPerson().setName(sc.next());
									System.out.println("Your name has been changed");
									break;
								case 2:
									System.out.println("Your actual age is "+x.getContacts().get(position).getPerson().getAge());
									System.out.println("What's the age you want?");
									boolean loop=true;
									while(loop) {
										if(sc.hasNextInt()) {
											x.getContacts().get(position).getPerson().setAge(sc.nextInt());
											loop=false;
										}else
											System.out.println("It has to be a number");
									}
									System.out.println("Your age has been changed");
									break;
								case 3:
									System.out.println("Your actual weight is "+x.getContacts().get(position).getPerson().getWeight());
									System.out.println("What's the weight you want?");
									loop=true;
									while(loop) {
										if(sc.hasNextInt()) {
											x.getContacts().get(position).getPerson().setWeight(sc.nextInt());
											loop=false;
										}else
											System.out.println("It has to be a number");
									}
									System.out.println("Your weight has been changed");
									break;
								case 4:
									System.out.println("Your actual height is "+x.getContacts().get(position).getPerson().getHeight());
									System.out.println("What's the height you want?");
									loop=true;
									while(loop) {
										if(sc.hasNextInt()) {
											x.getContacts().get(position).getPerson().setHeight(sc.nextInt());
											loop=false;
										}else
											System.out.println("It has to be a number");
									}
									System.out.println("Your height has been changed");
									break;
								case 5:
									System.out.println("Your actual DNI is "+x.getContacts().get(position).getPerson().getDni());
									System.out.println("What's the DNI you want?");
									x.getContacts().get(position).getPerson().setDni(sc.next());
									System.out.println("Your DNI has been changed");
									break;
								case 6:
									System.out.println("Your actual telephone number is "+x.getContacts().get(position).getTelephoneNum());
									System.out.println("What mobile number do you want?");
									loop=true;
									while(loop) {
										if(sc.hasNextInt()) {
											int tfn = sc.nextInt();
											if(Integer.toString(tfn).length()==9) {
												x.getContacts().get(position).setTelephoneNum(tfn);
												loop=false;
											}else
												System.out.println("The number has to be 9 digits long");
										}else
											System.out.println("It has to be a number");
									}
									System.out.println("Your mobile number has been changed");
									break;
								case 7:
									System.out.println("Your actual address is: "+x.getContacts().get(position).getAddress());
									System.out.println("What's the address you want me to save?");
									sc.nextLine();
									x.getContacts().get(position).setAddress(sc.nextLine());
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
					} else {
						System.out.println("The name you entered is not created yet");
					}
					break;
				case 5:
					System.out.println("*DELETE A CONTACT*");
					System.out.println("Who do you want to delete?");
					position = x.findContact(sc.next());
					if (position >= 0) {
						System.out.println(
								"The information about " + x.getContacts().get(position).getPerson().getName() + " has been erased");
						x.deleteContact(position);
						break;
					} else {
						System.out.println("There's no person with that name created yet");
					}
					break;
				}
			} else {
				System.out.println("Enter a valid number");
			}
		}
	}

}
