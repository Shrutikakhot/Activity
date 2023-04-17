//Multilevel Inheritance Example
package Basic_programs;
//parent/base/super class
class ABC
{
	int id;
	String name,address;
	
	public void setData(int id,String name,String address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
	public void display()
	{
		System.out.println("Id:"+this.id);
		System.out.println("Name:"+this.name);
		System.out.println("Address:"+this.address);
	}
}

//child/sub/derived
class Employee2 extends ABC
{
	double salary;
	String designation;
	
	public void setData(int id,String name,String address,double salary,String designation)
	{
		super.setData(id, name, address);//parent class setData
		this.salary=salary;
		this.designation=designation;
	}
	
	public void Display()
	{
		super.display();//calling parent class display() using super
		System.out.println("salary:"+this.salary);
		System.out.println("Designation:"+this.designation);
	}
}
class Employee3 extends Employee2
{
	long phone;
	int pan_no;
	
	public void setData(int id,String name,String address,double salary,String designation,long phone,int pan_no)
	{
		super.setData(id, name, address,salary,designation);//parent class setData
		this.phone=phone;
		this.pan_no=pan_no;
	}
	
	public void Display1()
	{
		super.Display();//calling parent class display() using super
		System.out.println("Phone:"+this.phone);
		System.out.println("pan_no:"+this.pan_no);
	}
}
class Employee4 extends Employee3
{
	long aadhar;
	int age;
	public void setData(int id,String name,String address,double salary,String designation,long phone,int pan_no,long aadhar,int age)
	{
		super.setData(id, name, address,salary,designation,phone,pan_no);//parent class setData
		this.aadhar=aadhar;
		this.age=age;
	}
	
	public void Display2()
	{
		super.display();//calling parent class display() using super
		System.out.println("Aadhar No:"+this.aadhar);
		System.out.println("Age:"+this.age);
	}
}

public class Multilevel_inheritance
{
	public static void main(String[] args)
	{
		Employee4 emp1=new Employee4();
		emp1.setData(111, "ABC", "Solapur", 20000, "Software Developer", 12345687, 9876,897655565,21);
		emp1.Display2();
	}
}
