//WAP to add the elements of two different arrays

package practiceCode;

import java.util.Arrays;

public class AddTwoArrays 
{

	public static void main(String[] args)
	{
		//Declare and initialize the array elements:
		int[] a= {50,16,2,5,3,2};
		int [] b= {33,9,8,6,3,1};
	
		//get the length and store 
		int [] c=new int[a.length];
		
		//check if both length of array are equal
		if(a.length==b.length)
		{
			for(int i=0,j=0,k=0; i<a.length;i++,j++,k++)
			{
				c[k]=a[i]+b[j];
			}
			//print the results
			System.out.println("Two different arrays of Addition is:");
			System.out.println(Arrays.toString(c));
		}
		else
		{
			System.out.println("Length of both array same");
		}
	}
}



