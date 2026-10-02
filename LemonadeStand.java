// LemonadeStand.java
// Vibu Ramineni
// This program will be the "setup" for a lemonade stand that tracks various stats related to selling lemonade
import java.util.Scanner;

public class LemonadeStand
{
	private double cashOnHand = 10;

	private String[] nameItems = {"cups", "lemons", "cups of sugar", "cups of ice cubes"};

	private double[] costItems = {0.1, 1.5, 2, 0.75}; // cups, lemons, sugar, ice

	private int[] qtyItems = {0, 0, 0, 0};            // cups, lemons, sugar, ice

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
		    playGame();
		}
	}

	public void buySupplies()
	{
		clearScreen();

		if (choice >= 1 && choice <= 4)
		{
			int item = choice - 1;

			System.out.println("You have " + qtyItems[item] + " " + nameItems[item]);

			System.out.print("\nEach costs $");
			System.out.printf("%.2f", costItems[item]);

			System.out.print("\n\nHow many do you want to buy: ");
			int amount = scan.nextInt();
			temp = scan.nextLine();

			double totalCost = amount * costItems[item];

			if (amount <= 0)
			{
				System.out.println("\nYou must buy at least 1.");
			}
			else if (totalCost > cashOnHand)
			{
				System.out.println("\nYou do not have enough money.");
			}
			else
			{
				cashOnHand = cashOnHand - totalCost;
				qtyItems[item] = qtyItems[item] + amount;

				System.out.println("\nYou bought " + amount + " " + nameItems[item]);
				System.out.print("You now have $");
				System.out.printf("%.2f", cashOnHand);
				System.out.println();
			}

			System.out.print("\nPress enter to go back.");
			temp = scan.nextLine();
		}
		else if (choice != 5)
		{
			System.out.println("\nInvalid option.");
			System.out.print("\nPress enter to go back.");
			temp = scan.nextLine();
		}

		inventory();
	}

	public void playGame()
	{
		while (day < numDay)
		{
			day = day + 1;
			clearScreen();

			System.out.println("\nDay " + day);
			System.out.println("\n1 batch makes 4 cups of lemonade.");
			System.out.println("Each batch needs:");
			System.out.println("1 lemon, 1 cup of sugar, and 1 cup of ice");
			System.out.println("\nYou have:");
			System.out.println(qtyItems[0] + " cups");
			System.out.println(qtyItems[1] + " lemons");
			System.out.println(qtyItems[2] + " cups of sugar");
			System.out.println(qtyItems[3] + " cups of ice cubes");

			System.out.print("\nHow many batches do you want to make: ");
			int batches = scan.nextInt();
			temp = scan.nextLine();

			if (batches < 0)
			{
				System.out.println("\nYou cannot make a negative amount.");
				day = day - 1;
			}
			else if (batches * 4 > qtyItems[0]
					|| batches > qtyItems[1]
					|| batches > qtyItems[2]
					|| batches > qtyItems[3])
			{
				System.out.println("\nYou do not have enough supplies.");
				System.out.println("You made no lemonade today.");
			}
			else
			{
				int cupsMade = batches * 4;
				int cupsSold = cupsMade;

				if (cupsSold > 8)
				{
					cupsSold = 8;
				}

				qtyItems[0] = qtyItems[0] - cupsMade;
				qtyItems[1] = qtyItems[1] - batches;
				qtyItems[2] = qtyItems[2] - batches;
				qtyItems[3] = qtyItems[3] - batches;

				double moneyEarned = cupsSold * 1.0;
				cashOnHand = cashOnHand + moneyEarned;

				System.out.println("\nYou made " + cupsMade + " cups.");
				System.out.println("You sold " + cupsSold + " cups for $1 each.");
				System.out.println((cupsMade - cupsSold) + " cups were left over and thrown away.");

				System.out.print("\nYou now have $");
				System.out.printf("%.2f", cashOnHand);
				System.out.println();
			}

			System.out.print("\nPress enter to continue.");
			temp = scan.nextLine();
		}

		clearScreen();
		System.out.println("\nGame over!");
		System.out.print("\nYou finished with $");
		System.out.printf("%.2f", cashOnHand);
		System.out.println();
		System.out.print("Your profit was $");
		System.out.printf("%.2f", cashOnHand - 10);
		System.out.println();
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
