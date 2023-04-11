//Program to print even and odd numbers from the array
package practiceCode;

import java.util.Scanner;

public class SumOddEven {

	public static void main(String[] args) {
		int odd=0,even=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter "+size+" elements of array:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();	
			}
		for(int i:arr)
		{
			if(i%2==0)
				even++;
			else
				odd++;
		}
		System.out.println("Even numbers:"+even);
		System.out.println("Odd numbers:"+odd);
	}
}
