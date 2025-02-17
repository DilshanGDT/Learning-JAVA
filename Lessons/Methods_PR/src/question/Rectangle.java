package question;

public class Rectangle {

	float length, width;
	
	public Rectangle(float side1, float side2) {
		this.length = side1;
		this.width = side2;
	}
	
	float perimeter() {
		return 2 * (this.length + this.width);
	}
	
	float area() {
		return this.length * this.width;
	}
	
	void displayProperties() {
		System.out.println("Perimeter of Rectangle= " + this.perimeter());
		System.out.println("Area of Rectangle = " + this.area());
	}
}
