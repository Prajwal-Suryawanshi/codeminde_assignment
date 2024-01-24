package Collection_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayList_test {


	public static void main(String []args) {
		List<Integer> arr=new ArrayList<Integer>();
		
		//add function in array list
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);




		//get function in array list
		System.out.println("value obtain form get func "+arr.get(2));
		
		//add function double parameter 
		arr.add(2, 223);
		System.out.println(arr);
		
		//set function double parameter 
		arr.set(2, 3);
		System.out.println(arr);
		
		//remove function single parameter
		arr.remove(2);
		System.out.println(arr);
		
		//size function
		System.out.println(arr.size());
		
		//sort array list
		Collections.sort(arr);
		System.out.println(arr);
		
		//Array.asList()
		arr=Arrays.asList(13,453,27);
		System.out.println(arr);
	}
}
