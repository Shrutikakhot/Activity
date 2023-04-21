package String;

import java.util.Scanner;

public class Stringpalindrome
{
	public static void main(String[] args)
	{
		String rev="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println();
		if(str.equalsIgnoreCase(rev))
		{
			System.out.println(str+" is a palindrome.");
			System.out.println(str+" == "+rev);
		}
		else
		{
			System.out.println(str+" is not a palindrome.");
			System.out.println(str+" != "+rev);
		}
	}
}
