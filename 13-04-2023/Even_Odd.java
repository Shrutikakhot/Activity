//WAP whether entered number is even or odd
package Basic_programs;
import java.util.Scanner;
public class Even_Odd
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);//taking scanner object to scan input from the user 
		System.out.println("Enetr a no:");
		int no = sc.nextInt();
		if(no%2==0)
		{
			System.out.println("No is even");//checks whether a no is divisible by 0
			//System.out.println(no+"is an even number");
		}
		else
		{
			System.out.println("No is odd");
		}
	}
}
