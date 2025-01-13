
public class Bomb implements Weapon {

	private String category;
	private float duration;		//time
	
	public Bomb(String category, float duration) {
		super();
		this.category = category;
		this.duration = duration;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getDuration() {
		return duration;
	}

	public void setDuration(float duration) {
		this.duration = duration;
	}

	@Override
	public void deploy() {
		System.out.println("Bomb set up to explode in : " + this.duration + " minutes");
	}
	
}
