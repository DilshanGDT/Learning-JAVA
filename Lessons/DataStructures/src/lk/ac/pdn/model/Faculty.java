package lk.ac.pdn.model;

public class Faculty {

	private String name;
	private String shortName;
	private String telephone;
	
	public Faculty(String name, String shortName) {
		this.name = name;
		this.shortName = shortName;
	}
	
	public Faculty(String name, String shortName, String telephone) {
		this.name = name;
		this.shortName = shortName;
		this.telephone = telephone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	
	
}
