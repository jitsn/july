package methodspractice;

public class method4 {
public static void addition(int a,int b) {
	int c=a+b;
	System.out.println("the ans is="+c);
}
public void multiplication(int x,int y) {
	int z=x*y;
	System.out.println("the ans of multiplication is="+z);
}
public  void division(int k,int L) {
	int q = k/L;
	System.out.println("the ans of division is="+q);
}
public static void main(String[] args) {
	addition(60,70);
	method4 p=new method4();
	p.multiplication(5,4);
	addition(6,4);
	method4 g=new method4();
	g.division(40,20);
	g.division(3,2);
}
}
