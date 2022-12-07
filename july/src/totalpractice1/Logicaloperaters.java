package totalpractice1;

public class Logicaloperaters {public static void main(String[] args) {
	int a=30;
	int b=20;
	int c=20;
	int d=30;
	
	System.out.println(a==d&&b==c);// true true=true
	System.out.println(a==d&&a==b);//true false=false
	System.out.println(a==b&&b==c);//false true=false
	System.out.println(a==b&&c==d);//false false=false
	
	System.out.println();
	System.out.println(a==d||b==c);//true true=true
	System.out.println(a>b||d<c);//true false=true
    System.out.println(c>b||d>c);//false true=true
    System.out.println(d==c||a==b);//false false=false
    
    System.out.println();
    System.out.println(a!=b);//false=true
    System.out.println(b!=c);//true=false

}

}
