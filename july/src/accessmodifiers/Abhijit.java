package accessmodifiers;

public class Abhijit {
	
		//Types of access modifiers or specifiers
		int a=10;//scope remains only for that perticular package
		public int b=20;//scope remains throughout the project
		private int c=30;//scope remains only for class 
		protected int d=40;//scope remains only for that perticular package but


		public static void main(String[] args){

		Abhijit v=new Abhijit();
		System.out.println(" ans1 \n" + (v.a)+" \n ans2 \n" + (v.b)+" \n ans3 \n"+ (v.c)+" \n ans4 \n"+ (v.d));
		}
		}
