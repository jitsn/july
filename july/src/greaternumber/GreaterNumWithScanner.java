package greaternumber;

import java.util.Scanner;

public class GreaterNumWithScanner {
	public static void main(String[] args) {
		int value1,value2,value3,value4;
			Scanner ABC=new Scanner(System.in);
			
			System.out.println("enter 1 value");
			System.out.println();
			 value1=ABC.nextInt();
			System.out.println();
			System.out.println("enter 2 value");
			value2=ABC.nextInt();
			System.out.println();
		    System.out.println("enter 3 value");
			 value3=ABC.nextInt();
			System.out.println();
			System.out.println("enter 4 value");
			 value4=ABC.nextInt();
			
			if(value1>value2  && value1>value3 && value1>value4) {
				System.out.println("value1 is gerater= "+value1);
			}
			else if(value2>value1  && value2>value3 && value2>value4) {
				System.out.println("value2 is greater= "+value2);
			}
			else if(value3>value1  && value3>value2 && value3>value4) {
				System.out.println("value3 is greater= "+value3);
			}
			else  {
				System.out.println("value4 is greater= "+value4);
			}
		}
		
}
