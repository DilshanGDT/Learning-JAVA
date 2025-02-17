
public class Student {

	String name;
	float maths;
	float english;
	float cs;
	
	float calAvg() {
		return (this.maths + this.english + this.cs)/3;
	}
	
	String chooseGrade() {
		if (this.calAvg() > 75) {
			return "A";
		} else if (this.calAvg() > 60) {
			return "B";
		} else if (this.calAvg() > 45) {
			return "C";
		} else {
			return "F";
		}
		
	}
	
	void printDetails() {
		System.out.println(this.name + " : " + this.calAvg() + " : " + this.chooseGrade());
	}
	
	
	
}
