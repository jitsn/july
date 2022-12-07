package generalization;

public class SubClass1 extends SuperClass {
	 public void car() {
			System.out.println("younger son can use fathers car"); 
		 }
		 public void mobile() {
			System.out.println("younger son can use mom's mobile");
		 }
		 public static void main(String[] args) {
			 SubClass1 J=new SubClass1();
			 J.car();
			 J.mobile();
		}
}
