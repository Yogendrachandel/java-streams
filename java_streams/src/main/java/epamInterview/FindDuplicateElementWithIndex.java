package epamInterview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindDuplicateElementWithIndex {

	public static void main(String[] args) {
	
		List<String>list = Arrays.asList("A","B","C","A","D","E","C");
		
		//IntStream helps to get the indexs of element
		Map<String, List<Integer>> map = IntStream.range(0, list.size())//startinclusive ,endexclusive
		         .boxed()//return convert the above IntStream that contain primitive int values into Stream<Integer>
		         .collect(Collectors.groupingBy(index-> list.get(index) ,Collectors.toList()))//element,list grouping
		         .entrySet()
		         .stream()
		         .filter(entry-> entry.getValue().size() >1)// need to get only list with size >1 for duplicate
		         .collect(Collectors.toMap(entry-> entry.getKey(), entry-> entry.getValue()));
		
		         System.out.println(map);

	}

}
