package automation1;

import java.util.Scanner;

public class avc {
	public static void main(String[] args) {
		int b,c,d,e;
		Scanner F=new Scanner(System.in);
		System.out.println("enter value of b: ");
	     b=F.nextInt();
	    System.out.println("enterd value for b = "+b);
			
			 System.out.println("enter value of c: ");
		 c=F.nextInt();
		System.out.println("enterd value for c = "+c);
			
			 System.out.println("enter value of d: ");
		 d=F.nextInt();
		System.out.println("enterd value for d = "+d);
		    System.out.println("ans ="+((b*b*b)+(c*c*c)+(d*d*d)) );
		    
		     if(
		        ((b*b*b)+(c*c*c)+(d*d*d))==153||
				((b*b*b)+(c*c*c)+(d*d*d))==2||
				((b*b*b)+(c*c*c)+(d*d*d))==3||
				((b*b*b)+(c*c*c)+(d*d*d))==4||
				((b*b*b)+(c*c*c)+(d*d*d))==5||
				((b*b*b)+(c*c*c)+(d*d*d))==6||
				((b*b*b)+(c*c*c)+(d*d*d))==7||
				((b*b*b)+(c*c*c)+(d*d*d))==8||
				((b*b*b)+(c*c*c)+(d*d*d))==9||
				((b*b*b)+(c*c*c)+(d*d*d))==153||
				((b*b*b)+(c*c*c)+(d*d*d))==370||
				((b*b*b)+(c*c*c)+(d*d*d))==371||
				((b*b*b)+(c*c*c)+(d*d*d))==407
				)
		     {
			System.out.println("the number is arm strong");
		}
		
		else {
			System.out.println("number is not armstrong");
		}
		
	}
}
	

