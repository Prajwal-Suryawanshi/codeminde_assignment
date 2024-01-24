package advance_java.LAMBDA;

import java.util.function.Function;

public class Function_Interface {

	public static void main(String[] args) {
		
		//parameter int and return int
		Function<Integer, Integer> fobj= val->val*val;
		
		System.out.println(fobj.apply(10));
		System.out.println(fobj.apply(15));
		
		//parameter String and return int
		Function <String, Integer> fsobj= name->name.length();
		
		System.out.println("length of string is "+fsobj.apply("prajwal"));
		
	}

}
