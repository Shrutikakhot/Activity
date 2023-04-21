package exception;

public class exceptionsEg {

	public static void main(String[] args) {
		//int arr[]=new int[5];
		//arr[10]=50;//ArrayIndexOutOfBoundsException
		//String str=null;;
		//System.out.println(str.charAt(0));//NullPointerException
		//int x=3/0;
		//System.out.println(x);//ArithmeticException
		String s1="hi";
		int y=Integer.parseInt(s1);//NumberFormatException
		System.out.println(y);
	}
}
