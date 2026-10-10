package epamInterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindValidIntegerFromListOfString {

	public static void main(String[] args) {
        List<String> input = Arrays.asList("123", "abc", "45", "-8");
        
        List<Integer> valid  = input.stream().filter(i -> i.matches("-?\\d+"))
                             .map(Integer:: parseInt)
                             .collect(Collectors.toList());
        
        System.out.println(valid);

	}

}
