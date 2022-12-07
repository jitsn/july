package practice;
import java.util.Scanner;

public class ReverseNumMock {
	public static void main(String[] args) {
	    int d;
 Scanner ABC=new Scanner(System.in);
	 
	System.out.println("enter the value");
	
	 int value=ABC.nextInt();
	 
	System.out.println("reverse value is= ");
	
	 for (int i=value;i>=0;i--) {
		 
		 d=value%10;//d=5,
		 value=value/10;//value=1234
		 i=value;
		 System.out.print(d);
		 
	 }
}
}