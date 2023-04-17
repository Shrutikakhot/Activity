//Book management system
package Basic_programs;
import java.util.Scanner;
class Book
{
	int bookId,bookPrice;
	String bookName, authorName ,availability;
	static String libraryName="KRC";
	static int count=1;
	boolean isBorrowed;
	
	
	public void createBook(int bookId,String bookName,int bookPrice,
			String authorName,String availability)
	{
		this.bookId=bookId;
		this.bookName=bookName;
		this.bookPrice=bookPrice;
		this.authorName=authorName;
		this.availability=availability;
		
	}
	
	public void displayBook()
	{
		System.out.println(bookId+" )"+bookName);
	}
	
	public void displayBookId()
	{
		System.out.println("Book Id:" +bookId);
		System.out.println("Book Name:" +bookName);
		System.out.println("Book Price:" +bookPrice);
		System.out.println("Author Name:" +authorName);
		System.out.println("Availability:" +availability);
		
		System.out.println("Library:" +libraryName);
	}
	public void borrow_Book()
	{
		if(availability.trim().equalsIgnoreCase(availability))
		{
			System.out.println("Book Name:"+bookName);
			System.out.println("Borrow Book Successfully!!");
		}
		else
		{
			System.out.println(bookName+"Book is not available");
		}
	}
}

public class BookManagementSystem
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Book book1=new Book();
		book1.createBook(101,"Harry Potter", 500, "JK Rowling", "available");
		book1.displayBook();
		
		Book book2=new Book();
		book2.createBook(102,"Wings of fire", 300, "APJ Abdul Kalam", "not available");
		book2.displayBook();
		
		Book book3=new Book();
		book3.createBook(103,"The Indian Story", 400, "Bimal Jalal", " available");
		book3.displayBook();
		
		Book book4=new Book();
		book4.createBook(104,"A Place Called Home", 350, "Preeti Shenoy", "not available");
		book4.displayBook();
		
		Book book5=new Book();
		book5.createBook(105,"How The Earth Got Its Beauty", 600, "Sudha Murty", "available");
		book5.displayBook();
		
		System.out.println();
		do
		{
			System.out.println("Choose An option:\n1) To Check details Of Book" +
	                              	"\n2) TO borrow book\n3) Exit ");
			int choice=sc.nextInt();
			if(choice==1)
			{
				System.out.println("Enter the BookId:");
				int ch=sc.nextInt();
				switch(ch)
				{
				case 101:
					book1.displayBookId();
					System.out.println();
					break;
					
				case 102:
					book2.displayBookId();
					System.out.println();
					break;
					
				case 103:
					book3.displayBookId();
					System.out.println();
					break;
					
				case 104:
					book4.displayBookId();
					System.out.println();
					break;
					
				case 105:
					book5.displayBookId();
					System.out.println();
					break;
					
				default:
						System.out.println("Book Id not found!!");
						System.out.println();
				}
			}
			else if(choice==2)
			{
				
			}
			else if(choice==3)
			{
				System.out.println("Thank you for Visiting " +book1.libraryName);
				System.exit(0);
			}
		}while(true);
	}
}
