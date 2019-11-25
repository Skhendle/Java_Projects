
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	public Students(String studentID, String major, String department, int semester, String name, String lastName, int age, 
		//String streetName, String section, String suburb, int postalCode)
		
		Student objTwo =  new Student("664726", "Computer Science", "Science", 8 ,"John", "Wick",
				55,  "14 Magic Street", "Circus", "Disney",526);
		objTwo.printStudent();
		
		//Instructor(String instructorID, String degree, int classesTeaching, String major, String department, int yearsWorking, 
			//	double salary, String name, String lastName, int age, String streetName, String section, String suburb,int postalCode)
		System.out.println();
		System.out.println();
		Instructor obj = new Instructor("98564", "Computer Science", 2," Machine Learning", 
				"Computational and Advanced mathematics", 10 ,65203.72, 
				"jane", "Doe",37,"14 Magic Street", "Circus", "Disney",526);
		obj.printInstructor();
	}

}
