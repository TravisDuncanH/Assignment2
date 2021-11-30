// Superclass for Student class
public class Person {


	   private String name;
	   
	   
	   public Person(String initialName)
	   {
	      name = initialName;
	   }
	   
	  
	   public void setName(String fullName) {
		   name = fullName;
	    }

	   public String getName() {
	      return name;
	   }
	 
	   public String toString() 
	   {
		   return name;

	   }

}
