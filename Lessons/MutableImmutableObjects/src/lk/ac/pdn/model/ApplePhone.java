package lk.ac.pdn.model;

public class ApplePhone {	//immutable objects example

	private final String model; 	//= "X";
	private final int storage; 		//= 16;
	private final int memory; 		//= 4;	less flexibility
	
	public ApplePhone(String model, int storage, int memory) {
		super();
		this.model = model;
		this.storage = storage;
		this.memory = memory;
	}

	public String getModel() {
		return model;
	}

	public int getStorage() {
		return storage;
	}

	public int getMemory() {
		return memory;
	}

	@Override
	public String toString() {
		return "Apple Mobile : model=" + model + ", storage=" + storage + " GB, memory=" + memory + " GB";
	}
	
	
	
	
	
}
