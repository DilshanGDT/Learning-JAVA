package vehicles;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Circle> circleList = new ArrayList<>();
		circleList.add(new Circle());
		circleList.add(new Circle());
		
            for (Circle circle : circleList) {
                circle.creating();
            }
		
	}

}
