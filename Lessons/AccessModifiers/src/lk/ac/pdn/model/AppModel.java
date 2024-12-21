package lk.ac.pdn.model;

public class AppModel {

	public static void main(String[] args) {

		AndroidPhone ap = new AndroidPhone();
		ap.call();
		ap.myNumber = "088967855";
		ap.service = "Mobitel";
		//ap.imeiNumber = "Something else"; wrong(private instance)
		ap.phoneName = "Samsung Note 9";
	
	}
	
 
}
