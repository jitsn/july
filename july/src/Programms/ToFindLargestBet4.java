package Programms;

public class ToFindLargestBet4 {
public static void main(String[] args) {
	int a=70;
	int b=69;
	int c=68;
	int d=67;
	if(a>b&&a>c&&a>d) {
		System.out.println("a is greater");
	}
	else if(b>a&&b>c&&b>d) {
		System.out.println("b is greater");
	}
	else if(c>a&&c>b&&c>d) {
		System.out.println("c is greater");
	}
	else {
		System.out.println("d is greater");
	}
}
}
