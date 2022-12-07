package automation1;

public class globalvarprac {
int data=50;//global variable non static or instance variable

static int m=100;//static global variable or class variable

void method()//non static method
{
	int n=150;// local variable declaration and initialization
	System.out.println(n);// local variable usage
}
public static void main(String[] args) {//main method
	globalvarprac V =new globalvarprac();// class object to call non static elements
	System.out.println(V.data);//call for instance variable
	System.out.println(m);//call for class variable
	System.out.println(V.m);//call for class variable
	V.method();//call for non static method
}
}
