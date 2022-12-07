package constructor;

public class Const {

int a;
int b;
int c,h;
Const(){
	a=10;
	b=20;
	c=a+b;
	System.out.println(c);
}
Const(int d,int e){
	b=d;
	b=e;
	h=e+d;
	System.out.println(h);
}
public static void main(String[] args) {
	Const G=new Const();
	
	Const D=new Const(34,89);
}
}
