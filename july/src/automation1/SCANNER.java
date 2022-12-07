package automation1;

import java.util.Scanner;

public class SCANNER {
	
public static void main(String[] args) {
	
	Scanner D=new Scanner(System.in);
	
	System.out.println("Enter value for A =");
	
	int A=D.nextInt();
	
	System.out.println("your enterd value for A is: "+A);
	
	System.out.println("Enter value for B =");
	
	int B=D.nextInt();
	
	System.out.println("your enterd value for B is: "+B);
	
	System.out.println("Enter value for C=");
	
	int C=D.nextInt();
	
	System.out.println("your enterd value for C is: "+ C);
	
	System.out.println("sum of A,B,C =" +(A+B+C));
	
	
}
}
