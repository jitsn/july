package strings;

public class ABC {
public static void main(String[] args) {
	String a="abhijit";
	String b="ABHIJIT";
	String f="abhijit";

	String c="nale";
	String d=new String("abhijit");
	String e=new String("ABHIJIT");
	System.out.println(a);
	System.out.println(b);
	System.out.println(a==f);
	System.out.println(a==b);
	System.out.println(a==c);
	System.out.println(a==d);
	System.out.println(d==e);
}
}
