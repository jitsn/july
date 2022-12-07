package assignments;


public class assignmentB{
	int a=10;
	static int b=20;

	public void demo() {
		
		System.out.println(this.a);
		System.out.println(b);
	}
	
	
	public static void main(String[] args) {

		assignmentB BA=new assignmentB();
		BA.demo();
		System.out.println();
		
		
	}
}
