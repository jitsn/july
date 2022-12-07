package tryProgramms;

import java.util.Arrays;

public class arrayascending {
public static void main(String[] args) {
	int a[]= {12,23,45,67,88,99,65,33,66};
	for(int i=0;i<=a.length-1;i++) {
		System.out.print(a[i]+" ");
	}
	Arrays.sort(a);
	System.out.println();
	for(int i=0;i<=a.length-1;i++) {
		System.out.print(a[i]+" ");
	}
	System.out.println();
	for(int i=a.length-1;i>=0;i--) {
		System.out.print(a[i]+" ");
	}
}
}
