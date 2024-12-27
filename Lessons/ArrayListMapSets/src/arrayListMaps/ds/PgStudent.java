package arrayListMaps.ds;

public class PgStudent extends Student{
	
	private int workshop;
	private boolean foreign;
	
	public PgStudent(String registrationNo, int assignment, int quiz, int end) {
		super(registrationNo, assignment, quiz, end);
	}

	public PgStudent(String registrationNo, int assignment, int quiz, int end, int workshop) {
		this(registrationNo, assignment, quiz, end);
		//this.workshop = workshop;
		this.setWorkshop(workshop);		//this is better
		//super.setQuiz(quiz);
	}

	//get/set
	
	public int getWorkshop() {
		return workshop;
	}

	public void setWorkshop(int workshop) {
		this.workshop = workshop;
	}

	public boolean isForeign() {
		return foreign;
	}

	public void setForeign(boolean foreign) {
		this.foreign = foreign;
	}
	
	

}
