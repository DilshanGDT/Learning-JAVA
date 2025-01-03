
public class Car {

	String brand;
	String model;
	String color;
	
	int currentSpeed = 0;
	int currentGear = 0;
	int maxSpeed = 180;		//kmph
	boolean hasEngineStarted = false;
	
	Car(String brnd, String mdl){
		this.brand = brnd;
		this.model = mdl;
	}
	
	void startEngine() {
		this.hasEngineStarted = true;
		this.currentSpeed = 0;
		this.currentGear = 0;
	}
	
	void speedUp(int speedInc) {
		
		if(!hasEngineStarted) {
			System.out.println("Engine is off!");
			return;
		}
		
		this.currentSpeed += speedInc;
		
		if(this.currentSpeed > this.maxSpeed) {
			this.currentSpeed = this.maxSpeed;
		}
		
		if(this.currentSpeed == 1) {
			this.currentGear = 0;
		}else if(this.currentSpeed > 0 && this.currentSpeed <=30) {
			this.currentGear = 1;
		}else if(this.currentSpeed > 30 && this.currentSpeed <=90) {
			this.currentGear = 2;
		}else if(this.currentSpeed > 91 && this.currentSpeed <= this.maxSpeed) {
			this.currentGear = 3;
		}
	}
	
	String describe() {
		return this.brand + ", " + this.model + ",  " +
				this.currentSpeed + ", " + this.currentGear;
	}
	
	
}
