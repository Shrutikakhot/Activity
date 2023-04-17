//WAP whether a entered character is Alphabet,digit or Special character
package Basic_programs;
import java.util.Scanner;
public class AlphaDigitSpl 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);//Input from user
		System.out.println("Enetr any character:");
		char ch=sc.next().charAt(0);//string into char convert
		if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))//checks the char is alpha or not
		{
			System.out.println(ch+ " is an alphabet");
		}
		else if(ch>='0' && ch<='9')//check the char is digit
		{
			System.out.println(ch+ "  is an Digit");
		}
		else //otherwise it is special character
		{
			System.out.println(ch+ " is a special character");
		}
	}
}
