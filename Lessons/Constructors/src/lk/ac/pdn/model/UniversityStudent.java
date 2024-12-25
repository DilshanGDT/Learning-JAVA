package lk.ac.pdn.model;

public class UniversityStudent extends Person {

	public UniversityStudent(String fName, String lName) {	//super constructor
		super(fName, lName);				//we cannot use both constructor calling
		//this(fName, lName, "Unknown");	no compile errors
	}										
	
	/*
	 * public UniversityStudent(String fName, String lName, String gender) {
	 * 		super.setGender(gender); 
	 * 		super(fName, lName);		wrong, constructor calling must be the first statement
	 * }
	 */
	
	public UniversityStudent(String fName, String lName, String gender) { //overridden super constructor
		super(fName, lName);
		super.setGender(gender);
	}
	
	public void describe() {
		System.out.println("Description : First Name : " + this.getFirstName() + ", " + "Last Name : " + this.getLastName()); //redefining
	}
	
	
}
