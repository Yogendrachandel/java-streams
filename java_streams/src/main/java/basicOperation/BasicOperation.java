package basicOperation;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class BasicOperation {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,12,13,4,5, 2, 10, 21, 12,4, 17,3);
		
		//find distinct
		List<Integer> distictlIst= list.stream().distinct().collect(Collectors.toList());
		System.out.println("The distinct elemenst ="+distictlIst);
		
		
		//Total element in List
		long totalCount= list.stream().count();
		System.out.println("The count of  element ="+totalCount);
		
			
		//Remove duplicate and sort -1
		List<Integer> uniqueSortedList= list.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println("The sorted distict list ="+uniqueSortedList);
		
		//Remove duplicate and sort -2
		List<Integer> uniqueSortedLists= list.stream().distinct().sorted((a,b)-> a-b).collect(Collectors.toList());
		System.out.println("The sorted distict list ="+uniqueSortedList);
		
		
		//Remove duplicate and sort list in desc order
		List<Integer> descList= list.stream().distinct().sorted((a,b)-> b-a).collect(Collectors.toList());
		System.out.println("The descending order="+descList);
		
		List<Integer> avergaeist = Arrays.asList(10,20,30,12,33);
		
		//Average of all number
		double avg = avergaeist.stream().mapToDouble(e -> e).average().getAsDouble();
		System.out.println("The avg ="+avg);
		
		//Average of all number
		double avg1 = avergaeist.stream().collect(Collectors.averagingDouble(e-> e)).doubleValue();
		System.out.println("The avg ="+avg1);

	}

}
