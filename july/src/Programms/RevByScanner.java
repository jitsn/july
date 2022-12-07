package Programms;

import java.util.Scanner;

public class RevByScanner {
	
	public static void main(String[] args) {
	
Scanner J=new Scanner(System.in);
System.out.println("Enter string value: ");
String a=J.nextLine();
String rev="";

for(int i=a.length()-1;i>=0;i--) {
	rev=rev+a.charAt(i);
}
System.out.println("your reversed String: ");
System.out.print(rev);




	}
}
