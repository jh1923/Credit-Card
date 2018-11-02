
public class CreditCard 
{
	//instance variables
	private int CARDNUM;
	private double limit;
	private double balance;
	private double interestRate;
	private String holderName;
	
	//constructor
	public CreditCard(int num, double lim, double intRate, String name)
	{
		CARDNUM = num;
		limit = lim;
		balance = 0;
		interestRate = intRate;
		holderName = name;
	}
	
	//methods - setters
	public void charge(double payment)
	{
		if (balance + payment < limit)
			balance+=payment;
		else
			System.out.print("Error: you have reached the limit");
	}
	
	public void credit(double uncharge)
	{
		balance-=uncharge;
	}
	
	public void chargeInterest()
	{
		balance = (interestRate*balance) + balance;
	}
	
	public String toString()
	{
		return "Card number: " + CARDNUM + "\tName: " + holderName + "\tBalance: " + balance + "\tRate: " + interestRate + "\tLimit: " + limit + "\n";
	}
	
	//methods - getters
	public int getCardNum()
	{
		return CARDNUM;
	}
	
	public double getLimit()
	{
		return limit;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public double getInterestRate()
	{
		return interestRate;
	}
	
	public String getHolderName()
	{
		return holderName;
	}
}
