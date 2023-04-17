package practiceCode;

import java.util.Scanner;

public class RemoveElement_Array
{
	public static void main(String[] args) 
	{
		int i,j,size=10,element;//declare variables
		int[] arr=new int[size];//array declares
		Scanner sc=new Scanner(System.in);//used to read user input
		
		System.out.println("Enter 10 elements:");//displays the elements
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();//read an integer from scanner an assign to i th position of the arr array
		}
		//for displaying which element to remove
		System.out.println("Enter the element to remove:");
		element=sc.nextInt();//read an integer from the user and assign it to element variable
		
		for(i=0;i<size;i++)//starts the for loop
		{
			if(element==arr[i])//check element variable is equal to the element of the 'arr' array
			{
				for(j=i;j<(size-1);j++)//starts a nested for loop i to size-1
					arr[j]=arr[j+1];
				System.out.println("Element removed successfully..");
				break;//break inner for loop
			}
		}
		System.out.println("The new array is:");//print the new array
		for(i=0;i<(size-1);i++)
			System.out.println(arr[i]+" ");
		}
}
