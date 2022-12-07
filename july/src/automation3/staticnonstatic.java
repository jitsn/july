package automation3;

public class staticnonstatic {
public static void abhi() {
	int a=10;
	int b=20;
	System.out.println("c="+(a+b));
}
public void jit() {
	int a=10;
	int b=20;
	System.out.println("c="+(a*b));
}
public static void main(String[] args) {
	abhi();
	staticnonstatic abhijit =new staticnonstatic();
	abhijit.jit();
}
}
