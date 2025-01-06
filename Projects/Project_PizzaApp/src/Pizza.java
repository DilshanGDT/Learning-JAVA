
public class Pizza extends PizzaFactory {

	public String topping;
	public String pizzaSize;
	public double price; 
	
	public Pizza() {
		
	}
	
	public Pizza(String topping, String pizzaSize, double price) {
		this.topping = topping;
		this.pizzaSize = pizzaSize;
		this.price = price = 0;
	}
	
	public String createTopping(String ingredient1, String ingredient2) {
		topping = ingredient1 + "," + ingredient2;
		return topping;
	}
	  
	public double calculateTotalPrice(Ingredient[] ingredient, String topping, String pizzaSize) {
		this.pizzaSize = pizzaSize;
		
		String toppingList[] = topping.split(",");
		
		for(int j = 0; j < toppingList.length; j++) {
			
			for(int i = 0; i < ingredient.length; i++) {
				
				if(ingredient[i].getName().equals(toppingList[j])) {
					this.price += ingredient[i].getIngrediantprice();
				}
			}
		}
		
		if(this.pizzaSize.equals("Small")) {
			this.price += 350.0;
		}
		else if(this.pizzaSize.equals("Medium")) {
			this.price += 500.0;
		}
		else if(this.pizzaSize.equals("Large")) {
			this.price += 800.0;
		}
		return this.price;
	}
	
	public void prepare() {
		System.out.println("Preparing your order...!");
	}
	
	public void pack() {
		System.out.println("Order is ready...!");
	}
	  
	public void displayOrderDetails(String name, String topping1, String topping2, String pizzaSize, double price) {
	    
		System.out.println("----- Order Details ----- \n");
		System.out.println("Name : " + name);
		prepare();
		System.out.println("Selected Toppings : " + topping);
	    System.out.println("Pizza Size : " + pizzaSize);
	    System.out.println("Total : " + price);
	    pack();
	}
}
