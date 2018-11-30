package person;

public class Person {
	private String name;
	private int age;
	private int weight;
	private int height; //i've defined the height to calculate the ideal weight
	private String dni;
	
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
	
	public int idealWeight() {
		return height-100-((height-150)/4);
	}
	
	public String toString() {
		return name +Integer.toString(age)+height +weight+dni;
	}
}
