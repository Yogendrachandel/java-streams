package complex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GetListOfIndiviudalCharacter {

	public static void main(String[] args) {

		List<String>list = Arrays.asList("Java","Spring");
		List<String>ouputList= list.stream().flatMap(word-> word.chars().mapToObj(c -> String.valueOf((char)c)))
	             .collect(Collectors.toList());
		
		System.out.println(ouputList);

	}

}
