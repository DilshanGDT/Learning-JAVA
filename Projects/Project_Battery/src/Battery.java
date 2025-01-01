
public class Battery {

	private String name;
	private double price;
	private int quantity;
	private int openingStock;
	private int total = openingStock;
	
	public Battery(String name, double price, int openingStock) {
		this.name = name;
		this.price = price;
		this.openingStock = openingStock;
		this.total = openingStock;
	}
	
	public Battery(String name, int qty, double price) {
		this.name = name;
		this.price = price;
		this.quantity = qty;
	}
	
	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOpeningStock() {
		return openingStock;
	}

	public void setOpeningStock(int openingStock) {
		this.openingStock = openingStock;
	}
	
	public void addBatteries(int n) {
		this.total += n;
	}
	
	public void getBatteries(int n) {
		this.total -= n;
	}
	
	
}
