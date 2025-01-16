
public class LocalTerrorist extends Terrorist {

	private String realName;
	private String localCode;
	private String city;		//target
		
	public LocalTerrorist(String realName, String localCode, String city) {
		this.realName = realName;
		this.localCode = localCode;
		this.city = city;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getLocalCode() {
		return localCode;
	}

	public void setLocalCode(String localCode) {
		this.localCode = localCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public void attack() {
		System.out.println("Target city : " + this.city);
	}
	
	@Override
	public void buyWeapon(Weapon wpn) {
		wpn.deploy();
	}
	
	@Override
	public String compromise() {
		return this.realName;
		
	}
	
	
}
