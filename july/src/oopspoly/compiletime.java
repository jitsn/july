package oopspoly;

public class compiletime {
	int a=34;
	int l;
	long f;
	int b=67;
	long c=456666666L;
	long d=645765435L;
public void test() {
	System.out.println("test method without argument");
}
public void test(int a,int b) {
	a=66;
	b=45;
	l=a+b;
	System.out.println(l);
}
public void test(long a,long b) {
	c=a;
	d=b;
	f=a+b;
	System.out.println(f);
}
public static void main(String[] args) {
	compiletime J=new compiletime();
	J.test();
	J.test(2,4);
	J.test(2L,9L);
}
}
