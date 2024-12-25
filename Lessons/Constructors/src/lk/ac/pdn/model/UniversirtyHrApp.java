package lk.ac.pdn.model;

public class UniversirtyHrApp {

	public static void main(String[] args) {

		Person p1 = new Person("Tharaka", "Dilshan");
		Person p2 = new Person("Lakshitha", "Eranga");		
	
		//p1.gender = "Male"; this not good
		
		p1.setGender("Male");
		//p2.setGender("Fmale");
	
		Person p3 = new Person("Aloka", "Madushani", "Femae");
	
		Person pX = new Person("X", "Y");
		Person pA = new UniversityStudent("A", "B");
		UniversityStudent us1 = new UniversityStudent("P", "K");
		
		//UniversityStudent us2 = new Person("K", "L");	not possible
	
		pX.describe();
		pA.describe();
		us1.describe();
		
		
	}

}
