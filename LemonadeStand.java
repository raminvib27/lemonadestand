// LemonadeStand.java
// Vibu Ramineni
// This program will be the "setup" for a lemonade stand that tracks various stats related to selling lemonade
import java.util.Scanner;

public class LemonadeStand
{
	private double cashOnHand = 10;
	
	private double costOfCups = 0.1;   // qty 1 cup
	private double costOfLemons = 1.5; // qty 1 lemon
	private double costOfSugar = 2;    // qty 1 cup caster sugar
	private double costOfIce = 0.75;   // qty 1 cup ice
	
	private int qtyCups = 0;
	private int qtyLemons = 0;
	private int qtySugar = 0;
	private int qtyIce = 0;
	
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
		System.out.println(qtyCups + " Cups\n" + qtyLemons + " Lemons\n" + qtySugar + " Sugar cubes\n" + qtyIce + " Ice cubes");
		
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
			System.out.println(qtyCups + " Cups\n" + qtyLemons + " Lemons\n" + qtySugar + " Sugar cubes\n" + qtyIce + " Ice cubes");
			
			System.out.println("\nYou can:\n\n1. Buy cups\n2. Buy lemons\n3. Buy sugar cubes\n4. Buy ice cubes\n5. Go back");
			System.out.print("\nChoose an option: ");
			
			choice = scan.nextInt(); // still need to clear the buffer
			temp = scan.nextLine();			
		}
		else 
		{
			
		}
	}
}
