package complex;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindVowelsFromString {

	public static void main(String[] args) {
		String str = "Hello welcome";
		
		  List<Character>charss =  Arrays.asList('a','e','i','o','u');
		
		  List<Character> list = str.chars().mapToObj(c->(char)c)
		              .map(e -> e.toLowerCase(e) )
		              .filter(e-> charss.contains(e) )
		              .collect(Collectors.toList());
		  
		  System.out.println("Vowels -"+list);
		  
		 Map<Character, Long>map = str.chars().mapToObj(c->(char)c)
                    .map(e -> e.toLowerCase(e) )
                   .filter(e-> charss.contains(e))
                   .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		 System.out.println(map);

	}

}
