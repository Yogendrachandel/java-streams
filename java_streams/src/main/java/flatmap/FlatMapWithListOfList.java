package flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapWithListOfList {

	public static void main(String[] args) {
		
		List<List<String>>listOfList = Arrays.asList(Arrays.asList("Bananna","apple","Grapes"),
													 Arrays.asList("Car","Scooter","truck")
													 );
		
		
		List<String>flattenList = listOfList.stream()
				                            .flatMap(list-> list.stream())//convert each list into stream again
				                            .collect(Collectors.toList());
		
		flattenList.forEach(e->System.out.println(e));
	}

}
