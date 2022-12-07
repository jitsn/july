package tryProgramms;

public class largestnum {
public static void main(String[] args) {
	int a=112;
	int b=342;
	int c=2334;
	int d=2766;
	
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
