package array;

public class practice {
public static void main(String[] args) {
	int a[]= {30,50,60,54,65,78,29};
	for(int i=0;i<=a.length-1;i++) {
		System.out.print(a[i]+" ");
	}
	System.out.println();
	for (int i=0;i<=(a.length/2);i++) {
		int z;
		z=a[i];
		a[i]=a[(a.length-1)-i];
		a[(a.length-1)-i]=z;

	}
	System.out.println();
	for(int i=0;i<=a.length-1;i++) {
		System.out.print(a[i]+" ");
	}
}
}
