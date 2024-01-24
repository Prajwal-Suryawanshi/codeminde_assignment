package Collection_test;

import java.util.ArrayList;
import java.util.Iterator;

public class Itreator_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr=new ArrayList();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		
		Iterator<Integer> it=arr.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
