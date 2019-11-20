
public class Address {
	
	//Variable names
	private String streetName;
	private String section;
	private String suburb;
	private int postalCode;
	
	// Constructors
	public Address() {
		
	}
	public Address(String streetName, String section, String suburb, int postalCode) {
		this.setStreetName(streetName);
		this.setSection(section);
		this.setSuburb(suburb);
		this.setPostalCode(postalCode);
	}
	
	
	// Getters and setters
	private String getStreetName() {
		return streetName;
	}
	private void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	private String getSection() {
		return section;
	}
	private void setSection(String section) {
		this.section = section;
	}
	private String getSuburb() {
		return suburb;
	}
	private void setSuburb(String suburb) {
		this.suburb = suburb;
	}
	private int getPostalCode() {
		return postalCode;
	}
	private void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	
	// Class methods
	public void printAddress() {
		System.out.println("-- Address --");
		System.out.println( this.getStreetName());
		System.out.println( this.getSection() + " Section");
		System.out.println( this.getSuburb());
		System.out.println( this.getPostalCode());
	}
}
