package lk.ac.pdn.app;

import lk.ac.pdn.model.ApplePhone;
import lk.ac.pdn.model.Tab;

public class TabApp {

	public static void main(String[] args) {

		//t1 and t2 are mutable objects
		Tab t1 = new Tab("Samsung", "A7", 3, 32, 10.1f);
		
		Tab t2 = new Tab("Samsung", "S6", 7f);
		t2.setRam(2);		//mutable objects
		t2.setStorage(16);
	
		System.out.println(t1);
		t1.setRam(6);
		System.out.println(t1);
		
		System.out.println(t2);
		t2.storage = 64;
		System.out.println(t2);
		
		//ap object is immutable
		ApplePhone ap = new ApplePhone("12 Pro Max", 128, 6);
		System.out.println(ap);
		
		
		
		
		
		
	}

}
