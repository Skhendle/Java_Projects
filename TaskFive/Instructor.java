
public class Instructor extends Person {

	private String instructorID;
	private String degree;
	private int classesTeaching;
	private String major;
	private String department;
	private int yearsWorking;
	private double salary;
	
	
	public Instructor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Instructor(String instructorID, String degree, int classesTeaching, String major, String department, int yearsWorking, 
			double salary, String name, String lastName, int age, String streetName, String section, String suburb,int postalCode) {
		super(name, lastName, age, streetName, section, suburb, postalCode);
		// TODO Auto-generated constructor stub
		
		this.setInstructorID(instructorID);
		this.setDegree(degree);
		this.setClassesTeaching(classesTeaching);
		this.setMajor(major);
		this.setDepartment(department);
		this.setYearsWorking(yearsWorking);
		this.setSalary(salary);
	}

	private String getInstructorID() {
		return instructorID;
	}

	private void setInstructorID(String instructorID) {
		this.instructorID = instructorID;
	}

	private String getDegree() {
		return degree;
	}

	private void setDegree(String degree) {
		this.degree = degree;
	}

	private int getClassesTeaching() {
		return classesTeaching;
	}

	private void setClassesTeaching(int classesTeaching) {
		this.classesTeaching = classesTeaching;
	}

	private String getMajor() {
		return major;
	}

	private void setMajor(String major) {
		this.major = major;
	}

	private String getDepartment() {
		return department;
	}

	private void setDepartment(String department) {
		this.department = department;
	}

	private int getYearsWorking() {
		return yearsWorking;
	}

	private void setYearsWorking(int yearsWorking) {
		this.yearsWorking = yearsWorking;
	}

	private double getSalary() {
		return salary;
	}

	private void setSalary(double salary) {
		this.salary = salary;
	}
	

	/* Print method()
	 * This class prints out the following variables
	 * @salary, @instructorID, @degree, @classesTeaching, @department 
	 * @yearsWorking, @salary	 
	 * *returns : void* 
	 */
	public void printInstructor() {
		this.printPerson();
		System.out.println("--Instructor details--");
		System.out.println("Instructor ID: "+this.getInstructorID());
		System.out.println("Degre: "+this.getDegree());
		System.out.println("Classes teaching: "+this.getClassesTeaching());
		System.out.println("Major: "+this.getMajor());
		System.out.println("Department: "+this.getDepartment());
		System.out.println("Years working: "+this.getYearsWorking());
		System.out.println("Salary: "+this.getSalary());
	}

}
