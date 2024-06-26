package Streams;

import java.util.*;
import java.util.stream.Stream;

public class StreamMapExample {
	public static void main(String[] args) {
		
//		Stream<String> strName=Stream.of("SWETHA","HOW","ARE","YOU");
//		Stream<String> output=strName.map((String str)-> str.toLowerCase());
//		output.forEach((String name)-> System.out.println(name));
		
		List<Integer> li=Arrays.asList(12,34,3,56,11);
		
		Stream<Integer> output=li.stream()
				.filter((Integer val)-> val>15)
				.map((Integer val1)-> val1*-1);
				output.forEach((Integer val2)-> System.out.println(val2));
				
	}

}
