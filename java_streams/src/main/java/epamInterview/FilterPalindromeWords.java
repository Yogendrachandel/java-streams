package epamInterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterPalindromeWords {

	public static void main(String[] args) {
        List<String> words = Arrays.asList("radar", "hello", "kayak");
        
       List<String>palindrom= words.stream().filter(w -> w.equals(new StringBuilder(w).reverse().toString()))
        .collect(Collectors.toList());
       System.out.println(palindrom);

	}

}
