package projects;
import java.util.Scanner;
/********************************************      TASK NO. 2       ********************************************************************/
public class BankAccount 
{
	static int amount;//50000;
	BankAccount(int amt){
		amount=amt;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the your bank amount");
		BankAccount ba=new BankAccount(sc.nextInt());
		int choice;
		do {
		System.out.println("Enter the choice");
		System.out.println("1.To check the balance");
		System.out.println("2.To deposit");
		System.out.println("3.To withdraw");
		System.out.println("4.To exit");
		 choice=sc.nextInt();
		switch(choice) 
		{
		case 1:
			ATMmachine.checkBalance();
			break;
		case 2:
			System.out.println("enter the amount to deposit");
			int dpt=sc.nextInt();
			ATMmachine.deposit(dpt);
			break;
		case 3:
			System.out.println("enter the amount to withdraw");
			int wd=sc.nextInt();
			ATMmachine.withDraw(wd);
			break;
		case 4:
			System.out.println("Thank you :) have a nice day\n");
			break;
			default:
				System.out.println("enter valid choice\n");
		}}while(choice!=4);
		
	}
}

/*--------------------------------    ATM Machine class starts from here     -------------------------------*/

 class ATMmachine extends BankAccount
{
	
	ATMmachine()
	{
		super(amount);
	}
	public static void withDraw(int amt)
	{
		if(amt<=amount)
		{
		amount=amount-amt;
		System.out.println("Successfully amount is Withdrawn \n");
		}
		else
			System.out.println("Transaction failed you dont have enough money \n");
	}
	public static void deposit(int amt)
	{ 
		amount=amount+amt;
		System.out.println("Successfully amount is deposited \n");
	}
	public static void checkBalance()
	{
		System.out.println("Your balance is "+amount+"\n");
	}
	
}
