package constructors1;

public class constructoroverload {

int a;
String ABC;
constructoroverload(int c,int d){
    a=c;
	a=d;
}
constructoroverload(int o,String u){
	ABC=u;
	a=o;
}
public void abhi() {
	System.out.println(a+" jit");
	System.out.println(ABC);
}

public static void main(String[] args) {
	constructoroverload m=new constructoroverload(8,"abhijit");
	m.abhi();
	
}
}
