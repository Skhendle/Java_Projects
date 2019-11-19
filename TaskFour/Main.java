
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Address(String streetName, String section, String suburb, int postalCode)
		Address objOne = new Address( "14 Magic Street", "Circus", "Disney",526);
		
		// Person( String name, String lastName, int age, Address obj)
		Person objTwo =  new Person( "John", "Wick", 55, objOne);
		objTwo.printPerson();
	}

}
