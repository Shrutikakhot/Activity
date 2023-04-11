//WAP to merge two different arrays into a single array
package practiceCode;

import java.util.Scanner;

public class MergeTwoDifferentArray 
{

	public static void main(String[] args) 
	{
		
		int i,k=0;
		int[] a=new int[5];
		int[] b=new int[5];
		int[] c=new int[10];
		Scanner sc=new Scanner(System.in);
		//printing first array 5 elements
		System.out.println("Enter 5 elements for first array:");
		for(i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		//printing second array 5 elements
		System.out.println("Enter 5 elements for Second array:");
		for(i=0;i<5;i++)
		{
			b[i]=sc.nextInt();
		}
		
		//copying the first array to third array
		for(i=0; i<5; i++, k++)
		{
			c[k]=a[i];//i variable values store in k variable
		}
		
		//copying the second array to third array
		for(i=0; i<5; i++, k++)
		{
			c[k]=b[i];
		}
		
		//printing the merged array
		System.out.println("Merged array is:");
		for(i=0;i<10;i++)
		{
			System.out.print(c[i]+" ");
		}
	}

}
