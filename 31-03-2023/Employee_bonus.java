package practiceCode;

import java.util.Scanner;

public class Employee_bonus {

	public static void main(String[] args) {
	
		/*WAP to find whether an employee is eligible for bonus or not. 
		If the employee is working for more than 2 years, he/she will be getting a bonus of ₹2000 if not he/she is not eligible for bonus.*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee salary");
		int salary=sc.nextInt();
		
		System.out.println("How many years Employee is working");
		int years = sc.nextInt();
		if( years>=2)
		{
			System.out.println("Eligible for bonus");
			salary=salary+2000;
			System.out.println("salary with bonus:"+salary);
		}
		else
		{
			System.out.println("You not eligible for bonus");
			System.out.println("salary:"+salary);
		}
	}
}
