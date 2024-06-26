package Streams;

import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class flatMap {
	
	public static void main(String[] args) {
		List<List<String>> li=Arrays.asList(
				Arrays.asList("hi","how","are","you"),
				Arrays.asList("welcome","to","java"));
		Stream<String> firstStream=li.stream().flatMap((List<String> str)-> str.stream().map((String str1)-> str1.toUpperCase()));
		List<String> output=firstStream.collect(Collectors.toList());
		System.out.println(output);
	}

}
