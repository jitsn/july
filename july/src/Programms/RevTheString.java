package Programms;

public class RevTheString {
	public static void main(String[] args) {
		
	
String a="i am a mechanical engineer";
String b="";
for(int i=a.length()-1;i>=0;i--) {
  b=b+a.charAt(i);

}
System.out.println(b);

System.out.println(b.indexOf("r"));
}
}