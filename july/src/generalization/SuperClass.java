package generalization;

public abstract class SuperClass {

    static void test() {
	System.out.println("complete static method from abstract class");
}
	
	void demo() {    
	System.out.println("non static complete method from abstract class");
	}
	abstract void car();
	abstract void mobile();
	
}
