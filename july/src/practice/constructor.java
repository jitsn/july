package practice;

public class constructor {
int c,b,r,h;
	constructor(){
		r=10;
	    h=56;
	}
	constructor(int a, int d){
		c=a;
		b=d;
		
	}
	public  void asm() {
		System.out.println(c+b);
		
		System.out.println(r+h);
	}
	public static void main(String[] args) {
		constructor L=new constructor ();
		L.asm();
		constructor J=new constructor(34,67);
		J.asm();
	}
}
