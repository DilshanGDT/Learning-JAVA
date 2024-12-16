
public class Student implements Rules {

	String fName;
	String lname;
	
	public Student(String firstName, String lastName, int age) {			// constructor
		this.fName = firstName;
		this.lname = lastName;
	}
	
	public void study() {		// method
		System.out.println(this.fName + " " +  this.lname + " is studying");
	}
	
	@Override
	public void shouldHasAID() {
		System.out.println(this.fName + " should have an ID");
	}
	
}
