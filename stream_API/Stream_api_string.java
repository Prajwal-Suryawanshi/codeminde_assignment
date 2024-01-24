package advance_java.stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_api_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names= Arrays.asList("ram","sham","alex","mohan","praj");

		List<String> sortedname= new ArrayList<String>();
		
		sortedname=names.stream().map(n->n+"h").filter(n->n.length()>3 /*&& n.length()<5*/).collect(Collectors.toList());
		System.out.println(sortedname);
		
		names.stream().filter(n->n.length()>3 /*&& n.length()<5*/).forEach(System.out::println);
	
		names.stream().filter(n->n.length()>3 /*&& n.length()<5*/).forEach(n->System.out.println(n));
		
	}

}
