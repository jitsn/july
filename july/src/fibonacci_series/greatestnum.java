package fibonacci_series;

import java.util.Scanner;

public class greatestnum {
public static void main(String[] args) {
	Scanner G=new Scanner(System.in);
	System.out.println("Enter value of a: ");
	int a=G.nextInt();
	System.out.println("your entered value for a: "+a);
	System.out.println("Enter value of b: ");
	int b=G.nextInt();
	System.out.println("your entered value for b: "+b);
	if(a>b) {
		System.out.println("The number a is greater");
	}
	else {
		System.out.println("number b is greater");
	}
	G.close();
}
}
