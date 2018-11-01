
public class CreditCard 
{
	//instance variables
	private int cardNum;
	private double limit;
	private double balance;
	private double interestRate;
	private String holderName;
	
	//constructor
	public CreditCard(int num, double lim, double intRate, String name)
	{
		cardNum = num;
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
		return "Card number: " + cardNum + "\tName: " + holderName + "\tBalance: " + balance + "\tRate: " + interestRate + "\tLimit: " + limit;
	}
	
	//methods - getters
	
	public void getCardNum()
	{
		System.out.print("Card Number: " + cardNum);
	}
	
	public void getLimit()
	{
		System.out.print("Limit: " + limit);
	}
	
	public void getBalance()
	{
		System.out.print("Balance: " + balance);
	}
	
	public void getInterestRate()
	{
		System.out.print("Interest Rate: " + interestRate);
	}
	
	public void getHolderName()
	{
		System.out.print("Holder Name: " + holderName);
	}
}
