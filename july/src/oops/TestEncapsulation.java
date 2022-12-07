package oops;
             //sub class    extends   //super class
public class TestEncapsulation  extends encapsulation{
public static void main(String[] args) {//main method
	encapsulation G=new encapsulation();//object creation of zero argument const
	
	G.test();
	
	TestEncapsulation H=new TestEncapsulation();//object creation of sub class
	H.test();
	
encapsulation Z=new encapsulation(90,80);//object creation of with orgument cons
	Z.test();
}
}
