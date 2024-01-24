package advance_java.stream_API;

import java.util.ArrayList;	
import java.util.Arrays; 	
import java.util.List;   	
import java.util.stream.Collectors;		
import java.util.stream.Stream;

public class Flatmap_method1 {         

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lst= Arrays.asList("ram","sham","mohan");
		List<String> secnd= Arrays.asList("prajwal","anil","suryawanshi");
		List<String> third= Arrays.asList("sanjeevan","college");
		
		List<String> newstr= new ArrayList<>();
		System.out.println(
		Stream.of(lst,secnd,third).flatMap(List :: stream).collect(Collectors.toList())
		);
	}

}