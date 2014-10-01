import java.util.Date;

public class Account {
	
	private int ID = 0;
	private double balance  = 0;
	private double annuallnterestRate = 0;
	private Date dateCreated;
	
	public Account(){
	}
	
	public Account(int ID, double balance, double annuallnterestRate){
		this.ID = ID;
		this.balance = balance;
		this.annuallnterestRate = annuallnterestRate;
	}
	
	public void setID(int x){
		this.ID = x;
	}
	public int getID(){
		return this.ID;
	}
	
	public void setbalance(double y){
		this.balance = y;
	}
	
	public void setannuallnterestRate(double annuallnterestRate){
		this.annuallnterestRate = annuallnterestRate;
	}
	public double getannuallnterestRate(){
		return this.annuallnterestRate;
	}
	
	public Date getdateCreated(){
		return this.dateCreated;
	}
	
	public double getMonthlylnterestRate(){
		return annuallnterestRate/12;
	}
	
	public void withdraw(double withdraw)throws 
	InsufficientFundsException
	{
		if(balance > withdraw){
		balance = balance - withdraw;
		}
		else{
			double x = withdraw - balance;
			System.out.println("You are short by " + x);
			throw new InsufficientFundsException(x);
		}
	}
	
	public void deposit(double deposit){
		balance = balance + deposit;
	}
	
	public double getbalance(){
		return balance;
	}
}
