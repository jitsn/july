package practice;

public class mockpractice2 {
	public static void main(String[] args) {
		int a=9,b=10,c=58,d=79;
		
		if(a>b) {
			if(a>c) {
				if(a>d) {
					System.out.println("a num is greater= "+a);
				}
				else {
					System.out.println("d is greater= "+d);
				}}
			else {
				if(c>d) {
					System.out.println("c is greater nub= "+c);
				}
				else {
					System.out.println(" d is greater num= "+d);
				}}}
		else {
			if(b>c){
				if(b>d) {
					System.out.println("b is grester= "+b);
				}
				else {
					System.out.println("d is greater= "+d);
				}
			}
			else {
			System.out.println(" c is greater= "+c);
		}}
}
}