package strings;

import java.util.Locale;

public class STRINGMETHODS {
	public static void main(String[] args) {
System.out.println("----------------output of operator-----------------");		
//operator
String h="ABHIJIT_nale@1234.gamil,com ";
String a="abhijit_";
String b="abhijit";
String e=new String("abhijit");
String f=new String("nale");
String d="ABHIJIT";
String k=new String("Abhijit_nale");
                   //01234567891011
System.out.println(a==b);
System.out.println(a==e);
System.out.println(b==f);

//equals method of string and equalsignorecase method

System.out.println("----------------output of equals method-----------------");		

System.out.println(b.equals(d));
//compared value of b to value of d

System.out.println("----------------output of equalsignorecase method-----------------");		

System.out.println(b.equalsIgnoreCase(d));
//we ignored lowercase and uppercase of same data from variables b and d

System.out.println("----------------output of touppercase method-----------------");		

System.out.println(f);
//f string variable with lowercase data 
System.out.println(f.toUpperCase());
//converted lowercase data of f variable to uppercase data
System.out.println("----------------output of tolowerercase method-----------------");		
System.out.println(d);
System.out.println(d.toLowerCase());
//converted uppercase data of f variable to lowerclass data

System.out.println("----------------output of concat method-----------------");		
System.out.println(a.concat(f));
//to add f(nale) string in next to a(abhijit_)

System.out.println("----------------output of length method-----------------");		
System.out.println(h.length());
//to count number of characters in string data

System.out.println("----------------output of charat method-----------------");		
System.out.println(h.charAt(0));
System.out.println(h.charAt(26));
//to find index of perticular char in string data

System.out.println("----------------output of indexof method-----------------");		
System.out.println(h.indexOf("a"));
//suppose there are multiple "a" char in string data and 
//we have to find index number of first "a" char
//then we use indexof

System.out.println(h.lastIndexOf("a"));
//suppose there are multiple "a" char in string data and 
//we have to find index number of last "a" char
//then we use lastIndexOf

System.out.println("----------------output of substring(int beginindex) method-----------------");		
System.out.println(a.substring(4));
//it will create sub string from string from the indexnumber given in syntax
System.out.println(k.substring(4,12));
System.out.println("----------------output of trim method-----------------");		

}
}