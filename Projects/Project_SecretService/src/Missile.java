
public class Missile implements Weapon {

	private String code;
	private String range;
	private String type;
	
	public Missile(String code, String range, String type) {
		super();
		this.code = code;
		this.range = range;
		this.type = type;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getRange() {
		return range;
	}

	public void setRange(String range) {
		this.range = range;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public void deploy() {
		System.out.println("Missile ready for launch");
	}
}
