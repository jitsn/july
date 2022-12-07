package fibonacci_series;

public class Fibonacci {
public static void main(String[] args) {
	int a=0;
	int b=1;
	int c,d;
	for(int i=0;i<=10;i++) {
		c=a+b;//0+1=1,1+1=2,1+2=3,2+3=5,
		System.out.println(c);//1,2,3,5,
	a=b;//0=1,1=1,1=2,2=3
    b=c;//1=1,1=2,2=3,3=5
	}
}
}
