package String;

import java.util.Scanner;

public class scanrev {
	public static void main(String[] args) {
		Scanner F=new Scanner(System.in);
		System.out.println("enter your string value: ");
	String a=F.nextLine();
	char rev;
	for(int i=a.length()-1;i>=0;i--) {
		rev=a.charAt(i);
		System.out.print(rev);

	}
	}
}