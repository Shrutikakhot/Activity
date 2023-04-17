//Write a code for to findout the first digit and last digit of that given number
package Basic_programs;

import java.util.Scanner;

public class first_lastdigit_No 
{
	public static void main(String[] args)
	{
		int num,first_digit=0,last_digit=0,temp;//declaring the variables to store the number 
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();//scanning the number and assiginng it to num
		temp=num;
		last_digit=num%10;//finding the modulus which will givs us the lst_digit
		System.out.println("The last digit of the number " +temp+ " is:"+last_digit);
		System.out.println();
		while(num>=10)
		{
			num=num/10;//dividing the number by 10
			first_digit=num;//assigning the value of num in first digit
		}
		System.out.println("The first digit of the number "+temp+ " is:"+first_digit);
	}
}
