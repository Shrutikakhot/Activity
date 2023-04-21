package exception;

import java.util.Scanner;

public class try_catchEg
{
	public static void main(String[] args) 
	{
	//Scanner sc=new Scanner(System.in);
	//JAVA nested try block
		try(Scanner sc=new Scanner(System.in))//try with resource
		//the scanner object will get closed automatically
		{
			try 
			{
				int a=20,b=0;
				System.out.println("Division:"+(a+b));
				System.out.println();
			}
			catch(ArithmeticException e)
			{
				System.out.println("Cannot be divided by zero.");
			}
			int arr[]=new int[5];
			arr[5]=78;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception occured:Array Index out of bounds!");
			System.out.println();
		}
		//finally block is the last block/the closing block which always gets executed
		//whether the exception is handled or not
		finally
		{
			//sc.close();//closing the scanner object
			System.out.println("Finally block always gets executed!");
		}
	}
}
