import java.util.*;

import model.Beverage;
import model.Food;

public class Main{
	
	Beverage coffee = new Beverage();
	Food cake = new Food();
	Scanner scan = new Scanner(System.in);
	
	public void CheesecakeOrder() {
		System.out.println("\nCheese Cake Order");
		System.out.println("=========================================================");
		System.out.printf("| %-20s | %-7s | %-6s | %-11s |\n", "Name", "Qty", "Rating", "Total Price");
		System.out.println("=========================================================");
		System.out.printf("| %-20s | %-7d | %-6d | %-11d |\n", cake.getName(), cake.getQty(), cake.getRating(), cake.totalPrice());
		System.out.println("=========================================================\n");
		System.out.println("Press enter to reorder\n"); scan.nextLine();
	}
	
	public void InputCheesecake() {
		
		String name = "";
		int rating = 0;
		int qty = 0;
		
		do {
			System.out.printf("Input order name [5..20 characters]: ");
			name = scan.nextLine();
		}while(cake.setName(name) != true);

		do {
			System.out.printf("Input order rating [1..4]: ");
			try {
				rating = scan.nextInt(); scan.nextLine();
			} catch (Exception e) {
				// TODO: handle exception
				scan.nextLine();
			}
		}while(cake.setRating(rating) != true);
		
		do {
			System.out.printf("Input order quantity: ");
			try {
				qty = scan.nextInt(); scan.nextLine();
			} catch (Exception e) {
				// TODO: handle exception
				scan.nextLine();
			}
		}while(cake.setQty(qty) != true);
		
		System.out.println("\nOrder Cheese Cake Success!\n");
		
		CheesecakeOrder();
	}
	
	public void CoffeeOrder() {
		System.out.println("\nCoffee Order");
		System.out.println("=========================================================================");
		System.out.printf("| %-20s | %-6s | %-4s | %-7s | %-6s | %-11s |\n", "Name", "Size", "Type", "Qty", "Rating", "Total Price");
		System.out.println("=========================================================================");
		System.out.printf("| %-20s | %-6s | %-4s | %-7d | %-6d | %-11d |\n", coffee.getName(), coffee.getSize(), coffee.getType(), coffee.getQty(), coffee.getRating(), coffee.totalPrice());
		System.out.println("=========================================================================\n");
		System.out.println("Press enter to reorder\n"); scan.nextLine();
	}
	
	public void InputCoffee() {
		
		String name = "";
		String size = "";
		String type = "";
		int rating = 0;
		int qty = 0;
		
		do {
			System.out.printf("Input order name [5..20 characters]: ");
			name = scan.nextLine();
		}while(coffee.setName(name) != true);
		
		do {
			System.out.printf("Input order size [Small | Medium | Large]: ");
			size = scan.nextLine();
		}while(coffee.setSize(size) != true);
		
		do {
			System.out.printf("Input order type [Cold | Hot]: ");
			type = scan.nextLine();
		}while(coffee.setType(type) != true);
		
		do {
			System.out.printf("Input order rating [1..4]: ");
			try {
				rating = scan.nextInt(); scan.nextLine();
			} catch (Exception e) {
				// TODO: handle exception
				scan.nextLine();
			}
		}while(coffee.setRating(rating) != true);
		
		do {
			System.out.printf("Input order quantity: ");
			try {
				qty = scan.nextInt(); scan.nextLine();
			} catch (Exception e) {
				// TODO: handle exception
				scan.nextLine();
			}
		}while(coffee.setQty(qty) != true);
		
		System.out.println("\nOrder Coffee Success!\n");
		
		CoffeeOrder();
	}
	
	public void Menu() {
		
		String input = "";
		String temp = "";
		
		do {
			
			System.out.println("Fnbucks Coffe Shop");
			System.out.println("==================");
			System.out.println("(Press 4 to exit)\n");
			
			do {
				System.out.printf("Choose menu you want to order [Coffee | Cheesecake]: ");
				temp = scan.nextLine();
				if (temp.equals("Coffee")) {
					input = temp;
					InputCoffee();
				} 
				else if (temp.equals("Cheesecake")) {
					input = temp;
					InputCheesecake();
				} 
				else if (temp.equals("4")) {
					input = temp;
					break;
				} 
				else {
					System.out.println("Wrong Input!\n");
				}
				
			} while (input == "");
			
		}while(!input.equals("4"));
		
	}

	public Main() {
		
		Menu();
		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
