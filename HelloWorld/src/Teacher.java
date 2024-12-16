
public class Teacher implements Rules {

	String name;
	
	public void teach() {		// method
		System.out.println(this.name + " is teaching");
	}

	@Override
	public void shouldHasAID() {
		System.out.println(this.name + " should have an ID");
	}
}
