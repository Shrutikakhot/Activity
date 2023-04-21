package String;

public class stringFunctionDemo 
{
	public static void main(String[] args) 
	{
	//string literal
		//we use it mainly to save memory so that new memories are not created for the same string
		String name="Shrutika";
		String name1="Shrutika";//It doesn't create a new instance
		
		String str="Welcome";
		System.out.println(name==name1);
		//checking if name is same as str since it is different the o/p will return false
		System.out.println(name==str);
		//joining using concat function
		name=name.concat(" Khot");
		System.out.println(name);
		
		System.out.println();
		String message="Good Morning";
		int index=11;
		char ch=message.charAt(index);
		System.out.println(index+" th character :"+ch);
		//By using new keyword
		String str1=new String("Welcome");
		String str2=new String("Welcome");
		System.out.println();
		System.out.println(str1==str2);//comparing the references
		System.out.println(str1.equals(str2));//comparison of values
		
		String s1="hello";//104
		String s2="hello";
		String s3="meklo";//109 ascii values
		String s4="hemlo";
		String s5="flag";
		
		System.out.println(s1.compareTo(s2));//equal 0
		System.out.println(s1.compareTo(s3));//-5
		System.out.println(s3.compareTo(s1));//5  109-104=5
		System.out.println(s1.compareTo(s4));//-1
		System.out.println(s1.compareTo(s5));//2
		
		String high="king";
		System.out.println(high.toUpperCase());
		String low="KING";
		System.out.println(low.toLowerCase());
		System.out.println();
		
		//STring Buffer--mutable
		StringBuffer buffer=new StringBuffer("Hello Java");//default capacity 16
		System.out.println(buffer.capacity());//27
		buffer.append(" world this is a welcome message");//appending or adding the string
		System.out.println(buffer);
		System.out.println(buffer.capacity());//(27*2)+2=56
		System.out.println(buffer.charAt(4));//o
		System.out.println(buffer.indexOf("ello"));//checking the index of the word (output 1)
		
		//substring is used in two ways
		//1)by giving the starting index it will print rest of the string
		System.out.println(buffer.substring(6));
		
		//2)by giving the start index and the end index -1
		System.out.println(buffer.substring(6,10));
		
		//it will delete the string present in the index(in our case it was java)
		buffer.delete(6, 10);
		System.out.println(buffer);
		
		//String Builder
		StringBuilder builder=new StringBuilder("java 20");
		System.out.println("String Builder:"+builder);
		System.out.println();
		builder.append(" latest version");
		System.out.println(builder);
		System.out.println();
		builder.insert(7, " is the");//insert a string from the index which is provided
		System.out.println(builder);
		System.out.println();
		builder.reverse();//to reverse your string builder
		System.out.println("Reversed string :"+builder);
		System.out.println();
		System.out.println(builder.indexOf("avaj"));//finding the position of avaj
		System.out.println();
		builder.replace(25, 29, "java");//replacing avaj by java
		System.out.println(builder);
	}
}
