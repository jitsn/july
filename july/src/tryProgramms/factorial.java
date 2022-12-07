package tryProgramms;

public class factorial {
public static void main(String[] args) {
	int num=10;
	long fac=1;
	for(int i=1;i<=num;i++) {
		fac=fac*i;
	}

System.out.println("factorial= "+ fac);
}
}
