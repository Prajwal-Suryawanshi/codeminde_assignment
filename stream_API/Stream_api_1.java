package advance_java.stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_api_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numberlist=Arrays.asList(10,15,20,25,30);
		List<Integer> evenNumberList = new ArrayList<>();
		
		evenNumberList=numberlist.stream().filter(n->n%2==0).collect(Collectors.toList());
		
		//first method to display
		System.out.println(evenNumberList);
		
		//second method to display
		numberlist.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
	
		//third method to display
		numberlist.stream().filter(n->n%2==0).forEach(System.out::println);

	}

}
