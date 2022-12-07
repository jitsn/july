package multiplelevel;

public class classAforB {
int a=67;
public  void asdf() {
	int a=90;
	System.out.println("asdf method from classAforB");
	System.out.println(a+" =local variable from method asdf classAforB");
	System.out.println((this.a)+" global variable from classAforB in method asdf");
}
}
