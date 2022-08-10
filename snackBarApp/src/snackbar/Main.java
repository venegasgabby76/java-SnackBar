package snackbar;

public class Main 
{
		public static void main(String[] args)
		{
			System.out.println("This is just to make sure that everything is running correctly!!");


			//customers
			Customer c1 = new Customer("Jane" , 45.25);
			Customer c2 = new Customer("Bob" , 33.14);

			//vending machines
			VendingMachine v1 = new VendingMachine("Food");
			VendingMachine v2 = new VendingMachine("Drink");
			VendingMachine v3 = new VendingMachine("Office");


			   //snacks in Food machine
    		Snack s1 = new Snack("Chips", 36, 1.75, v1.id);
    		Snack s2 = new Snack("Chocolate Bar", 36, 1.00, v1.id);
    		Snack s3 = new Snack("Pretzel", 30, 2.00, v1.id);

    		//snacks in Drink machine
    		Snack s4 = new Snack("Soda", 24, 2.50, v2.id);
    		Snack s5 = new Snack("Water", 20, 2.75, v2.id);



    		//Customer 1 (Jane) buys 1 of snack 3 (Pretzel)
    		c1.buySnacks(s3.getTotal(1));
    		s3.buySnack(1);
    		//Print Customer 1 (Jane) Cash on hand.
    		System.out.println("Jane cash on hand $" + c1.getCash());
    		//Print quantity of snack 3 (Pretzel).
    		System.out.println("Quantity of Pretzel is " + s3.getQuantity());

    		//Customer 2 (Bob) buys 2 of snack 4 (Soda).
    		c2.buySnacks(s4.getTotal(2));
    		s4.buySnack(2);
    		//Print Customer 2 (Bob) Cash on Hand.
    		System.out.println("Bob cash on hand $" + c2.getCash());
    		//Print quantity of snack 4 (Soda).
    		System.out.println("Quantity of Soda is " + s4.getQuantity());

    		//Customer 1 (Jane) finds $10.
    		c1.addCash(10.00);
    		//Print Customer 1 (Jane) Cash on Hand.
    		System.out.println("Jane cash on hand $" + c1.getCash());

    		//Customer 1 (Jane) buys 1 of snack 2 (Chocolate Bar).
    		c1.buySnacks(s2.getTotal(1));
    		s2.buySnack(1);
    		//Print Customer 1 (Jane) Cash on Hand.
    		System.out.println("Jane cash on hand $" + c1.getCash());
    		//Print quantity of snack 2 (Chocolate Bar).
    		System.out.println("Quantity of Chocolate Bar is " + s2.getQuantity());

    		//Add 12 more items to snack 3 (Pretzel).
    		s3.addQuantity(12);
    		//Print quantity of snack 3 (Pretzel).
    		System.out.println("Quantity of Pretzel is " + s3.getQuantity());

    		//Customer 2 (Bob) buys 3 of snack 3 (Pretzel).
    		c2.buySnacks(s3.getTotal(3));
    		s3.buySnack(3);
    		//Print Customer 2 (Bob) Cash on hand.
    		System.out.println("Bob cash on hand $" + c2.getCash());
    		//Print quantity of snack 3 (Pretzel).
    		System.out.println("Quantity of Soda is " + s3.getQuantity());







		}
}