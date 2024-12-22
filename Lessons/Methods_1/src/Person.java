
public class Person {

	String name;	//instance variables
	String subject;
	
	void setPersonName(String n) {
		
		int internalValue = 10;	//local variables
		this.name = n;			//currently access object
		System.out.println(internalValue);
	}
}
 