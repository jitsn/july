package abstrctclass;

public class concreate extends Abstract {

	public void name() {
		System.out.println("name method from abstract class completed in concreate class");
	}
	
	public static void main(String[] args) {
		concreate VBN=new concreate();
		VBN.name();
		System.out.println(VBN.a);
		System.out.println(Abstract.b);
	}
	
	
	
}
