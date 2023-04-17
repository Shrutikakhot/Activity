//Single Inheritance example
package Basic_programs;
//parent/base/super class
class User
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
class Employee1 extends User
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
public class single_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee1 emp=new Employee1();
emp.setData(123, "ABC", "Solapur", 30000, "Java developer");
emp.Display();
	}

}
