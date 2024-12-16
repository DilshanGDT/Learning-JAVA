
public class Main {

	public static void main(String args[]) {
		
		Student s1 = new Student("Lithmi", "Thennakoon", 24);			//Object 1
		s1.study();
		
		//Student s2 = new Student("Tharaka", "Dilshan", 18);
		//s2.study();
		
		//s1.shouldHasAID();
		
		Teacher t1 = new Teacher();
		t1.name = "Udayana Ranathunga";
		t1.shouldHasAID();
		
	}
}
