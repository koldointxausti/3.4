package person;

import java.util.Scanner;

public class Agenda {
	public static void main(String[] args) {
		boolean repeat = true;
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
				repeat=false;
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
				System.out.println("Weight:");
				if (sc.hasNextInt())
					a.setWeight(sc.nextInt());
				System.out.println("Height:");
				if (sc.hasNextInt())
					a.setHeight(sc.nextInt());
				System.out.println("Mobile number:");
				flag = true;
				while (flag) {
					if (sc.hasNextInt()) {
						a.setMobileNum(sc.nextInt());
						if (Integer.toString(a.getMobileNum()).length() != 9) {
							System.out.println("The mobile number has to be of 9 digits. Try again:");
						} else {
							flag = false;
						}
					}
				}
				System.out.println("Address:");
				sc.next();
				a.setAddress(sc.nextLine());
				System.out.println();
				System.out.println("Press enter to continue...");
				sc.nextLine();
				break;
			case 2:
				
			}
		}
	}

}
