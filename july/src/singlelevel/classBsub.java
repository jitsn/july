package singlelevel;

public class classBsub extends classAsuper {
int a=56;
	public  void war() {
		int a=89;
		System.out.println("war method from classBsub");
		System.out.println(a+" =local var from war method");
		System.out.println((this.a)+" =ans is 56 global var from classBsub");//ans=56
		System.out.println((super.a)+" =a is from classAsuper and that is 29");
	}
	public static void main(String[] args) {
		classBsub ABC=new classBsub();
		//ABC.test();
		//ABC.demo();
		ABC.war();
	}
}
