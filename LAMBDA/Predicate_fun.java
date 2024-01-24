package advance_java.LAMBDA;

import java.util.function.Predicate;

public class Predicate_fun {

	public static void main(String[] args) {
		//checking value is big or not
		Predicate<Integer> obj=(val)->(val<4);
		System.out.println(obj.test(6));
		
		String names[]= {"prajwal","shivam","yash","sanket"};
		Predicate<String> obj1=(val)->(val.length()<5);
			
			for (String name:names) {
				if(obj1.test(name)) {
					System.out.println(name);
				}
			}
	}

}
