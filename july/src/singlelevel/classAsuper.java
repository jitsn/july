package singlelevel;

public class classAsuper {
int a=29;
public  void test() {
	int a=34;
	System.out.println("test method from super classAsuper");
	System.out.println(a+" =ans is 34 local var from test method");
	System.out.println((this.a)+" =ans is 29 global variable used in test method");
}
 void demo() {
	int a=45;
	System.out.println(" =demo method from super classAsuper");
	System.out.println(a+ " =ans 45 local variable from demo method");
	System.out.println(this.a+" =ans is 29 global variable used in demo method");
}
}
