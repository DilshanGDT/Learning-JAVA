
public class App {

	public static void main(String[] args) {

		Terrorist tr1 = new LocalTerrorist("John Cobra", "Hunter", "Berlin");
		Agent ag1 = new Agent("007", "James Bond", 99, "Lieutinant", "Captain", 18, 23);
		
		Seller.sellWeapon(tr1, ag1);
	}

}
