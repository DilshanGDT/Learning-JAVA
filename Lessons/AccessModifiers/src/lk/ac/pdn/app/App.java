package lk.ac.pdn.app;

import lk.ac.pdn.model.AndroidPhone;
import lk.ac.pdn.model.HuwaweiY7;
import lk.ac.pdn.model.IPhone;

public class App {

	public static void main(String[] args) {

		//AndroidPhone huwawei = new AndroidPhone();
		//IPhone seven = new IPhone();
		
		//huwawei.call();
		
		//AndroidPhone ap = new AndroidPhone();
		//ap.call();
		//ap.myNumber = "0972836234";
		
		//IPhone xs = new IPhone();
		//xs.myNumber = "9978962764"; variable is public
									//but package is different
	
		methodOverriding();
	}	
	
	private static void methodOverriding() {
		
		HuwaweiY7 hy7 = new HuwaweiY7();
		hy7.call();
	}

}
