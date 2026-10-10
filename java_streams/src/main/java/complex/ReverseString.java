package complex;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "i love java very much";
		
		String revered = Arrays.stream(str.split(" "))
		.map(w -> new StringBuilder(w).reverse().toString())
		.collect(Collectors.joining(" "));
		System.out.println(revered);

	}

}
