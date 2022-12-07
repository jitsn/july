package constructors1;
import java.util.Scanner;
public class scan {
public static void main(String[] args) {
	
	Scanner a=new Scanner(System.in);
	System.out.println("enter byte value");
	byte b=a.nextByte();
	System.out.println("print value "+ b);
	System.out.println();
	System.out.println("enter float value");
	float c=a.nextFloat();
	System.out.println("my float value is "+c);
	System.out.println("enter string value");
	String d=a.next();
	System.out.println("String value "+d);
}
}
