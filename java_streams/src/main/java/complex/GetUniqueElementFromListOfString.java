package complex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GetUniqueElementFromListOfString {

	public static void main(String[] args) {
		
		List<String>list = Arrays.asList("hello", "world","apple","cat","dog", "hello","cat","lion","trigger","lion");

		System.out.println("Unique " +list.stream().distinct().collect(Collectors.toList()));
		
		
		System.out.println("Unique by set -" +list.stream().collect(Collectors.toSet()));
	}

}
