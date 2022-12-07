package interface1;

public class defaultmethodimplemaentation implements DefaultMethodOfInterface{
	
	public void demo() {
		System.out.println("demo method from interface changed implementation");
	}
public static void main(String[] args) {
	defaultmethodimplemaentation g=new defaultmethodimplemaentation();
    g.demo();;
	DefaultMethodOfInterface k=new defaultmethodimplemaentation ();
	k.demo();//default method of interface can be override
}
}
