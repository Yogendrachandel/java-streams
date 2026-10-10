package epamInterview;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ConvertSentenceToHashTag {

	public static void main(String[] args) {
        String sentence = "convert this sentence";
        String hashtag = "#" + Arrays.stream(sentence.split("\\s+"))
                .map(w -> Character.toUpperCase(w.charAt(0)) + w.substring(1).toLowerCase())
                .collect(Collectors.joining(""));
        System.out.println(hashtag);


	}

}
