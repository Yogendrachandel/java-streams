package epamInterview;

import java.util.Arrays;
import java.util.Comparator;

public class LongestWord {
    public static void main(String[] args) {
        String sentence = "Java Streams API provides powerful operations";
        String longest = Arrays.stream(sentence.split("\\s+"))
                .max(Comparator.comparingInt(String::length))
                .orElse("");
        System.out.println("Longest word: " + longest);
    }
}
