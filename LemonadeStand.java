// LemonadeStand.java
// Vibu Ramineni
// This program will be the "setup" for a lemonade stand that tracks various stats related to selling lemonade
import java.util.Scanner;

public class LemonadeStand
{
	private double cashOnHand = 10;

	private String[] nameItems = {"cups", "lemons", "cups of sugar", "cups of ice cubes"};

	private double[] costItems = {0.1, 1.5, 2, 0.75}; // cups, lemons, sugar, ice

	private int[] qtyItems = {0, 1, 2, 3};            // cups, lemons, sugar, ice

	private int day = 0; // what day it is
	private int numDay;  // how many days to play
	// private int temperature = 0;
	// private int weather = 0;

	Scanner scan = new Scanner(System.in);
	int choice;
	String temp;

	public void setup()
	{
	    clearScreen();

		System.out.print("\nHow many days you want to play: ");

		numDay = scan.nextInt(); // still need to clear the buffer
		String temp = scan.nextLine();
	}

	public void inventory()
	{
	    clearScreen();

		System.out.print("\nInventory/Purchasing\n\nIt is day " + day + "\n\nYou have $");
		System.out.printf("%.2f", cashOnHand);
		System.out.println(" and:");
		System.out.println(qtyItems[0] + " " + nameItems[0] + "\n" + qtyItems[1] + " " + nameItems[1] + "\n" + qtyItems[2] + " " + nameItems[2] + "\n" + qtyItems[3] + " " + nameItems[3]);

		System.out.println("\nYou can:\n\n1. Buy more supplies\n2. Play the game");
		System.out.print("\nChoose an option: ");

		choice = scan.nextInt(); // still need to clear the buffer
		temp = scan.nextLine();

		clearScreen();

		if (choice == 1)
		{
			System.out.print("\n\nYou have $");
			System.out.printf("%.2f", cashOnHand);
			System.out.println(" and:");
			System.out.println(qtyItems[0] + " " + nameItems[0] + "\n" + qtyItems[1] + " " + nameItems[1] + "\n" + qtyItems[2] + " " + nameItems[2] + "\n" + qtyItems[3] + " " + nameItems[3]);

			System.out.println("\nYou can:\n\n1. Buy " + nameItems[0] + "\n2. Buy " + nameItems[1] + "\n3. Buy " + nameItems[2] + "\n4. Buy " + nameItems[3] + "\n5. Go back");
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
	    clearScreen();
		System.out.println("You have " + qtyItems[choice - 1] + " " + nameItems[choice - 1] + "\n");
	}

	public String toUpper(String string)
	{
	    clearScreen();
	    return string.substring(0, 1).toUpperCase() + string.substring(1);
	}

	public void clearScreen()
	{
	    System.out.print("\033[H\033[2J");
	    System.out.flush();
	}
}
