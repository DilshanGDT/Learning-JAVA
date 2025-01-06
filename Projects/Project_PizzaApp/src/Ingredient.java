
public class Ingredient {

	public String name;
	public double ingrediantPrice;
	
	public Ingredient(String name, double ingrediantPrice) {
		this.name = name;
		this.ingrediantPrice = ingrediantPrice;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setIngrediantprice(double price) {
		this.ingrediantPrice = price;
	}
	
	public double getIngrediantprice() {
		return this.ingrediantPrice;
	}
	
}
