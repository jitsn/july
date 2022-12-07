package armstrongnum;
import java.util.Scanner;
public class Armforloop3digit {
	
public static void main(String[] args) {
	
	Scanner ABC=new Scanner(System.in);
	int h=0,c,g;
	System.out.println("enter value");
	 int f=ABC.nextInt();
	c=f;
	
	
  for(int i=f;i>=0;i--) {
	g=f%10;
		h=(g*g*g)+h;
		f=f/10;
		
	}
	if(h==c) {
	System.out.println("The number is armstrong");	
		
	}
	else {
		System.out.println("The number is not armstrong");
		
	}
	
	
	
	
	
	
	
}
}
