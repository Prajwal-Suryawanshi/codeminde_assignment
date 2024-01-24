package advance_java.stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Map_method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> len=Arrays.asList("bus","car","prajwal","sham","ram","prakash");
		
		List<String> newlen=new ArrayList<>();
		
		len.stream().map(n->n.length()).forEach(System.out::println);
		
		
	}

}