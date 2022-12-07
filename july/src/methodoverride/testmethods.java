package methodoverride;

public class testmethods extends methods {
	public static void test() {
		System.out.println("test static method from testmethods class");
	}

	public void demo() {
		System.out.println("demo non static method from testmethods class");
	}
	
	public static void main(String[] args) {
		testmethods H=new testmethods();//object creation of subclass

		methods k=new testmethods();
		//super class referance to create object of subclass
		H.test();
		k.test();
		k.demo();//non static method override 
		H.demo();//non static method override 
	}
}
