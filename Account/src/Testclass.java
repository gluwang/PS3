import java.util.Date;

public class Testclass {
	public static void main(String[] arg) throws InsufficientFundsException{
		Account bankaccount = new Account(1122, 20000, 4.5);
		bankaccount.deposit(3000);
		bankaccount.withdraw(2500);
		System.out.println("The remain balance in the account is " + bankaccount.getbalance());
		System.out.println("The monthly interest is " + bankaccount.getMonthlylnterestRate());
		
		try
	      {
	         bankaccount.withdraw(40000.00);
	      }catch(InsufficientFundsException e)
	      {
	         e.printStackTrace();
	      }
	}
}
