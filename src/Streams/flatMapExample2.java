package Streams;

import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;


public class flatMapExample2 {
	public static void main(String[] args) {
		
		List<List<Integer>> li=Arrays.asList(
				Arrays.asList(12,34,56,67),
				Arrays.asList(134,100,34,50));
		
		Stream<Integer> firstStream=li.stream()
				
				.flatMap((List<Integer> val) -> val.stream());
		List<Integer> output=firstStream.collect(Collectors.toList());
		System.out.println(output);
	}

}
