package conditionalstatements;

public class Ifelseif4 {
public static void main(String[] args) {
	String projectdomain="telecom";
	if (projectdomain=="healthcare") {
	System.out.println("medical related work");
}
	else if(projectdomain=="telecom") {
		System.out.println("work related to communication");
	}
	else if(projectdomain=="bank") {
		System.out.println("bank related work");
	}
	else if(projectdomain=="mechanical") {
		System.out.println("mechanical related work");
}
	else {System.out.println("random project related work");
}
}
}