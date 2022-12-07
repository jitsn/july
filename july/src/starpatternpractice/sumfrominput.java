package starpatternpractice;

import java.util.Scanner;

public class sumfrominput {
	public static void main(String[] args) {
		
		int a,b;
		char c;
		do{
			System.out.println("enter value1");
			Scanner ABC=new Scanner(System.in);
			 a=ABC.nextInt();
			 System.out.println("your entered value= "+a);
			
			 System.out.println("enter another value2");
			 
			 b=ABC.nextInt();
			System.out.println("your entered value= "+b);
			
			System.out.println("the sum of your entered values is= "+(a+b));
			System.out.println("do you wish to continue operation");
			
			 c=ABC.next().charAt(0);
		}
		while(c=='Y'|| c=='y');
		//System.out.println("addition= "+(a+b));
		}
}
