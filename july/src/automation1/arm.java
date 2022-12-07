package automation1;

import java.util.Scanner;

public class arm {
public static void main(String[] args) {
	Scanner F=new Scanner(System.in);
	System.out.println("Enter value for a: ");
	int a=F.nextInt();
	int b;
    int c=0;
    int n;
    int f=a;
   
	
	while(a>0) {//153>0,15.3>0,
		b=a%10;//3,5,1
		c=c+(b*b*b);//27,152,153
		a=a/10;//15.3,1,0
	}
	System.out.println("value of c is ="+c);
	if(f==c) {
		System.out.println("the number is armstrong");
	}
	else {
		System.out.println("the number is not armstrong");
	}
}
}
