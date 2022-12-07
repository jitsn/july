package generalization;

public class SubClass extends SuperClass {
	 public void car() {
		System.out.println("elder son can use fathers car"); 
	 }
	 public void mobile() {
		System.out.println("elder son can use mom's mobile");
	 }
	 public static void main(String[] args) {
		 SubClass G=new SubClass();
		 G.car();
		 G.mobile();
	}
}
