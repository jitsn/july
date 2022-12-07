package Programms;

import java.util.Scanner;

public class Armstrongnumfor {
public static void main(String[] args) {
	int a=159;
	int b,c=0,l,k;
	k=a;
	for(int i=a;i>=0;i--) {
		b=a%10;
		c=(b*b*b)+c;
		a=a/10;
	}
	System.out.println("ans of c= "+c);
	if(k==a) {
		System.out.println("the number is armstrong");
	}
	else {
		System.out.println("the number is not armstrong");
	}
}
}
