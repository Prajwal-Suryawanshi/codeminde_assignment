package advance_java.stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> vehicle= Arrays.asList("prajwal","sham","ram","prakash"); 
		
		List<String> newvehicle = new ArrayList<>();
		
		newvehicle=vehicle.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
		System.out.println(newvehicle);
	}

}
