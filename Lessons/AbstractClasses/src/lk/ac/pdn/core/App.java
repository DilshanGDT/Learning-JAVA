package lk.ac.pdn.core;

public class App {

	public static void main(String[] args) {

		Vehicle v1 = new Vehicle() {
			
			//override
			public void startEngine() {
				System.out.println("Key Start");
			}

			@Override
			public void applyBrake() {
				System.out.println("ABS brake is going to apply");
			}
		};
		
		v1.applyBrake();
		v1.startEngine();
		
	}

}
