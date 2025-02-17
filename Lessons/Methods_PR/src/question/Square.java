package question;

public class Square {

	float length;
	
	public Square(float side1) {
		this.length = side1;
	}
	
	float perimeter() {
		return 4 * this.length;
	}
	
	float area() {
		return this.length * this.length;
	}
	
	void displayProperties() {
		System.out.println("Perimeter of Square = " + this.perimeter());
		System.out.println("Area of Square = " + this.area());
	}
}
