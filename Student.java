import java.util.Vector;

public class Student extends Person{


	private String id;
	private String name; 
	private Vector <Course>courses; // contains all courses the student is registered in

	public Student(String id, String initialName) {
		super(initialName);
		this.id = id;	
		courses = new Vector<>();
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		
	     // return a string representation of a student using the following format:
	     // 100234546 John McDonald
	     // Registered courses: ELEE 2110, ELEE 2790, SOFE 2710, SOFE 2800, SOFE 2850
		
		
		return this.id + " " + super.toString() + "\n" 
			     + "Registered courses: " + "\n" + courses.toString(); 
	  }
	
	public void registerFor(Course course) // adds students' registered courses  
	{
		courses.add(course);
		
	}
	
	public boolean isRegisteredInCourse(Course course) // confirms students'registered courses
	{
		return courses.contains(course);
	}
	
	public void printCourses() // prints a student's registered courses
	{
		for(Course registered: courses)
			System.out.print(registered.getCode() + " " + registered.getNumber());
	}

}
