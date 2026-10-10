package flatmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertMapOfListIntoList {

	public static void main(String[] args) {
		
		List<String>vehicles = Arrays.asList("car","bike","truck");
		List<String>fruits = Arrays.asList("apple","grapes","mango");
		
		Map<String,List<String>> mapOfList = new HashMap<>();
		mapOfList.put("vehicles",vehicles);
		mapOfList.put("fruits",fruits);
		
		
		//convert into list
		List<String>flttenList = mapOfList.entrySet()
				                          .stream().
				                          flatMap(entry-> entry.getValue().stream())
		                .collect(Collectors.toList());
		
		System.out.println(flttenList);

	}

}
