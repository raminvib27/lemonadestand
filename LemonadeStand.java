// LemonadeStand.java
// Vibu Ramineni
// This program will be the "setup" for a lemonade stand that tracks various stats related to selling lemonade
import java.util.Scanner;

public class LemonadeStand
{
	private double cashOnHand = 10;
	
	private String[] names = {"cups", "lemons", "cups of sugar", "cups of ice cubes"};
	
	// private double costOfCups = 0.1;               // qty 1 cup
	// private double costOfLemons = 1.5;             // qty 1 lemon
	// private double costOfSugar = 2;                // qty 1 cup sugar
	// private double costOfIce = 0.75;               // qty 1 cup ice
	
	private double[] costItems = {0.1, 1.5, 2, 0.75}; // cups, lemons, sugar, ice
	
	// private int qtyCups = 0;
	// private int qtyLemons = 0;
	// private int qtySugar = 0;
	// private int qtyIce = 0;
	
	private int[] qtyItems = {0, 1, 2, 3};            // cups, lemons, sugar, ice
	
	private int day = 0;
	private int numDay;
	// private int temperature = 0;
	// private int weather = 0;
	
	Scanner scan = new Scanner(System.in);
	int choice;
	String temp;
	
	public void setup()
	{
		System.out.print("\033[H\033[2J");
		System.out.flush();
		
		System.out.print("\nHow many days you want to play: ");
		
		numDay = scan.nextInt(); // still need to clear the buffer
		String temp = scan.nextLine();
	}
	
	public void inventory()
	{
		System.out.print("\033[H\033[2J");
		System.out.flush();
		
		System.out.print("\nInventory/Purchasing\n\nIt is day " + day + "\n\nYou have $");
		System.out.printf("%.2f", cashOnHand);
		System.out.println(" and:");
		System.out.println(qtyItems[0] + " Cups\n" + qtyItems[1] + " Lemons\n" + qtyItems[2] + " Sugar cubes\n" + qtyItems[3] + " Ice cubes");
		
		System.out.println("\nYou can:\n\n1. Buy more supplies\n2. Play the game");
		System.out.print("\nChoose an option: ");
		
		choice = scan.nextInt(); // still need to clear the buffer
		temp = scan.nextLine();
		
		System.out.print("\033[H\033[2J");
		System.out.flush();
		
		if (choice == 1)
		{
			System.out.print("\n\nYou have $");
			System.out.printf("%.2f", cashOnHand);
			System.out.println(" and:");
			System.out.println(qtyItems[0] + " Cups\n" + qtyItems[1] + " Lemons\n" + qtyItems[2] + " Sugar cubes\n" + qtyItems[3] + " Ice cubes");
			
			System.out.println("\nYou can:\n\n1. Buy " + names[0] + "\n2. Buy lemons\n3. Buy cups of sugar\n4. Buy cups of ice cubes\n5. Go back");
			System.out.print("\nChoose an option: ");
			
			choice = scan.nextInt(); // still need to clear the buffer
			temp = scan.nextLine();
			
			buySupplies();
		}
		else 
		{
		}
	}
	
	public void buySupplies()
	{
		System.out.println("You have " + qtyItems[choice - 1] + " " + names[choice - 1]);
	}
}
