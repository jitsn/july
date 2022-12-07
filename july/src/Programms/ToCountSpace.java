package Programms;

public class ToCountSpace {
public static void main(String[] args) {
	String a="i am optimus prime from space";
	int count=0;
	for(int i=0;i<a.length();i++) {
		char b=a.charAt(i);
		if(b==' ')
			count++;
	}
	System.out.println(count);
}
}
