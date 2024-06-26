package Streams;

import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;


public class SortedStreamExample {
	public static void main(String[] args) {
		
		Integer[] arr= {12,45,11,56,2,500,51};
		
		Stream<Integer> arrStream=Arrays.stream(arr).sorted();
		arrStream.forEach((Integer val)-> System.out.println(val));
		
		
		
		
				
		
		
	}

}
