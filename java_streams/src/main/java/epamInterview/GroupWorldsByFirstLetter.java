package epamInterview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWorldsByFirstLetter {

	public static void main(String[] args) {
		List<String>list= Arrays.asList("apple", "banana", "apricot", "cherry");
		
		Map<Character,List<String>>map =
		list.stream().collect(Collectors.groupingBy(w-> w.charAt(0)));
		
		System.out.println(map);

	}

}
