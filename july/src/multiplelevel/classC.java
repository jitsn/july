package multiplelevel;

public class classC extends classBforC {

	public void yuio() {
		System.out.println(" yuio method from classC");
	}
	public static void main(String[] args) {
		classBforC ACAD=new classBforC();
		ACAD.asdf();
		ACAD.ghjk();
		ACAD.wert();
		classC BCAD=new classC();
		BCAD.yuio();
	}
}
