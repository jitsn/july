package oops;

public class encapsulation {//super class
private int a;//private variables scope inside class
private int b;//private variables scope inside class

encapsulation(){//zero argument constructor
	a=34;
	b=65;
}
encapsulation(int c,int d){//with argument constructor
	a=90;
	b=50;
}

public void test() {//non static method
	int c=a+b;//addition of a and b
	System.out.println(c);//use of variable c
}
}
