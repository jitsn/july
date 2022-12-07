package operaters;

public class Operaterspractice2 
{public static void main(String[] args) 
{float a=20,b=20,c=30,d=40;
// Arithmetic operators

//Addition and subtraction

System.out.println("The value of a is:"+a+", The value of b is:"+b+", The value of c is:"+c+", The value of d is:"+d);
System.out.println("The sum of a+b is:"+(a+b)+"\nThe add. of a+c is:"+(a+c)+"\nThe sub. of a-b is:"+(a-b)+"\nThe sub.of a-c is:"+(a-c));

//Multiplication and division
System.out.println();
System.out.println("the mul.of d&c is:"+(d*c)+"\nThe div.of c&d is:"+(c/d)+"\nThe mul.of a&b is:"+(a*b)+"\nThe div.of a&b is:"+(a/b));

//module
System.out.println();
System.out.println("The module of a&c is:"+(c%a));

//Relational operators

//greater than and less than
System.out.println();
System.out.println("The answer is:"+(a<d)+"\nThe answer is: "+(b>c)+"\nThe answer is: "+(a<c)+"\nThe answer is: "+(c>a));

//(==) & (!=) operators

System.out.println();
System.out.println("The answer is:"+(a==b)+"\nThe answer is:"+(a==c)+"\nThe answer is:"+(a==d));
System.out.println();
System.out.println("The answer is:"+(a!=b)+"\nThe answer is:"+(b!=a)+"\nThe answer is:"+(a!=c)+"\nThe answer is:"+(a!=d));

//Increase and Decrease operators

//pre & post increment
System.out.println();
System.out.println("The answer is:"+(a++)+"\nThe value of a is:"+(a)+"\nThe answer is:"+(++a)+"\nThe value of a is:"+(a));
System.out.println();

//pre & post Decrement

System.out.println("The answer is:"+(a--)+"\nThe value of a is:"+(a)+"\nThe answer is:"+(--a));
}
}
