package fibonacci_series;
import java.util.Scanner;
public class GreatestNumBtween3 {
public static void main(String[] args) {
	Scanner J=new Scanner(System.in);
	System.out.println("Enter value for a: ");
	int a=J.nextInt();
	System.out.println("your entered value for a: "+a);
	System.out.println("Enter value for b:");
	int b=J.nextInt();
	System.out.println("your entered value for b: "+b);
	System.out.println("Enter value for c:");
	int c=J.nextInt();
	System.out.println("your entered value for c: "+c);
	if(a>b&&a>c) {
		System.out.println("Number a is greater ");
	}
    else if(b>a&&b>c) {
	System.out.println("Number b is greater ");
}
	
    else {
	System.out.println("Number c is greater ");
}
	J.close();
}

}
