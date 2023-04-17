package practiceCode;

import java.util.Scanner;

public class MaxMinNum {

	public static void main(String[] args) 
	{
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter" +size+" elements:");
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		int min=arr[0];
		for(i=1;i<size;i++)
		{
			if(arr[i]>max)
				max=arr[i];
			else if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("Maximum number:"+max);
		System.out.println("Minimum number:"+min);
		}
}
