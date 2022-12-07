package array;

import java.util.Arrays;

public class AscDesc {
public static void main(String[] args) {
	int a[]= {100,300,900,560,340,520,543,537,568};
	System.out.println("-----------to print aray values-------------");
	for(int i=0;i<=a.length-1;i++) {
		System.out.println(a[i]);
	}
	Arrays.sort(a);
	System.out.println("-------------ascending order------------");
	for(int i=0;i<=a.length-1;i++) {
		System.out.println(a[i]);
	}
	System.out.println("-------------descending order-------------");
	for(int i=a.length-1;i>=0;i--) {
		System.out.println(a[i]);
	}
}
}
