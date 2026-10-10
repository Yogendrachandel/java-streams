package complex;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateWordWithFrequency {

	public static void main(String[] args) {
		List<String>animals = Arrays.asList("hello" ,"world","apple","cat","dog","hello","cat","lion","tigger","hello");

		//Find only duplicate -1		
		List<String>duplicate = animals.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))//GroupingBy produce map where key as element itself and value is frequency
		                .entrySet()   // convert map to entryset than only we can use streams
		                .stream() //convert to streams
		                .filter(entry-> entry.getValue()>1)
		                .map(entry-> entry.getKey())//Convert again entry to string
		                .collect(Collectors.toList());
		System.out.println("Duplicate -"+duplicate);
		
		
		//Find only duplicate using set -2		
		        Set<String> duplicated = new HashSet<>();
				Set<String>duplicateSet =animals.stream()
						                        .filter(e -> !duplicated.add(e))//It will add unique element, set .add() returns false if repeated and return false and ! makes this expression true and same repeated element collected in list
						                        .collect(Collectors.toSet());
				System.out.println("Duplicate using SET -"+duplicateSet);
				
				
		//Find Duplicate with its frequency
		Map<String,Long>duplicateWIthFreq = animals.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))//GroupingBy produce map where key as element itself and value is frequency
		                .entrySet()   // convert map to entryset than only we can use streams
		                .stream() //convert to streams
		                .filter(entry-> entry.getValue()>1)
		              //  .peek(System.out::println)
		                //.collect(Collectors.toMap(entry-> entry.getKey(), entry-> entry.getValue()));
						.collect(Collectors.toMap(Map.Entry ::getKey,Map.Entry:: getValue));
		System.out.println("Duplicate with frequency-"+duplicateWIthFreq);		
				
	}

}
