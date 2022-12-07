package tryProgramms;

public class a {
	public static void main(String[] args) {
		
	
int a=153;
int b=0;
int c=a;
int d;

for(int i=a;i>=a;i--) {
	d=a%10;
	b=(d*d*d)+b;
	a=a/10;
}
System.out.println(b);
if (c==b) {
	System.out.println("the number is armstrong");
	
}
else {
	System.out.println("the number is not armstrong");
}
}
}