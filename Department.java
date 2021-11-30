
import java.util.HashSet;
import java.util.Vector;


public class Department {

	private String name; // the name of school Dept of Computing and Info Science
	private String id; // short name for courses SOFE, ELEE, STAT, etc
	private Vector<Course> courseList; // all courses offered by the department
	private Vector<Student> registerList; // all students taking courses in the department.
	private static int countStud = 0;
	private int countCourse = 0;

	   
	public Department(String name, String id) {
		super();
		this.name = name;
		this.id = id;
		registerList = new Vector<>();
		courseList = new Vector<>();
		
		
		// also initialize the vectors
	}
	  
	 	
	public String toString() {
		return name + ": " + countCourse + " courses, " + countStud + " steudents" ;
	      // returns a string representation of department name, number 
	      // of courses offered and number of students registered in the
	      // department. Use the format:
	      // ECSE: 53 courses, 460 students     
	   }

	//adds courses offered within course vector
	public void offerCourse(Course e) {
		
		courseList.add(e);
		countCourse++;
	}
	
	//prints courses offered within course vector
	public void printCoursesOffered() {
		for(Course offered: courseList)
			System.out.println(offered.toString1());
		System.out.println();
	}
	
	//adds students registered within a department
	public void printStudentsByName() {
		for(Student name:registerList)
			System.out.println(name);
		System.out.println();
	}
	
	//Confirms if a student is registered within a department
	public boolean isStudentRegistered(Student student)
	{
		return registerList.contains(student);
	}

	//registers student and courses within a department
	public void registerStudentCourseInDepartment(Student student, Course course) {
		
		if(!registerList.contains(student))
		{
			registerList.addElement(student);
			countStud++;
		}
		
		
		if(!courseList.contains(course))
			courseList.addElement(course);
		
	}
	
	

}
