package automation1;

public class ConsOverload {
	int t,y,i,o,n;
	int g;
	int z;
	char s,q,m,x;
	String abhi="bye";
	String jit="hi";
	
	ConsOverload (){
		 y=23;
		 t=25364;
		 System.out.println("addition of y and t = " + (y+t));
	}
	ConsOverload (int a){
		y=67;
		t=89;
		a=y+t;
	    System.out.println("addition of y and t = " + (a));

	}
	ConsOverload (int b,int d){
		g=b;
		z=d;
		System.out.println("multiplication of b&d = " + (g*z));
	}
	ConsOverload (char e,char f){
		s=e;
		q=f;
		System.out.println("value of e = " + e);
		System.out.println("value of e = " + f);
	}
	ConsOverload (String p,String v){
		abhi=p;
		jit=v;
		
	}
	public void bats() {
		System.out.println("output of method bats= " + (y+t));
		System.out.println("output of method bats= " + abhi);
		System.out.println("output of method bats= " + jit);
	}
	public static void main(String[] args) {
		System.out.println("output of zero argument constructor- ");
		
		ConsOverload K=new ConsOverload ();
		
		System.out.println("output of int argument constructor- ");
		
		ConsOverload L=new ConsOverload (13);
		
		System.out.println("output of int b,int d argument constructor- ");
		
		ConsOverload R=new ConsOverload (45,78);
		
		System.out.println("output of char e, char f argument constructor- ");
		
		ConsOverload S=new ConsOverload ('%','$');
		
		System.out.println("output of String p,String v argument constructor- ");
		
		ConsOverload H=new ConsOverload ("hello","world");
		H.bats();
		
		System.out.println("output of bats metod- ");
		
		ConsOverload Y=new ConsOverload ();
		Y.bats();
	}
}
