package String;
import java.util.Scanner;
public class NoOfOccurances
{
	//create method to count no of occurances
	public static int countOccurances(String str,char ch)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==ch)
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string:");
	String str=sc.nextLine();
	System.out.println();
	System.out.println("Enter a character to count:");
	char ch=sc.next().charAt(0);
	int count=countOccurances(str,ch);//call the method with user inputs
	System.out.println("The character "+ch+" occurs "+count+" times in the string.");//print the result
	}
}
