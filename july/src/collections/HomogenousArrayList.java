package collections;

import java.util.ArrayList;

public class HomogenousArrayList {
	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(123);
		list.add(55664);
		list.add(3546567);
		list.add(678789);
		list.add(4534356);
		list.add(5565656);
		
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
