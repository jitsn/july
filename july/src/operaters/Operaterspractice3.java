package operaters;

public class Operaterspractice3 
{ public static void main(String[] args) 
{double a=134578,b=134567,c=123456789,d=123456778;
//Arithmetic operators

//Addition and subtraction
System.out.println("The value of a is:"+a+"\nThe value of b is:"+b);
System.out.println("The sum of a&b is:"+(a+b)+"\nThe sub of a&b is:"+(a-b)+"\nThe sub of a&b is:"+(b-a));
//Multiplication and division
System.out.println("Multiplication and division:");
System.out.println("The multiplication of a&b is:"+(a*b)+"\nThe division of a&b is:"+(a/b));
//module
System.out.println("module:");
System.out.println("the remainder of a&b is:"+(a%b));
//Relational operators

//greater than and less than
System.out.println("greater than and less than:");
System.out.println(a>b);
System.out.println(a<b);
//(==) & (!=) operators
System.out.println("(==) & (!=) operators:");
System.out.println((a==b)+"\n"+(c==d)+"\n"+(a!=b)+"\n"+(c!=d));
//Increase and Decrease operators

//pre & post increment
System.out.println("pre & post increment:");
System.out.println("\nthe value of pre increament is:"+(++a)+("\nthe value of d is:"+(d))+"\nthe value of pre increament is:"+(d++)+"\nthe value of a is:"+(a)+"\nthe value of d is:"+(d));



//pre & post Decrement
System.out.println("pre & post Decrement:");
System.out.println("\nthe value of pre Decrement is:"+(--a)+("\nthe value of d is:"+(d))+"\nthe value of pre Decrement is:"+(d--)+"\nthe value of a is:"+(a)+"\nthe value of d is:"+(d));

}
}
