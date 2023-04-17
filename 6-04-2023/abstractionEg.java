package practiceCode;

//using abstract keyword to declare an abstract class
abstract class Bank
{
	//concrete method-method that has a body(non abstract method)
	public void display()
	{
		System.out.println("This is an abstract bank class.");
	}
	//abstract method-method that has no body
	//must be declared using abstract keyword and in the end followed by a semicolon
	abstract public void getLoanInterest();
	
	abstract public void accounts();
}
class sbi extends Bank
{

	@Override
	public void getLoanInterest() {
		// TODO Auto-generated method stub
		System.out.println("SBI is providing 6.5 % interest.");
	}

	@Override
	public void accounts() {
		// TODO Auto-generated method stub
		System.out.println("SBI allows to create 3 different accounts.");
	}
	
}
class HDFC extends Bank
{

	@Override
	public void getLoanInterest() {
		// TODO Auto-generated method stub
		System.out.println("HDFC is providing 8% interest.");
	}
	public void fixedDeposit()
	{
		System.out.println("HDFC provides fixed deposit option.");
	}

	@Override
	public void accounts() {
		// TODO Auto-generated method stub
		System.out.println("HDFC allows to create 4 different accounts.");
	}
	
}
public class abstractionEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank;
		bank=new sbi();
		bank.getLoanInterest();
		bank.accounts();
		bank.display();
		System.out.println();
		
		HDFC hdfc= new HDFC();
		hdfc.getLoanInterest();
		hdfc.accounts();
		hdfc.display();
	}

}
