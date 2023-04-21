package String;

import java.util.Scanner;

public class palindromeusingStringBuilder 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine().toLowerCase();
		StringBuilder builder=new StringBuilder(str);
		String str1=builder.reverse().toString();
		if(str.equals(str1))
		{
			System.out.println(str+" is a palindrome.");
			System.out.println(builder+" == "+builder.reverse());
		}
		else
		{
			System.out.println(str+ " is not a palindrome.");
			System.out.println(builder+" != "+builder.reverse());
		}
	}
}
