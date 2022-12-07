package Programms;

import java.util.Scanner;

public class primenumber {
public static void main(String[] args) {
	int count=0;
	System.out.println("enter number: ");
	Scanner F=new Scanner(System.in);
	int a=F.nextInt();
	for(int i=1;i<=a;i++) {
		if(a%i==0) {
			count++;
		}
	}
		if(count==2) {
			System.out.println("the number is prime");
		}
		else {
			System.out.println("the number is not prime");
		}
	
}
}
