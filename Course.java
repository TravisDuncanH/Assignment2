import java.util.Vector;

public class Course {

	private Department dept;
	private String title; // title of the course (e.g. Intro to programming);
	private String code; // course code, e.g. SOFE, ELEE, MANE, etc.
	private int number; // course number, e.g. 1200, 2710, 2800, etc.
	private  Vector <Student>classList; // contains all students registered in this course
	private int Enrollment = 0;

	public Course(String code, int number, Department dept, String title) {
		super();
		this.dept = dept;
		this.title = title;
		this.code = code;
		this.number = number;
		classList = new Vector<>();
		
		
	}  
	
	// String of department
	public String getDept() {
		return dept.toString();
	}

	// Get course code
	public String getCode() {
		return code;
	}

	//Get course number
	public int getNumber() {
		return number;
	}

	//Set course number
	public void setNumber(int number) {
		this.number = number;
	}

	//adds student to course vector
	public void addStudentToCourse(Student student)
	{
		classList.add(student);
		Enrollment++;
		
	}
	
	//String for course code and number
	public String toString() {
		  
		return code + " " + number;
	    
	}
	  

	public String toString1(){
		  
		return code + " " + number + " " + title + " Enrollment = " + Enrollment;
		// return a string representation of the course with the course code,
	    // name, and number of people registered in the course in the following
	    // format:
	    // SOFE 2710 Object Oriented Programming and Design, Enrollment = 260

	}

}
