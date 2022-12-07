package tryProgramms;

public class charcountString {
public static void main(String[] args) {
	String a="i am abhijit ahhchsfs";
	int count=0;
	for(int i=0;i<=a.length()-1;i++) {
		System.out.print(a.charAt(i));
		
		count++;
	}
	System.out.println();
	System.out.println(count);
}
}
