package array;

public class Swapping {
public static void main(String[] args) {
	int a[]= {12,3,4,2,2,11233,334,442,11,34,1144,566,33};
	
	for(int i=0;i<=a.length-1;i++) {
		System.out.print(a[i]+" ");
	}
	for(int i=0;i<=a.length/2;i++) {
		int z;
		z=a[i];
		a[i]=a[(a.length-1)-i];
		a[(a.length-1)-i]=z;
	}
	System.out.println();
	System.out.println(a[4]);
	for(int i=0;i<=a.length-1;i++) {
		System.out.print(a[i]+" ");
	}
}
}
