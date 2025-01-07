import java.util.Scanner;

public class Driver {

	public static Pizza selectPizzaCategory(int pizzaCategory) {
		
            switch (pizzaCategory) {
                case 1 -> {
                    VeggiePizza vege = new VeggiePizza();
                    vege.createVeggieTopping();
                    return vege;
                }
                case 2 -> {
                    CheesePizza ches = new CheesePizza();
                    ches.createCheeseTopping();
                    return ches;
                }
                default -> {
                    ChickenPizza chik = new ChickenPizza();
                    chik.createChickenTopping();
                    return chik;
                }
            }		
	}
	
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("*******Welcome to RPK Pizza********\n");
			System.out.println("Enter your name: ");
			String name = s.nextLine();
			System.out.println("*******WELCOME " + name + "***********");
			
			System.out.println("Select the Pizza size: \n 1)Large\n 2)Medium\n 3)Small");
			int pizzaSize = s.nextInt();
			String pizzaS;
			
			        pizzaS = switch (pizzaSize) {
			        case 1 -> "Large";
			        case 2 -> "Medium";
			        default -> "Small";
			    };
			
			System.out.println("Select the Pizza category: \n 1)Veggie Pizza \n 2) Cheese Pizza \n 3) Chicken Pizza");
			int pizzaCategory = s.nextInt();
			s.nextLine();
			
			System.out.println("Select Extra ingredient 1: \n 1)Cheese \n 2)Sausages \n 3)Prawns \n 4)Mushroom \n 5)CuttleFish \n 6)Chicken");
			int option1 = s.nextInt();
			String ingredient1 = selection(option1);
			
			System.out.println("Select Extra ingredient 2: \n 1)Cheese \n 2)Sausages \n 3)Prawns \n 4)Mushroom \n 5)CuttleFish \n 6)Chicken");
			int option2 = s.nextInt();
			String ingredient2 = selection(option2);
			
			Pizza p2 = selectPizzaCategory(pizzaCategory);
			  
			  Ingredient i1 = new Ingredient("Chicken",50.0); 
			  Ingredient i2 = new Ingredient("Prawns",40.0); 
			  Ingredient i3 = new Ingredient("Mushroom",30.0);
			  Ingredient i4 = new Ingredient("Sausages",60.0); 
			  Ingredient i5 = new Ingredient("Cheese",100.0);
			  Ingredient i6 = new Ingredient("Cuttlefish",80.0);
			  
			  Ingredient IngredientList[] = {i1,i2,i3,i4,i5,i6};
			  
			  double total = p2.calculateTotalPrice(IngredientList, p2.createTopping(ingredient1, ingredient2), pizzaS);
			  
			  System.out.println();
			  p2.displayOrderDetails(name, ingredient1, ingredient2, pizzaS, total);
		}
		
	}
	
	public static String selection(int n) {
            return switch (n) {
                case 1 -> "Cheese";
                case 2 -> "Sausage";
                case 3 -> "Prawn";
                case 4 -> "Mushroom";
                case 5 -> "Cuttle Fish";
                default -> "Chicken";
            };
	}
		
}
