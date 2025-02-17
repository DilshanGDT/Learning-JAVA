
public class App {

	public static void main(String[] args) {

		Student stu1 = new Student();
		stu1.name = "Tharaka";
		stu1.cs = 78;
		stu1.english = 90;
		stu1.maths = 88;
		
		Student stu2 = new Student();
		stu2.name = "Dilshan";
		stu2.cs = 65;
		stu2.english = 25;
		stu2.maths = 82;
		
		//System.out.println("Average of " + stu1.name + " = " + stu1.calAvg());
		//System.out.println("Average of " + stu2.name + " = " + stu2.calAvg());
		
		System.out.println(" Name   :  Average  : Grade \n");
		stu1.printDetails();
		stu2.printDetails();
	}

}
