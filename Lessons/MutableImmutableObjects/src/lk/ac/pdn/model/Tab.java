package lk.ac.pdn.model;

public class Tab {	//mutable objects example

	private final String make;
	private final String model;
	private int ram;		//GB, mutable
	public int storage;		//GB, mutable
	private final float displaySize;	//inch's
	
	public Tab(String make, String model, float displaySize) {
		//super();	optional
		this.make = make;
		this.model = model;
		this.displaySize = displaySize;
	}
	
	//constructor overloading
		public Tab(String make, String model, int ram, int storage, float displaySize) {
			//super();
			this.make = make;
			this.model = model;
			this.ram = ram;
			this.storage = storage;
			this.displaySize = displaySize;
		}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public float getDisplaySize() {
		return displaySize;
	}

	@Override						//toString method belongs to object class
	public String toString() {		//this method is invoked when the object is printed
		return "Tab [make=" + make + ", model=" + model + ", ram=" + ram + ", storage=" + storage + ", displaySize="
				+ displaySize + "]";
	}

	
	
	

	
}
