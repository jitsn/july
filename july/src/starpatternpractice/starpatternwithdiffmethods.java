package starpatternpractice;

public class starpatternwithdiffmethods {
public static void star() {
	int space=4;
	int star=1;
	for(int i=1;i<=9;i++) {
		for(int j=1;j<=space;j++) {
			System.out.print(" ");}
		for(int k=1;k<=star;k++) {
		System.out.print("*");}
		if(i<=4) {
			space--;
			star=star+2;}
		else {
			space++;
			star=star-2;
		}
		System.out.println();
	}

}
public static void main(String[] args) {
	
	star();
}
}
