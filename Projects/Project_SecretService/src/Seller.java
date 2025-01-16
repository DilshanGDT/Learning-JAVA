import java.util.Scanner;

public class Seller {

	private static final String code = "RAPTOR";
	
	private static final Weapon bomb = new Bomb("Clemo", 12);
	private static final Weapon missile = new Missile("001", "Intercontinental", "Nuclear");
	
	public static void sellWeapon(Terrorist trst, Agent agnt) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter the Password : ");
			String password = scan.nextLine();
			
			if (password.equals(code)) {
				System.out.println("Password is Correct!");
				System.out.println("Welcome to the Store \n");
				System.out.println("Choose a weapon : ");
				System.out.println("Enter 1 for Missile & 2 for Bomb : ");
				
				int weaponNo = scan.nextInt();
				
				switch (weaponNo) {
				
				case 1 -> {
                                    trst.buyWeapon(missile);
                                    agnt.catchTerrorist(trst);
                                    agnt.promote("Major");
                                    agnt.addExperience();
                                    agnt.missionSuccess();
                                    System.out.println(agnt.codeName + " Promoted to " + agnt.printCurrentRank());
                                }
					
				case 2 -> {
                                    trst.buyWeapon(bomb);
                                    trst.attack();
                                }
					
				default -> {
                                }
					
				}
				
			} else {
				System.out.println("Password is Incorrect!");
				System.out.println("System is blocked for the user");
			}
		}
		
	}

    public static String getCode() {
        return code;
    }

    public static Weapon getMissile() {
        return missile;
    }
	
}
