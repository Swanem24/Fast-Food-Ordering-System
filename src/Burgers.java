import java.util.ArrayList;
import java.util.Scanner;

public class Burgers 
{
	Order checkout = new Order();

	public void addBurg()
	{
		// Scanner 
		Scanner myObj = new Scanner(System.in);
		System.out.println("Choose an item: \r"
				+ "1. Hamburger £5.00 \r"
				+ "2. Hot Dog £3.00 \r"
				+ "3. Grilled Cheese £1.58	\r"
				+ "4. Veggie Burger	£2.30	\r"	
				+ "5. Large Fries	£4.00	\r"
				+ "6. Medium Fries	£2.50	\r"
				+ "7. Little Fries	£1.60	\r"
				+ "8. Soda Cups	£1.00	\r"
				+ "9. Exit"
				);
			
		int burg = myObj.nextInt();
		
		// Getting the user selected burger
		switch (burg)
		{
		case 1:
			System.out.println("One Hamburger added");
			checkout.users_order.add("Hamburger");
			checkout.total_cost = checkout.total_cost + 5;
			System.out.println("Your order: " + checkout.users_order);
			System.out.println("Total cost: £" + checkout.total_cost);
			break;
		case 2:
			System.out.println("One Hot Dog added");
			checkout.users_order.add("Hot Dog");
			checkout.total_cost = checkout.total_cost + 3;
			System.out.println("Your order: " + checkout.users_order);
			System.out.println("Total cost: £" + checkout.total_cost);
			break;
		case 3:
			System.out.println("One Grilled Cheese added");
			checkout.users_order.add("Grilled Cheese");
			checkout.total_cost = checkout.total_cost + 1.58;
			System.out.println("Your order: " + checkout.users_order);
			System.out.println("Total cost: £" + checkout.total_cost);
			break;
		case 4:
			System.out.println("One Veggie Burger added");
			checkout.users_order.add("Veggie Burger Burger");
			checkout.total_cost = checkout.total_cost + 2.30;
			System.out.println("Your order: " + checkout.users_order);
			System.out.println("Total cost: £" + checkout.total_cost);
			break;
		case 5:
			System.out.println("One Large Fries added");
			checkout.users_order.add("Large Fries Burger");
			checkout.total_cost = checkout.total_cost + 4;
			System.out.println("Your order: " + checkout.users_order);
			System.out.println("Total cost: £" + checkout.total_cost);
			break;
		case 6:
			System.out.println("One Medium Fries added");
			checkout.users_order.add("Medium Fries Burger");
			checkout.total_cost = checkout.total_cost + 2.50;
			System.out.println("Your order: " + checkout.users_order);
			System.out.println("Total cost: £" + checkout.total_cost);
			break;
		case 7:
			System.out.println("One Little Fries added");
			checkout.users_order.add("Little Fries Burger");
			checkout.total_cost = checkout.total_cost + 1.60;
			System.out.println("Your order: " + checkout.users_order);
			System.out.println("Total cost: £" + checkout.total_cost);
			break;
		case 8:
			System.out.println("One Soda Cups added");
			checkout.users_order.add("Soda Cups Burger");
			checkout.total_cost = checkout.total_cost + 1;
			System.out.println("Your order: " + checkout.users_order);
			System.out.println("Total cost: £" + checkout.total_cost);
			break;
		case 9:
			break;
		default:
			System.out.println("No burger found");
			addBurg();
		}
		
		System.out.println("Would you like to add more items? \r"
				+ "Enter 1 for yes \r"
				+ "Enter 2 for no");
		int contin = myObj.nextInt();
		
		switch (contin)
		{
		case 1: 
			addBurg();
			break;
		
		case 2:
			System.out.println("Your order: " + checkout.users_order);
			System.out.println("Total cost: £" + checkout.total_cost);
		}
	}
}


