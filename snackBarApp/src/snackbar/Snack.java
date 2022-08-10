package snackbar;

public class Snack 
{
	// my fields 
	private static int maxId = 0;

	private int id;
	private String name;
	private int quantity;
	private double cost;
	private int vendingMachineId;

	// constructor
	public Snack(String name, int quantity, double cost, int vendingMachineId)
	{
		maxId++;
		id = maxId;

		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.vendingMachineId = vendingMachineId;
	}


	// getters and setters

	// get id
	public int getId()
	{
		return id;
	}

	// get and set NAME
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	//get and set COST
	public double getCost()
	{
		return cost;
	}
	public void setCost(double cost)
	{
		this.cost = cost;
	}

	//get and set VENDING MACHINE ID
	public int getVendingMachineId()
	{
		return vendingMachineId;
	}

	public void setVendingMachineId(int vendingMachineId)
	{
		this.vendingMachineId = vendingMachineId;
	}

	// get QUANTITY
	public int getQuantity()
	{
		return quantity;
	}

	//add quantity when given how many to add
	public void addQuantity(int quantity)
	{
		this.quantity += quantity;
	}


	//buy snack when given how many to buy
	public void buySnack(int quantity)
	{
		this.quantity -= quantity;
	}

	//get total cost given a quantity
	public double getTotal(int quantity)
	{
		return this.cost * quantity;
	}



} // closing 








