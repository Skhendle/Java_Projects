
public class Student extends Person {
	
	private String studentID;
	private int semester;
	private String major;
	private String department;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String studentID, String major, String department, int semester, String name, String lastName, int age, 
			String streetName, String section, String suburb, int postalCode) {
		// TODO Auto-generated constructor stub
		super(name, lastName, age, streetName, section, suburb, postalCode);
		this.setStudentID(studentID);
		this.setSemester(semester);
		this.setMajor(major);
		this.setDepartment(department);
	}
	
	private String getStudentID() {
		return studentID;
	}
	private void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	private int getSemester() {
		return semester;
	}
	private void setSemester(int semester) {
		
		if(semester > 8) {
			this.semester = 8;
		}else {
			this.semester = semester;
		}
		
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
	
	public void printStudent() {
		this.printPerson();
		System.out.println("--Student Information--");
		System.out.println("Student ID: "+this.getStudentID());
		System.out.println( "Semester: "+this.getSemester() );
		System.out.println( "Major: "+ this.getMajor() );
		System.out.println( "Department: "+this.getDepartment() );
		
	}

}
