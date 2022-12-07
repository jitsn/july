package automation1;

public class constructor {

constructor(){//constructor with zero argument
	//constructor name should be same as class name
	int a; //a variable declared in constructor
	int b;//b variable declared in constructor
	int c;// c variable declared in constructor
	a=23;// initialization of variable a with the help of constructor(means assigning value to variable a)
	b=34;// initialization of variable b with the help of constructor(means assigning value to variable b) 
	c=a+b;// initialization of variable c with the help of constructor(means assigning value to variable c) 
        //performed addition of a and b variable and stored value in variable c
	System.out.println(c);//to print output of c
}
public static void main(String[] args) {//main method
	constructor J=new constructor();
	//creating constructor object with class name this is compulsary to call output of constructor
	
	
}





}
