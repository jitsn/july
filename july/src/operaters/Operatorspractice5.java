package operaters;

public class Operatorspractice5 

{public static void main(String[] args)
//&& operators
{System.out.println("&& operator:");
System.out.println((20<30)&& (30>20));//true true =true

System.out.println((30>40)&& (30>20));//false true =false

System.out.println((30<40)&& (30<20));//true false =false

System.out.println((30>40)&& (30<20));//false false=false

//or operators||
System.out.println("Or operator:");
System.out.println((40>30)|| (30>20));//true true =true

System.out.println((30>40)|| (30>20));//false true =true

System.out.println((30<40)|| (30<20));//true false =true

System.out.println((30>40)|| (30<20));//false false=false

//not operator (!(==))
System.out.println("Not operator:");
System.out.println(!(40==40));//true  =false

System.out.println(!(30==40));//false =true

}
}
