package epamInterview;

import java.util.Arrays;
import java.util.Comparator;

public class FindSecondHighestWordInSenetnce {

	public static void main(String[] args) {
        String sentence = "Java Streams API provides powerful functional operations";
        
        String secondHighest = Arrays.stream(sentence.split("\\s+"))
        		                     .distinct() 
        		                     .sorted(Comparator.comparingInt(String::length).reversed())
        		                     .skip(1)
                                     .findFirst().orElse(null);
        System.out.println(" The second highest -"+secondHighest);

	}

}
