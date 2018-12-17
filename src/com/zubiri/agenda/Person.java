package com.zubiri.agenda;
import java.util.Random;

public class Person {
	private String name = "defaultName";
	private int age = 18;
	private int weight = 70;
	private int height = 180; //i've defined the height to calculate the ideal weight
	private String dni = "12345678A";
	
	//constructors
	//with no parameters
	public Person(){};
	//you can create the object defining the name between
	public Person(String name){
		this.name=name;
	}
	public Person(String name, int age, int weight, int height, String dni){
		this.name= name;
		this.age=age;
		this.weight=weight;
		this.height=height;
		this.dni=dni;
	}
	//get-set methods
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
	public int getWeight() {
		return this.weight;
	}
	public void setWeight(int weight) {
		this.weight=weight;
	}
	
	public int getHeight() {
		return this.height;
	}
	public void setHeight(int height) {
		this.height=height;
	}
	
	public String getDni() {
		return this.dni;
	}
	public void setDni(String dni) {
		this.dni=dni;
	}
	
	/**
	 * @author Koldo
	 * @return int which is the result of a mathematical operation
	 * <p>This method uses a formula to calculate the ideal weight</p>
	 */
	public int idealWeight() {
		return height-100-((height-150)/4);
	}

	/**
	 * @author Koldo
	 * @return String type data
	 * <p>This method converts to String all the data types that aren't String yet</p>
	 */
	public String toString() {
		return Integer.toString(age)+Integer.toString(height) +Integer.toString(weight);
	}

	/**
	 * @author Koldo
	 * @return String of a random DNI
	 * <p>This method creates randomly a DNI</p>
	 */
	public String dniByDefault() {
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random rnd = new Random();
		char c = chars.charAt(rnd.nextInt(chars.length()));
		this.dni= String.valueOf((int)((Math.random()*99999999)+1))+c;
		return this.dni;
	}
	
	/**
	 * @author Koldo
	 * @return true if the age is over 18 false if the age is under 18
	 * <p>This method tell us whether a person is under-age or not.
	 */
	public boolean isAdult() {
		boolean adult = false;
		if(this.age>=18) {
			adult = true;
		}
		return adult;
	}
	
}
