package multiplelevel;

public class classBforC extends classAforB {
int a=789;
	public  void ghjk() {
		int a=76;
		System.out.println("ghjk method from classBforC ");
	}
	public void wert() {
		System.out.println(" wert method from classBforC");
		System.out.println(this.a);
	}
	
	public static void main(String[] args) {
		classBforC CB=new classBforC();
		CB.asdf();
		CB.wert();
		CB.ghjk();
	}
}
