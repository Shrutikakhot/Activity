package Basic_programs;

interface Printable//declaring a interface using interface keyword
{
	int x=100;//public,static,and final by default
	void display();//abstract methods
	void fun();
}

//interface->interface extends
//abstract class->class extends
//interface->class implements

interface Drawable extends Printable
{
	void draw();

}
interface sayable
{
	void say();
	void draw();
	
}
///using interface we can achieve multiple inheritance in java
//a class can implement any number of interfaces
class Print implements Drawable,Printable
{

	@Override
	public void display() {
		System.out.println("HELLO");
		
	}

	@Override
	public void fun() {
	System.out.println("This is Fun..");
		
	}

	@Override
	public void draw() {
		System.out.println("Drawing is fun..");
		
	}
	
	public void say()
	{
		System.out.println("Speaking..");
	}
	
}
public class InterfaceEg 
{
	public static void main(String[] args)
	{
		Print print=new Print();
		print.display();
		print.fun();
		print.draw();
		print.say();

	}

}
