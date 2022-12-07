package starpatternpractice;

public class callingmethod {
 public static long number() {
	for(long j=1;j<=100;j++) {
		System.out.println(j);
	}
	return 'j';
 }
 public char alphabets() {
	 for(char i='A';i<='Z';i++) {
		 System.out.println(i);
	 }
	return 'i';
			 }
 public void alphabets1() {
	 for(char i='z';i>='a';i--) {
		 System.out.println(i);
	 }
	 
 }
	public static void main(String[]args) {
		number();
		callingmethod z=new callingmethod();
		z.alphabets();
		z.alphabets1();
	}
	}
