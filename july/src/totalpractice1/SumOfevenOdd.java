package totalpractice1;

public class SumOfevenOdd {
	public static void main(String[] args) {
		int a=0,b=0;
		
for(int i=1;i<=30;i++) {
	if(i%2==1) {
		System.out.println(i+" = odd num");
		a=a+i;
	}
	else if(i%2==0){
		System.out.println(i+" = even num");
		b=b+i;
	}
	
}
System.out.println("print sum of odd numbers="+a);
System.out.println("print sum of even numbers="+b);



}
}