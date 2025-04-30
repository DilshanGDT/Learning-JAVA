package lk.ac.pdn.app;

public class StringApp {

	public static void main(String[] args) {

		//string are immutable in java
		String s1 = "Hello";
		String s2 = new String("Hello");
		String s3 = "Hello";	//string pool
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		s1 = s1 + " World";		//new object creates
		s2.concat(" World");	//s2 = Hello World
			//unless we assign the result to a new string, new object does not created. so same hash code
		s3 = s3.concat(" World");
		
		System.out.println(s1 + " : " + s1.hashCode());
		System.out.println(s2 + " : " + s2.hashCode());
		System.out.println(s3 + " : " + s3.hashCode());
		
		
		StringBuffer sb = new StringBuffer("Hello");	//mutable but synchronized
		sb.append(" World");
		System.out.println(sb.toString());
		
		StringBuilder sbb = new StringBuilder();
		sbb.append("hello");
		sbb.append(" world");
		System.out.println(sbb.toString());
		
		
		double cost = 2000000;
		System.out.println(cost);	//excepted : 2,000,000.00
		System.out.println(String.format("%.3f", cost));	//class - String
		System.out.println(String.format("%,.2f", cost));	//format - static method
	
		
		

	}

}
