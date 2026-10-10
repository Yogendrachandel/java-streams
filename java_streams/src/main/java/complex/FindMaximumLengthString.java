package complex;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaximumLengthString {

	public static void main(String[] args) {
		List<String>names = Arrays.asList("Ram","ViyayLaxman","Mohan","Surrender","YogendraSingh");
		
		
		//Comparator
		Comparator<String>nameComp = new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				
				return o1.length() - o2.length();
			}
		};
		
		
		
		String longest =names.stream().max(nameComp).get();
		System.out.println(" Max length string using compartor -"+longest);
		
		
		//Second 
		String HighestLength = names.stream().max(Comparator.comparingInt(String::length)).orElse(null);
		System.out.println(" Max length string using Comparator.comparingInt -"+HighestLength);

	}

}
