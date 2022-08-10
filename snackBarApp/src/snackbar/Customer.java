package snackbar;

public class Customer
{
	private static int maxId = 0;

	private int id;
	private String name;
	private double cash;

	public Customer(String name, double cash)
	{
		maxId++;
		id = maxId;

		this.name = name;
		this.cash = cash;
	}

		//get id
		public int getId()
		{
			return id;
		}

		//get and set name
		public String getName()
		{
			return name;
		}

		public void setName(String name)
		{
			this.name = name;
		}

		//get cash
		public double getCash()
		{
			return cash;
		}

		//add cash
		public void addCash(double cash)
		{
			this.cash += cash;
		}

		//buy snacks(substract cash)
		public void buySnacks(double cash)
		{
			this.cash -= cash;
		}


}