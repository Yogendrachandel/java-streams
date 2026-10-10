package complex;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatedString {

	public static void main(String[] args) {
		String str = "hello guys java awesome but java is vast";
		
		
		String firstRepeat = Arrays.stream(str.split(" "))
		      .map(w-> w.toLowerCase())
		      .filter(w-> w!=" ")
		      .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap:: new ,Collectors.counting()))
		      .entrySet()
		      .stream()
		      .filter(entry-> entry.getValue()>1)
		      .map(entry-> entry.getKey())
		      .findFirst().orElse(null);
		System.out.println(firstRepeat);
		      

	}

}
