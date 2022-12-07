package multiplewithinterface;

public class classA implements superC {
	public void dfgh() {
		System.out.println("dfgh method from superB interface");
	}
	public void treat() {
		System.out.println("treat method from superC interface");
	}
	
	public static void main(String[] args) {
		classA ABC=new classA();
		ABC.dfgh();
		ABC.treat();
		superA.rest();
	}
}
