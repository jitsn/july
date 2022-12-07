package constructors1;

public class constructor {
	int a ;
	int b;
	int m;
	String name;
	String velocity;
	
	constructor(){ // user define cons with  zero argument / parameter
		 a = 89;
		 b =90;
	}
	constructor(int c , int d){ // user define cons with  Argument / Parameter
		a=c;
		b=d;	
	}
	constructor(int c ,int d, int i){ // user define cons with  Argument / Parameter
		a=c;
		b=d;
		m=i;
	}
	constructor(String name,String Velocity){// user define cons with  Argument / Parameter
	name ="Hello";
	Velocity ="Testing";
}
	public void addition() {
		System.out.println(m+a+b);
	}
	public void St() {
		System.out.println(name);
		System.out.println(velocity);
	}
	public static void main(String[] args) {
		
		constructor x = new constructor();
		x.addition();
		x.St();
		
		constructor y = new constructor(70,80,90);
		y.addition();
		
		constructor z = new constructor(70,80);
		z.addition();
		
	}
}

