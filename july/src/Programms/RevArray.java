package Programms;

public class RevArray {
	public static void main(String[] args) {
		
		String a[]= {"12","3","45","6","78","4","33"};
		String rev []= {""};
		for(int i=0;i<=a.length-1;i++) {
			System.out.print(a[i]+" ");
			
		}
		System.out.println();
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
		
	}
}
