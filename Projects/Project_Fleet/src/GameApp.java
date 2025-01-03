
public class GameApp {

	public static void main(String[] args) {

		Car car1 = new Car("Toyota", "Allion");
		Car car2 = new Car("Toyota", "Corolla");
		
		car1.startEngine();
		car2.startEngine();
		
		car1.speedUp(10);
		car2.speedUp(100);
		car1.speedUp(10);
		car2.speedUp(60);
		car1.speedUp(10);
		car2.speedUp(60);
		
		System.out.println(car1.describe());
		System.out.println(car2.describe());
	}

}
 