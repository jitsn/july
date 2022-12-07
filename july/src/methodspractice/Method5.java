package methodspractice;

public class Method5 {
static void ABC() {      //static method without argument
	byte a=20,b=10;
	System.out.println("The addition of a and b");
	System.out.println("The ans:"+(a+b));
	}

void  ABC(int c,int d) {  //Non static method with argument
	int e=c-d;
	System.out.println("The subtraction of c and d");
	System.out.println("The ans:"+e);
}

public long  ABC(long i,long j,long k ) { //Non static method return type with argument
long s=i*j*k;
System.out.println("The ans of multiplication of i,j,k is="+s);
return s;
}

public static void main(String[]args) {  //calling of static & non static methods in main methods
	 ABC();
	
	Method5 z=new Method5();
	z. ABC(40,30);
	z. ABC(2, 3, 4);
	}
}
