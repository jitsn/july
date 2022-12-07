package tryProgramms;

public class b {
public static void main(String[] args) {
	int a=157;
	int d,c=0,k=a;
	
	
	while(a>0) {
		d=a%10;
		c=c+(d*d*d);
		a=a/10;
	}
	System.out.println(c);
	if(k==c) {
		System.out.println("the number is armstrong");
	}
	else {
		System.out.println("the number is not armstrong");
	}
}
}
