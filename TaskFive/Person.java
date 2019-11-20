
public abstract class Person extends Address{
	
	//Variables
	private String name;
	private String lastName;
	private int age;
	

	//Constructors
	public Person() {
		
	}
	public Person( String name, String lastName, int age, String streetName, String section, String suburb, int postalCode) {
		
		super(streetName, section, suburb, postalCode);
		
		this.setName(name);
		this.setLastName(lastName);
		this.setAge(age);
		
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
	

	// Class methods
	public void printPerson() {
		System.out.println( "--Personal Details--" );
		System.out.println("Name: "+ this.getName() );
		System.out.println("Lastname: "+ this.getLastName() );
		System.out.println("Age: "+ this.getAge() );
		this.printAddress();
	}

}
