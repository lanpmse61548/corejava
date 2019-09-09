package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class main {

	public static void main(String[] args) {
		
		   List<String> lines =  new ArrayList<String>();
		   lines.add("teo");
		   lines.add("ty");

	        List<String> result = lines.stream()              
	                .filter(line -> "teo".equals(line))     
	                .collect(Collectors.toList());              

	        result.forEach(System.out::println);      
	}

}
