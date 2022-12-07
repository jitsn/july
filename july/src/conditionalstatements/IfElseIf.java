package conditionalstatements;

public class IfElseIf {
	public static void main(String[] args) 
	{
		//If else if
	int marks=59;
	
	if(marks<=40) {
		System.out.println("student is passed");
		}
	else if(marks<=50 && marks<60) {
		System.out.println("student passed with second class");
		}
	else if(marks<=60) {
		System.out.println("student passed with first class");
		}
	else if (marks>=70) {
		System.out.println("student is passed with distinction");
		}
	else {
		System.out.println("student is fail");
		}

}
}
