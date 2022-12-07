package Programms;

import java.util.Scanner;

public class LeapYear {
public static void main(String[] args) {
	Scanner H=new Scanner(System.in);
	System.out.println("Enter year: ");
	int year=H.nextInt();
	if(year%4==0&&(year%100!=0||year%400==0)) {
		System.out.println("your entered year is leap");
	}
	else {
		System.out.println("your entered year is not leap");
	}
}
}
