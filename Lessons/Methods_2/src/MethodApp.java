import lk.ac.pdn.util.CircleUtil;

public class MethodApp {

	public static void main(String[] args) {

		Calculator cal = new Calculator();
		//cal.add(5, 10);
		
		double p1 = cal.perimeter(45);
		System.out.println(p1);
		
		//CircleUtil cu = new CircleUtil();
		//double p2 = cu.perimeter(45); //not good
		
		double p2 = CircleUtil.perimeter(45);
		System.out.println(p2);
		
		System.out.println(cal.addMany(2,3));
		System.out.println(cal.addMany(2,3,6,3,12));
	}

}
