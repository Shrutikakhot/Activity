//Address.java
package Basic_programs;
public class Address {
	private String city, country,state;
	private int pincode ;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public Address(String city, String country, String state, int pincode) {
		super();
		this.city = city;
		this.country = country;
		this.state = state;
		this.pincode = pincode;
	}
	public Address()
	{
		super();
	}
}

//Employee.java
package Basic_programs;

public class Employee {
	private int empId;
	private String empName;
	private double salary;
	
	private Address address;//entity reference

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public double getSalary() {
		return salary;
	}
  
	public Address getAddress() {
		return address;
	}

	public Employee(int empId, String empName, double salary, Address address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.address = address;
	}	
}

//AggregationDemo.java
package Basic_programs;

public class AggregationDemo {

	public static void main(String[] args) {
		Address add1=new Address("Berlin","Germany","Green-state",70045);
		Address add2=new Address("New york city","USA","New York",10087);
		
	Employee e1=new Employee(101,"Shrutika",30000,add2);
	Employee e2=new Employee(111,"Shruti",80000,add1);
	
	System.out.println("EMployee Name:"+e1.getEmpName());
	System.out.println("Employee Address(city):"+e1.getAddress().getCity());
	System.out.println("EMployee Address(country):"+e1.getAddress().getCountry());
	System.out.println();
	System.out.println("EMployee Name:"+e2.getEmpName());
	System.out.println("Employee Address(city):"+e2.getAddress().getCity());
	System.out.println("EMployee Address(country):"+e2.getAddress().getCountry());
	}

}
