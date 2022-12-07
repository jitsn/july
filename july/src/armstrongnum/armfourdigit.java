package armstrongnum;
import java.util.Scanner;

public class armfourdigit {
	public static void main(String[] args){
		int n,d=0,h,k;
		System.out.println("enter value");
		Scanner ABC=new Scanner(System.in);
		 n=ABC.nextInt();
         k=n;
		while(n>0){
		h=n%10;
		d=(h*h*h*h)+d;
		n=n/10;
		}
		if(k==d){
		System.out.println("The entered number is armstrong");
		}
		else
		{System.out.println("The entered number is not armstrong");
			
		}
}
}