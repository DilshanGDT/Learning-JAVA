package lk.ac.pdn.model;

public class Person {	//class will be only public or no modifier

	private final String firstName;
	private final String lastName;
	private String nicName;
	private String gender;
	
	/*
	 * public Person() {	access modifier : same as the class modifier 
	 * 		default constructor when not constructor exists
	 * }
	 */
	
	/*
	 * public Person() { 			not wrong
	 * this.firstName = "Sam"; 		but default values with default constructor is not good 
	 * this.lastName = "West"; }
	 */
	
	public Person(String fName, String lName) {
		
		this.firstName = fName;
		this.lastName = lName;
	}

	public Person(String fName, String lName, String gndr) {
		
		this.firstName = fName;
		this.lastName = lName;
		//this.gender = gndr; not better
		setGender(gndr);
		
	}

	public void setGender(String g) {
		if(g.equals("Male") || g.equals("Female")) {
			this.gender = g;
		} else {
			this.gender = "Unknown";	//or we can make it unknown by default
			System.err.println("Invalid Gender"); //exception handling
		}
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getNicName() {
		return nicName;
	}

	public String getGender() {
		return gender;
	}
	
	public void describe() {
		System.out.println("First Name : " + this.getFirstName());
	}
}
