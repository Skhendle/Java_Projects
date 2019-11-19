
public class Person extends Address{
	
	//Variables
	private String name;
	private String lastName;
	private int age;
	private Address obj;

	//Constructors
	public Person() {
		
	}
	public Person( String name, String lastName, int age, Address obj) {
		this.setName(name);
		this.setLastName(lastName);
		this.setAge(age);
		this.setObj(obj);
	}

	//Getters and setter
	private String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	private String getLastName() {
		return lastName;
	}
	private void setLastName(String lastName) {
		this.lastName = lastName;
	}
	private int getAge() {
		return age;
	}
	private void setAge(int age) {
		this.age = age;
	}
	
	//Creating getters and setters for the Address object
	private Address getObj() {
		return obj;
	}
	private void setObj(Address obj) {
		this.obj = obj;
	}
	
	// Class methods
	public void printPerson() {
		System.out.println("Name: "+ this.getName() );
		System.out.println("Lastname: "+ this.getLastName() );
		System.out.println("Age: "+ this.getAge() );
		this.getObj().printAddress();
	}

}
