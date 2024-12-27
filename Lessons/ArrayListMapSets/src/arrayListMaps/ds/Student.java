package arrayListMaps.ds;

public class Student {
	
	private String registrationNo;
	private int assignment;
	private int quiz;
	private int end;
	
	public Student(String registrationNo, int assignment, int quiz, int end) {
		this.registrationNo = registrationNo;
		this.assignment = assignment;
		this.quiz = quiz;
		this.end = end;
	}

	public String getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

	public int getAssignment() {
		return assignment;
	}

	public void setAssignment(int assignment) {
		this.assignment = assignment;
	}

	public int getQuiz() {
		return quiz;
	}

	public void setQuiz(int quiz) {
		this.quiz = quiz;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}
	
}
