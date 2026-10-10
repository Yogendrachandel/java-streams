package complex;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ConvertListToMap {

	public static void main(String[] args) {
		List<String>list =Arrays.asList("Apple","Bannana","Mango","Kiwi","Promigrante");
		
		
		//Map as actual value as Key and length as value
		Map<String,Integer>mapWithLength= list.stream().collect(Collectors.toMap(Function.identity(), String::length));
		System.out.println(mapWithLength);
		
		
		
			List<String>courses =Arrays.asList("Spring","boot","Microservices","kafka","cloud");
		
		
		//Map as actual value as Key and length as value
		//Exception in thread "main" java.lang.IllegalStateException: Duplicate key 5
		 //Map<Integer, String>coursesList= courses.stream().collect(Collectors.toMap(String::length,Function.identity()));
		
			Map<Integer, String>coursesList= courses.stream().collect(Collectors.toMap(String::length, //key mapper
					                                                                   Function.identity(), //value 
					                                                                   (first,second)-> second));//merge function- maintaining second key if duplicate found and then no exception
			
			System.out.println(coursesList);

	}

}
