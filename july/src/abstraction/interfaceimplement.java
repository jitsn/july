package abstraction;

public class interfaceimplement implements InterfaceAbstraction {
	public  void test() {
		System.out.println("test method from interface provided implementation");
	}
	public static void main(String[] args) {
		InterfaceAbstraction v=new interfaceimplement();
		v.test();//method from interface
		interfaceimplement g=new interfaceimplement();
		g.test();//method from implementation class
	}
}
