import java.util.*;
import model.*;

public class Main {
	
	Regular regular = new Regular();
	Premium premium = new Premium();
	Scanner scan = new Scanner(System.in);
	
	public void PrintRegular() {
		System.out.println("\n*=====================DeluXe Book Store====================*");
		System.out.println("*==========================================================*");
		System.out.printf("| %-15s | %-10s | %-11s | %-11s |\n", "Name", "Category", "Total Pages", "Total Price");
		System.out.println("*==========================================================*");
		System.out.printf("| %-15s | %-10s | %-11d | %-11d |\n", regular.getName(), regular.getCategory(), regular.getPage(), regular.totalPrice());
		System.out.println("*==========================================================*\n");
		System.out.println("Press enter to reorder\n"); scan.nextLine();
	}
	
	public void InputRegular() {
		String category = "";
		String name = "";
		int page = 0;
		
		do {
			System.out.printf("Input book's category[Comedy | Romance | Fiction]: ");
			category = scan.nextLine();
		}while(regular.setCategory(category) == false);
		
		do {
			System.out.printf("Input book's name[5 - 15 characters]: ");
			name = scan.nextLine();
		}while(regular.setName(name) == false);

		do {
			System.out.printf("Input book's pages [more than or equals 50 pages]: ");
			try {
				page = scan.nextInt(); scan.nextLine();
			} catch (Exception e) {
				// TODO: handle exception
				scan.nextLine();
			}
		}while(regular.setPage(page) == false);
		
		PrintRegular();
	}
	
	public void PrintPremium() {
		System.out.println("\n*=========================DeluXe Book Store==========================*");
		System.out.println("*====================================================================*");
		System.out.printf("| %-15s | %-10s | %-11s | %-7s | %-11s |\n", "Name", "Category", "Total Pages", "Cover", "Total Price");
		System.out.println("*====================================================================*");
		System.out.printf("| %-15s | %-10s | %-11d | %-7s | %-11d |\n", premium.getName(), premium.getCategory(), premium.getPage(), premium.getCover(), premium.totalPrice());
		System.out.println("*====================================================================*\n");
		System.out.println("Press enter to reorder\n"); scan.nextLine();
	}
	
	public void InputPremium() {
		String category = "";
		String name = "";
		int page = 0;
		String cover = "";
		
		do {
			System.out.printf("Input book's category[Comedy | Romance | Fiction]: ");
			category = scan.nextLine();
		}while(premium.setCategory(category) == false);
		
		do {
			System.out.printf("Input book's name[5 - 15 characters]: ");
			name = scan.nextLine();
		}while(premium.setName(name) == false);

		do {
			System.out.printf("Input book's pages[more than or equals 50 pages]: ");
			try {
				page = scan.nextInt(); scan.nextLine();
			} catch (Exception e) {
				// TODO: handle exception
				scan.nextLine();
			}
		}while(premium.setPage(page) == false);
		
		do {
			System.out.printf("Input book's cover[Soft | Hard]: ");
			cover = scan.nextLine();
		}while(premium.setCover(cover) == false);
		
		PrintPremium();
	}
	
	public void Menu() {
		
		String input = "";
		String temp = "";
		
		do {
			
			System.out.println("DeluXe Book Store");
			System.out.println("=================");
			
			do {
				System.out.println("Choose one of these item to buy");
				System.out.println("1. Regular Book");
				System.out.println("2. Premium Book");
				System.out.println("3. Exit");
				System.out.printf(">> ");
				temp = scan.nextLine();
				
				if (temp.equals("1")) {
					input = temp;
					InputRegular();
				} 
				else if (temp.equals("2")) {
					input = temp;
					InputPremium();
				} 
				else if (temp.equals("3")) {
					input = temp;
					break;
				} 
				else {
					System.out.println("Wrong Input!\n");
				}
				
			} while (input == "");
			
		}while(!input.equals("3"));
		
	}
	
	public Main() {
		Menu();
	}

	public static void main(String[] args) {
		new Main();

	}

}
