package Programms;

public class Palindrome {
public static void main(String[] args) {
	String a="123";
	String rev="";
	for(int i=a.length()-1;i>=0;i--) {
		rev=rev+a.charAt(i);
	}
	System.out.println(rev);
	if(a.equals(rev)) {
		System.out.println("the number is palindrome ");
		
	}
	else {
		System.out.println("the number is not palindrome");
	}
}
}
