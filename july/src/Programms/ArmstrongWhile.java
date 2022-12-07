package Programms;

import java.util.Scanner;

public class ArmstrongWhile {
public static void main(String[] args) {
	Scanner H=new Scanner(System.in);
	System.out.println("Enter value: ");
	int a=H.nextInt();
	int c=0,b,k;
	k=a;
	
	while(a>0) {
		b=a%10;
		c=(b*b*b)+c;
		a=a/10;
	}
	System.out.println("ans of c: "+ c);
	if(k==c) {
		System.out.println("the number is armstrong");
	}
	else {
		System.out.println("number is not armstrong");
	}
}
}
