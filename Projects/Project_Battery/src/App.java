import java.util.Scanner;

public class App {

		private static final int BATTERY_TYPES = 4;
		private static int bill = 0;
		private static int ARRAY_LOCATION = BATTERY_TYPES - 1;
		
		private static final Battery[] batteryArray = new Battery[BATTERY_TYPES];
		private static final Battery[] billArray = new Battery[BATTERY_TYPES];
		
	public static void main(String[] args) {
		
		batteryArray[0] = new Battery("7-ABS", 3500.00, 50);
		batteryArray[1] = new Battery("9-LBS", 4500.00, 75);
		batteryArray[2] = new Battery("4-LBS", 2000.00, 20);
		batteryArray[3] = new Battery("4-LBS-MT", 2250.00, 15);
		
		System.out.println("-------- EXIDE BATTERY COMPANY --------\n");
		try (Scanner scan = new Scanner(System.in)) {
			while (true) {
				
				int i, j = 1;
				printMenu();
				
				int option1 = scan.nextInt();
				
				switch (option1) {
				
				case 1:
					System.out.println("\n----- Batteries & Prices -----\n");
					System.out.println(" Battery Type \t Price(Rs)"); 

					for (i = 0; i <= ARRAY_LOCATION; i++) {
						System.out.println("    " + batteryArray[i].getName() + "\t  " + batteryArray[i].getPrice());
					}
					System.out.print("\n");
					continue;
					
				case 2:
					System.out.println("\n----- Purchasing -----\n");
					System.out.println(" Battery Type \t Price(Rs)");
					
					for (i = 0; i <= ARRAY_LOCATION; i++) {
						System.out.println("  " + j + ". " + batteryArray[i].getName() + "\t   " + batteryArray[i].getPrice());
						j++;
					}
					System.out.print("\n");
					
					purchasing();
					printBill();
					
					System.out.print("\n");
					continue;
					
				case 3:
					System.out.println("\n----- Available Stock -----\n");
					System.out.println(" Battery Type \t #Batteries");

					for (i = 0; i <= ARRAY_LOCATION; i++) {
						System.out.println("   " + batteryArray[i].getName() + "\t    " + batteryArray[i].getTotal());
					}
					System.out.print("\n");
					continue;
					
				case 4:
					System.out.println("\n----- Add New Stock -----\n");
					System.out.println("  1. Add a Existing Battery type");
					System.out.println("  2. Add a new Battery type");
					
			                    OUTER:
			                    while (true) {
			                        System.out.println("Choose an option : ");
			                        int existenceOrNot = scan.nextInt();
			                        switch (existenceOrNot) {
			                            case 1 -> {
                                                        System.out.println("Battery adding is successful!");
                                                        break OUTER;
                                        }
			                            case 2 -> {
                                                        ARRAY_LOCATION += 1;
                                                        addNewBattery();
                                                        System.out.println("New Battery type adding is successful!");
                                                        break OUTER;
                                        }
			                            default -> System.out.println("Incorrect Input! Try Again... \n");
			                        }
			                    }

				
				case 0:
				    System.out.println("You have successfully Exit!");
				    break;
					
				default:
					System.out.println("Invalid Input!");
					
				}
			}
		}
		
	}
	
	public static void printMenu() {
		
		System.out.println("------- Menu --------");
		System.out.println(" 1. Batteries & Prices");
		System.out.println(" 2. Purchasing");
		System.out.println(" 3. Available Stock");
		System.out.println(" 4. Add New Stock");
		System.out.println(" 0. Exit\n");
		
		System.out.print("Choose an option : ");
	}

	public static void purchasing() {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("How many battery types you want to buy : ");
			int numOfBatTypes = scan.nextInt();
			System.out.println("");
			
			for (int j = 0; j < numOfBatTypes; j++) {
				
				System.out.print("Select Battery type : ");
				int batType = scan.nextInt();
				
				System.out.print("Enter Quantity : ");
				int qty = scan.nextInt();
				
				String batName = null;
				
				for (int i = 0; i < ARRAY_LOCATION; i++) {
					if ((i+1) == batType) {
						batName = batteryArray[i].getName();
                                            double unitsPrice = batteryArray[i].getPrice();
						double total = qty * unitsPrice;
						billArray[i] = new Battery(batName, qty, total);
						bill += total;
					}
					
					if (batteryArray[i].getName().equals(batName)) {
						batteryArray[i].getBatteries(qty);
					}
					
				}
			}
		}
		
	}
	
	public static void printBill() {
		
		System.out.println("\n----- Bill Details -----\n");
		System.out.println("Battery Type \t Quantity \t Units Total");
		
		for (int i = 0; i < ARRAY_LOCATION; i++) {
			if (billArray[i] != null) {
				System.out.println("    " + billArray[i].getName() + "\t    " + billArray[i].getQuantity() +
						"\t     " + billArray[i].getPrice());
			}
		}
		
		System.out.println("\nTotal Amount : Rs. " + bill + "\n");
	}

	public static void addNewBattery() {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter New Battery Name : ");
			String name = s.next();
			System.out.println("Enter Battery Price : ");
			double price = s.nextDouble();
			System.out.println("Enter opening Stock : ");
			int stock = s.nextInt();
			
			batteryArray[ARRAY_LOCATION] = new Battery(name, price, stock);
		}
	}
	
	public static void addExistingBattery() {
		
	}

    public static Battery[] getBatteryArray() {
        return batteryArray;
    }

    public static Battery[] getBillArray() {
        return billArray;
    }
	
}
