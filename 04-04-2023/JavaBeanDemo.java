//College.java
package Basic_programs;
//no-args or default constructor
//parameterized constructor
//getter methods and setter
//maintain encapsulation=all variables should private
public class College 
{
	private int collegeId;
	private String collgeName;
	public String location;
	
	//getter and setter methods
	public int getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}
	
	public String getCollgeName() {
		return collgeName;
	}
	public void setCollgeName(String collgeName) {
		this.collgeName = collgeName;
	}
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	//parameterized constructor
	public College(int collegeId, String collgeName) 
	{
		super();
		this.collegeId = collegeId;
		this.collgeName = collgeName;
	}
	
	//default 
	public College() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "College [collegeId=" + collegeId + ", collgeName=" + collgeName + ", location=" + location + "]";
	}

}

//JavaBeanDemo.java
package Basic_programs;

public class JavaBeanDemo 
{
	public static void main(String[] args) 
	{
		College college1=new College();
		college1.setCollegeId(101);
		college1.setCollgeName("WIT");
		college1.setLocation("solapur");
		
		System.out.println(college1.getCollegeId()+" "+college1.getCollgeName()+" "+college1.getLocation());
		
		College college2=new College(102,"D Y Patil");
		System.out.println(college2);
	}
}

