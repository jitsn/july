package tryProgramms;

public class revatsameposition {
public static void main(String[] args) {
	String a="i am abhijit";
	String[] sub=a.split(" ");
	String rev="";
	for(int i=0;i<=sub.length-1;i++) {
		for(int j=sub[i].length()-1;j>=0;j--) {
			rev=rev+sub[i].charAt(j);
		}
		System.out.print(rev+" ");
		rev="";
	}
}
}
