package abstraction;

public class TestAbstract extends AbstractClass {
	public void demo() {
		System.out.println("demo method TestAbstract class");
	}
	
	 public static void test() {
		 System.out.println("test metod from AbstractClass implementation change");
	 }
	
	public static void main(String[] args) {
		AbstractClass F=new TestAbstract();
		F.demo();
		F.test();//static method can not be override
	}
}
