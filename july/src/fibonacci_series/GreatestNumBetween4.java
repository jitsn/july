package fibonacci_series;

import java.util.Scanner;

public class GreatestNumBetween4 {
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
		System.out.println("Enter value for d:");

		int d=J.nextInt();
		System.out.println("your entered value for d: "+d);
		if(a>b&&a>c&&a>d) {
			System.out.println("Number a is greater ");
		}
	    else if(b>a&&b>c&&b>d) {
		System.out.println("Number b is greater ");
	}
	    else if(c>a&&c>b&&c>d) {
			System.out.println("Number c is greater ");
		}
	    else {
		System.out.println("Number d is greater ");
	}
		J.close();
}
}