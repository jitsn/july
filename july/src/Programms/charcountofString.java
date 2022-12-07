package Programms;

public class charcountofString {
public static void main(String[] args) {
	
	String a="my name is abhijit_@A007";
	int count=0;
	for(int i=0;i<a.length();i++) {
		if(a.charAt(i)!=' ')
			count++;
		
	}
	System.out.println(count);
	
	
	
	
}
}

