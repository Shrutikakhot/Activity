//Multiplication of array
package Basic_programs;
public class array_mul 
{
	public static void main(String[] args)
  {
		int my_arr[]= {1,2,3,4};
		int mul=1;
		for(int i:my_arr)
		{
			mul *=i;
		}
		System.out.println("The product is:"+mul);
	}
}
