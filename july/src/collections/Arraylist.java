package collections;

import java.util.ArrayList;

public class Arraylist {
	public static void main(String[] args) {
	
	ArrayList list=new ArrayList();
	
	list.add(123);
	list.add('#');
	list.add("String");
	list.add(true);
	list.add(56.90f);
	list.add(56.99999999999999999999999999999);
	
	int size = list.size();
	
	for(int i=0;i<=size-1;i++) {
		System.out.println(list.get(i));
	}
	System.out.println("*******************************************");
	list.remove(3);
	int size1 = list.size();
	for(int i=0;i<=size1-1;i++) {
		System.out.println(list.get(i));
	}
	

}
}