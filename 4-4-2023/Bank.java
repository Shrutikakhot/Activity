//
package Basic_programs;
import java.util.Scanner;
public class Bank 
{
		public void withdraw(float withdrawl, float balance)
		{
			if(withdrawl<balance)
			{
				float new_bal = balance-withdrawl;
				System.out.println("Withdrawl successful!!");
				System.out.println("Balance: "+new_bal);
			}
			else
			{
				System.out.println("Insufficient Balance!!");
			}
		}
		public void deposite(float deposite, float balance)
		{
			if(deposite>=100)//deposit amount should be at least rs.100
			{
				float new_bal = balance+deposite;
				System.out.println("Deposite Successful!!");
				System.out.println("Balance: "+new_bal);
			}
			else
			{
				System.out.println("Amount should be atleast Rs.100");
			}	
		}
		
		public static void main(String[] args) {
			float balance, deposit, withdrawl, new_bal;
			Bank bank = new Bank();
			Scanner sc = new Scanner(System.in);
			System.out.println("Welcome to SBI");
			System.out.println("Enter your balance: ");
			balance = sc.nextFloat();
			System.out.println("Choose option 1)Withdraw 2)Deposite 3)Exit");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter the amount to withdraw:");
				withdrawl = sc.nextFloat();
				bank.withdraw(withdrawl, balance);
				break;
			
			case 2:
				System.out.println("Enter the amount to Deposit");
				deposit = sc.nextFloat();
				bank.deposite(deposit, balance);
				break;
		
				case 3:
					System.out.println("--Thank you--");
					System.out.println("Please visit again....");
					System.exit(0);
					break;
					
				default:
					System.out.println("Invalid input!!");
			}
		}
	}
