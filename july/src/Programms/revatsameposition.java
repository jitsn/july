package Programms;

public class revatsameposition {
public static void main(String[] args) {
	String a="i am optimus prime";
	String[] substr=a.split(" ");
	String rev="";
	for(int i=0;i<substr.length;i++) {
		for(int j=substr[i].length()-1;j>=0;j--) {
			rev=rev+substr[i].charAt(j);
		}
		System.out.print(rev+" ");
		rev="";
	}
}
}
