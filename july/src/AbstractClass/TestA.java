package AbstractClass;

public class TestA extends A {

	public void demo() {
		System.out.println("incomplete method from abstract class");
	}
	
	public static void main(String[] args) {
		A G=new TestA();
		G.test();
		G.demo();
	}
}
