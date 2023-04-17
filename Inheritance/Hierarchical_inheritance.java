//Hierarchical_inheritance Example
package Basic_programs;
class RBI//parent class
{
	public void loanInterest()
	{
		System.out.println("Loan Interest: 5%");
	}
}

class SBI extends RBI//parent class
{
	public void PensionScheme()
	{
		System.out.println("Min. 5 years scheme needs to be taken.");
	}
}

class ICICI extends RBI//parent class
{
	public void fixedDeposit()
	{
		System.out.println("Tenor years is 5 years..");
	}
}
public class Hierarchical_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI sbi=new SBI();
		sbi.PensionScheme();
		sbi.loanInterest();
		System.out.println();
		ICICI ic=new ICICI();
		ic.fixedDeposit();
		ic.loanInterest();
	}
}
