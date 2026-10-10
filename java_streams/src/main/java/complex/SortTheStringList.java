package complex;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortTheStringList {

	public static void main(String[] args) {
		
		List<String>list = Arrays.asList("ram", "vijaylaxman","mohan","surrender","aman","balbir","anil");
		
		System.out.println("----------------------Ascending sorting--------------------------");
		//1
		List<String>simpleSortList = list.stream().sorted().collect(Collectors.toList());//sorted used comparable
		System.out.println(simpleSortList);
		
		
		//2 -our compartor
		Comparator<String>comparator =new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		};
		
		
		List<String>compartorSorted = list.stream().sorted(comparator)
                     .collect(Collectors.toList());
		
		System.out.println(compartorSorted);
		
		
		//3 -directly comparator
		List<String>lambdaComp = list.stream().sorted(Comparator.comparing(i -> i)).collect(Collectors.toList());
		System.out.println(lambdaComp);
		
		
		System.out.println("----------------------Descending sorting--------------------------");
		
		
		List<String>descList = list.stream().sorted((a,b)-> b.compareTo(a)) .collect(Collectors.toList()); 
		System.out.println(descList);
		
	}

}
