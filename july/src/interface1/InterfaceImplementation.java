package interface1;

public class InterfaceImplementation implements staticmethodofinterface{
	
	public static void test() {
		System.out.println("test method from interface changed implementation");
	}
public static void main(String[] args) {
	staticmethodofinterface.test();
	//static method of interface can be called with interface name
	
}
}
