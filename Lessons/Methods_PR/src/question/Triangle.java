package question;

public class Triangle {

	float sideA, sideB, sideC;
	
	float perimeter() {
		return (this.sideA + this.sideB + this.sideC);
	}
	
	void displayProperties() {
		System.out.println("Perimeter of Triangle= " + this.perimeter());
	}
}
