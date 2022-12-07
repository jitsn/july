package array;

public class staticarray {
private static int a[]={1,3,4,2,12,112,1122,111};//array with int data type
public static String b[]= {"1","A","33","%","b"};//array with String data type
protected  byte c[]= {11,22,-128,120,127,34};//array with byte
static short d[]= {1,344,6675,5443,4555,3333};//array with short
boolean e[]= {true,false};//array with boolean
char f[]= {'a','$','1'};//array with char

public static  void main(String[] args) {//main method
	System.out.println(a[1]);//array use
	System.out.println(b[3]);
	System.out.println(d[4]);	
	staticarray H=new staticarray();//object for non static array data type

	System.out.println(H.e[0]);//array use
	System.out.println(H.e[1]);
	System.out.println(H.c[5]);
	System.out.println(H.f[1]);
}
	}
