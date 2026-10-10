package complex;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatedCharacterFromString {

	public static void main(String[] args) {
		String str = "is the best programming language in the world";
	
		
		Character repeated =str.chars().mapToObj(e-> (char)e)
		           .map(e-> Character.toLowerCase(e))
		           .filter(e -> e!= ' ')
		           .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap:: new ,Collectors.counting()))  // Group characters and count their frequencies while preserving string order
		           .entrySet()// convert map to entryset
		           .stream()
		           .filter(entry-> entry.getValue()>1)
		           .map(entry-> entry.getKey())
		           .findFirst().orElse(null);
		          
		System.out.println(repeated);

	}

}
