package collectorsType;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class partioningBy10 {

	public static void main(String[] args) {

    List<Integer>list = Arrays.asList(12,34,15,7,9);
    
   /* partitioningBy take predicate and the main difference between partitioningBy  and groupingBy:
    * partitioningBy - only 2 groups 
    * groupingBy-  many groups
    */
   Map<Boolean,List<Integer>> mapPartioning= list.stream().collect(Collectors.partitioningBy( element -> element%2==0));
   System.out.println(mapPartioning);
   
   //we acn achive the same as above with groupingBy:
   Map<Boolean,List<Integer>> mapGrouping= list.stream().collect(Collectors.groupingBy( element -> element%2==0 ));
   System.out.println(mapGrouping);
   
   
   Map<String,List<Integer>> mapGroupingEvenOdd= list.stream().collect(Collectors.groupingBy( element -> element%2==0 ? "Even": "Odd"));
   System.out.println(mapGroupingEvenOdd);
   
   
   
   

	}

}
