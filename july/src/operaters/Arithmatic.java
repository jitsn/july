package operaters;

public class Arithmatic 
{public static void main(String[] args) 
{byte a=-126, b=122;

//Arithmetic operators

//addition
System.out.println("The sum of a and b is:"+(a+b));
//subtraction 
System.out.println("The sub of a and b is:"+(a-b));
//multiplication
System.out.println("The multiplication of a and b is:"+(a*b));
//devision
System.out.println("The devision of a and b is:"+(a/b));
//module
System.out.println("value of a%b is:"+(a%b));

//Relational operators
System.out.println();
//Greater than operator
System.out.println(b>a);
//less than operator
System.out.println(b<a);
//The value of a and b
System.out.println("The vale of a is:"+ a +" And the value of b is:"+ b);
//== operator
System.out.println(a==b);
//! operator
System.out.println(a!=b);
System.out.println();
//Increase and Decrease operators
//PreIncrease and pre decrease
System.out.println(++a);
System.out.println(a);
System.out.println(--a);
//post increase and post decrease
System.out.println();
System.out.println(b++);
System.out.println(b);
System.out.println(b++);
System.out.println(b);
System.out.println(b--);
System.out.println(b);
}

}
