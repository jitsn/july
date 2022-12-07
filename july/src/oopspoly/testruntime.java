package oopspoly;

public class testruntime extends Runtime{
	public void demo() {
//same non static method from super class but we have changed implementation
//according to sub class specification
		System.out.println("demo method implementation changed");
	}
	public static void test() {//static method from runtime class
  System.out.println("test method from runtime class implementation change");
	}

	public static void main(String[] args) {//main method
		Runtime A=new testruntime();
	//superclass ref variable=new subclass();
		A.demo();//calling of demo method
		A.test();
		//from this we cant override static method
		
	}
}
