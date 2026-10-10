package flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SplitSentencesIntoWOrds {

	public static void main(String[] args) {
		List<String> sentences = Arrays.asList(
		        "Java Streams",
		        "FlatMap Example"
		);

		List<String> words = sentences.stream()
		        .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
		        .collect(Collectors.toList());

		System.out.println(words);

	}

}
