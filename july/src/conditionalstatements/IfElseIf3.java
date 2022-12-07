package conditionalstatements;

public class IfElseIf3 {
	public static void main(String[] args) {
	int age=18;
	if (age>19) {
	System.out.println("you can give driving test directly");
	}
	else if(age==18) {
	System.out.println("you can apply for test");
	}
	else {
		System.out.println("you cannot apply for driving test");
	}
}
}
