package casting;

public class son extends father {
	static int a=67;
	int b=78;
public  void bike()
{
	System.out.println("sons bike");
}

public static void main(String[] args) {
System.out.println(a);
son A=new son();
System.out.println(A.b);
	father L=new son();//object of subclass created with reference of super class 
	L.home();
	L.car();
	//L.bike(); performed up casting for that performed inheritance
	//only inherited properties are eligible for upcasting

}
}
