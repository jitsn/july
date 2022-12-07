package me1;

import java.util.Scanner;

public class practice {
public static void main(String[] args) {
	int a,count=0;
	System.out.println("enter number: ");
//prime number means the number which is divisible by itself
//otherwise it is divisible by 1 the remainder must be 0
	Scanner S=new Scanner(System.in);
	a=S.nextInt();
	for(int i=1;i<=a;i++) {
		if(a%i==0) {
			count++;
		}
	}
	if(count==2) {//first count is the number is divisible by himself
		//second count is the number is divisible by 1
		System.out.println("the number is prime number");
	}
	else {
		System.out.println("the number is not prime");
	}
}
}