
public class GlobalTerrorist extends Terrorist {

	private String name;
	private String country;
	
	public GlobalTerrorist(String name, String country) {
		super();
		this.name = name;
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public void attack() {
		System.out.println("Target country : " + this.country);
	}
	
	@Override
	public void buyWeapon(Weapon misl) {
		misl.deploy();
	}
	
	@Override
	public String compromise() {
		return this.name;
	}
	
	
}
