package String;

public class rev {
public static void main(String[] args) {
	String a="i am an engineer";
	String rev="";
	for(int i=a.length()-1;i>=0;i--) {
		rev=rev+a.charAt(i);
	}
	System.out.println(rev);
	
}
}
