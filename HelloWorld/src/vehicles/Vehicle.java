package vehicles;

import java.util.Objects;

class Vehicle {
	
	String number;
	String owner;
		 
	public Vehicle(String number,String owner){
		this.number=number;
		this.owner=owner;
	}
		 
	public String getNumber(){
		return number;
	}
		 
	public String getOwner(){
		return owner;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(number);
	}
	
	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		
		Vehicle veh = (Vehicle) object;
		return Objects.equals(number, veh.number);
	}
	
}
