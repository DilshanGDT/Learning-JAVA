
public class Student implements Rules {

	String fName;
	String lname;
	int age;
	String NIC;
	
	public Student(String firstName, String lastName, int age) {			// constructor
		this.fName = firstName;
		this.age = age;
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
