package person;
import java.util.Random;
import java.util.Scanner; //for testing

public class Person {
	private String name = "defaultName";
	private int age = 18;
	private int weight = 70;
	private int height = 180; //i've defined the height to calculate the ideal weight
	private String dni = "12345678A";
	private int mobileNum = 666555444;
	private String address = "Streat 1, 2B";
	
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
	//this is for the Agenda exercise
	public int getMobileNum() {
		return this.mobileNum;
	}
	public void setMobileNum(int mobileNum) {
		this.mobileNum=mobileNum;
	}
	
	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	
	//it will return an ideal weight using a formula from internet
	public int idealWeight() {
		return height-100-((height-150)/4);
	}
	//it will convert to String all the data types that aren't String yet
	public String toString() {
		return Integer.toString(age)+Integer.toString(height) +Integer.toString(weight);
	}
	//this gives a default DNI value that will always be "12345678A"
	public String dniByDefault() {
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random rnd = new Random();
		char c = chars.charAt(rnd.nextInt(chars.length()));
		this.dni= String.valueOf((int)((Math.random()*99999999)+1))+c;
		return this.dni;
	}
	//this will return false if the age is lower than 18 or true if it's not
	public boolean isAdult() {
		boolean adult = false;
		if(this.age>=18) {
			adult = true;
		}
		return adult;
	}
	
	//for testing
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//create a person class object with no parameters
		System.out.println("Person 1:");
		Person person1 = new Person();
		//add the information using get/set methods
		System.out.println("Enter the name: ");
		person1.setName(sc.next());
		System.out.println("Now enter the age: ");
		if(sc.hasNextInt()) {
			person1.setAge(sc.nextInt());
		}
		System.out.println("First person's name is "+ person1.getName()+", who is "+person1.getAge()+" years old.");
		//show different messages if he/she is adult or not
		if(person1.isAdult()) {
			System.out.println(person1.getName()+" is adult.");
			//if it's adult we want to know his/hers id
			System.out.println("Enter "+person1.getName()+"'s DNI:");
			person1.setDni(sc.next());
		}
		else {
			System.out.println(person1.getName()+" is not adult.");
			//if it's not adult he/she will get the default id
			person1.setDni(person1.dniByDefault());
		}
		System.out.println(person1.getName()+"'s dni is "+person1.getDni());
		//create a person class object defining hers/his name
		System.out.println("Person 2:");
		Person person2 = new Person("Juan");
		System.out.println("Second person's name is " + person2.getName()+".");
		System.out.println("Which one will be the weight (kg) of " +person2.getName()+"?");
		if(sc.hasNextInt())
			person2.setWeight(sc.nextInt());
		System.out.println("And its height (cm)?");
		if(sc.hasNextInt())
			person2.setHeight(sc.nextInt());
		System.out.println("His/Hers ideal width will be "+ person2.idealWeight()+"kg.");
	}
}
