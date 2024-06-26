package Streams;

import java.util.stream.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;



public class StreamFilterExample {
	public static void main(String[] args) {
		
//		Stream<String> nameStream=Stream.of("swetha","arun","app","amma");
//		Stream<String> filteredStream=nameStream.filter((String str)-> str.length()>=4);
//		List<String> output=filteredStream.collect(Collectors.toList());
//		System.out.println(output);
		
		List<Integer> li=Arrays.asList(23,45,67,100,12);
		
		Stream<Integer> output=li.stream()
				.filter((Integer val)-> val>50)
				.peek((Integer val)-> System.out.println(val));
		output.count();
		
	}

}
