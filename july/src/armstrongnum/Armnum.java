package armstrongnum;
import java.util.Scanner;
public class Armnum {
	
	public static void main(String[] args){
		int n,h=0,k,d;
	
		System.out.println("enter the value");
		Scanner r=new Scanner(System.in);
	    n=r.nextInt();
		d=n;
		while(n>0){
		k=n%10;
		h=(k*k*k)+h;
		n=n/10;
		}
		if(d==h){
		System.out.println("the number is armstrong");
		}
		else{
		System.out.println("number is not armstrong");
		}
		}

}
