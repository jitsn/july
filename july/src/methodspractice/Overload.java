package methodspractice;

public class Overload {
public static void alphabets() {
	String a="Hello there...";
	System.out.println(a);	
}
void alphabets1(char c) {
	System.out.println(c);
}




public static void main(String[] args) {
	alphabets();
	Overload P=new Overload();
	P.alphabets1('@');
}
}
