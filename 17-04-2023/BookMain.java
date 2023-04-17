//Creating Simple Book Application
//Book.java
package BookApplication;

public class Book
{
	private int bookId;
	private String bookName;
	private double bookprice;
	
	//Getter and setter methods
public int getBookId() {
	return bookId;
}
public void setBookId(int bookId) {
	this.bookId = bookId;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public double getBookprice() {
	return bookprice;
}
public void setBookprice(double bookprice) {
	this.bookprice = bookprice;
}
//Parameterized constructor
public Book(int bookId, String bookName, double bookprice) {
	super();
	this.bookId = bookId;
	this.bookName = bookName;
	this.bookprice = bookprice;
}

//default constructor
public Book()
{
	super();
}
}

//BookService.java
package BookApplication;
import java.util.Scanner;
public class BookService 
{
	static Book book[]=new Book[10];
	static Scanner sc=new Scanner(System.in);
	static int index=0;
	
	//create book method
	public static void createBook()
	{
		System.out.println("Enter book id:");
		int id=sc.nextInt();
		boolean flag=false;
		sc.nextLine();
		
		//check book id is already exist or not
		for(int i=0;i<index;i++)
		{
			if(book[i].getBookId()==id)
			{
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
		System.out.println("Enter book name:");
		String bname=sc.nextLine();
		
		System.out.println("Enter book price:");
		double price=sc.nextDouble();
		
		book[index]=new Book(id,bname,price);
		index++;
		System.out.println("Book details created successfully!!");
		System.out.println("----------------------------");
		}
		else
		{
			System.out.println("Book ID is already exits...Please enter another ID");
			createBook();
		}
	}
	
		//get all book details method
		public static void getAllBookDetails()
		{
			for(int i=0;i<index;i++)
			{
				System.out.println("Book Id:"+book[i].getBookId());
				System.out.println("Book Name:"+book[i].getBookName());
				System.out.println("Book Price:"+book[i].getBookprice());
				System.out.println("-------------------------------");
			}
		}
	
		//get book details based on id
		public static void getBookDetailsById()
		{
			System.out.println("Enter id to search:");
			boolean flag=false;
			int id=sc.nextInt();
			for(int i=0;i<index;i++)
			{
				if(book[i].getBookId()==id)
				{
					System.out.println("Book Id:"+book[i].getBookId());
					System.out.println("Book Name:"+book[i].getBookName());
					System.out.println("Book Price:"+book[i].getBookprice());
					System.out.println("-----------------------------");
					flag=true;
					break;
				}
				
			}
				if(flag==false)
					System.out.println("Book not found!!");
		}
		
		//get book details based on name
		public static void getBookDetailsByName()
		{
			boolean flag=false;
			sc.nextLine();
			System.out.println("Enter name to search:");
			String bname=sc.nextLine();
	
			for(int i=0;i<index;i++)
			{
				if(book[i].getBookName().equalsIgnoreCase(bname))
				{
					System.out.println("Book Id:"+book[i].getBookId());
					System.out.println("Book Name:"+book[i].getBookName());
					System.out.println("Book Price:"+book[i].getBookprice());
					System.out.println("-----------------------------");
					flag=true;
					break;
				}
			}
			if(flag==false)
				System.out.println("Book not found!!");
		}
}


//BookMain.java
package BookApplication;
import java.util.Scanner;
public class BookMain 
{
	public static void main(String[] args) 
	{
	BookService bService=new BookService();
	Scanner sc=new Scanner(System.in);
	
	do 
	{
		System.out.println("Welcome to Book Management System");
		System.out.println("Press:\n1)To create Book\n"+"2)To get all book details\n"+"3)To get book details using id\n"+"4)To get book details using name\n"+"5)Exit");
		System.out.println("---------------------------------");
		System.out.println("Enter your choice:");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			bService.createBook();
			System.out.println();
			break;
			
		case 2:
			bService.getAllBookDetails();
			System.out.println();
			break;
			
		case 3:
			bService.getBookDetailsById();
			System.out.println();
			break;
			
		case 4:
			bService.getBookDetailsByName();
			System.out.println();
			break;
			
		case 5:
			System.out.println("Thank you!!Please Visit Again...");
			System.exit(0);
		
		}
	}while(true);
	}
}
