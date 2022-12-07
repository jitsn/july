package fibonacci_series;
import java.util.Scanner;

public class Armstrongforloop {
	
	
	public static void main(String[] args) {
		
		int b=0;
		int c;

		Scanner D=new Scanner(System.in);
		System.out.println("Enter value: ");
		int a=D.nextInt();
		int d=a;
		for(int i=a;i>0;i--) {
			c=a%10;
			b=b+(c*c*c);
			a=a/10;
		}
			System.out.println("The value of b: "+b);
			if(d==b) {
				System.out.println("The number is armstrong");
			}
			else {
				System.out.println("Number is not armstrong");
			}
			D.close();
	}
	

}
