
public class Calculator {

	private final double PI = 355/113;
	
	public int add(int x, int y) {
		return x + y;
	}
	
	public long add(long x, long y) {
		return x + y + 2;
	}
	
	public double perimeter(final double r) { //Don't change r in any case
		//PI - 22/7; wrong(PI is final)
		//r += 2; not work because r is final
		return 2 * PI * r;
	}
	
	public int addMany(int... num) {
		
		int total = 0;
		for (int i:num) {
			total += i;
		}
		return total;
	}
	
}
