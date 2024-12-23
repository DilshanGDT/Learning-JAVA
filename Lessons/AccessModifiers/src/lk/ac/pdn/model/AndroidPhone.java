package lk.ac.pdn.model;

public class AndroidPhone {

	public String myNumber = "0772259108";
	String service = "Dialog";
	// private String imeiNumber = "apc567";
	protected String phoneName = "Android OS";
	
	public void call() {
		//System.out.println("Send my IMEI to provider " + this.imeiNumber);
		System.out.println("Android calls");
	}
	
	public String getSecurityCode() {
		return "A security code";
	}
	

	
}
