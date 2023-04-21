package String;
import java.util.Scanner;
public class countVowel 
{

	//public static int countVowel(String str)
	public static int countVowel(char[] arr)
	{
		int count=0;
		//for(inti=0;i<str.length();i++)
		for(int i=0;i<arr.length;i++)
		{
			//char c=str.charAt(i);
			char c=arr[i];
			if(c=='A'|| c=='E'|| c=='I'|| c=='O'|| c=='U')
			{
				count++;
			}
			//switch(c)
			//{
			//case 'A':
			//case 'E':
			//case 'I':
			//case 'O':
			//case 'U':
			//count++;
			//break;
			//}
		}
		return count;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		//String st=sc.nextLine().toUpperCase();
		char[] ch=sc.nextLine().toUpperCase().toCharArray();
		//System.out.println("No of vowels in "+st+" is:"+countVowel(st));
		System.out.println("No of vowels is:"+countVowel(ch));
	}
}
