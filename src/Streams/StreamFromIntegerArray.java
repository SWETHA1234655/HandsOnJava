package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;


public class StreamFromIntegerArray {
	public static void main(String[] args) {
		Integer[] li= {235,2345,600,560};
		
		
		Stream<Integer> StreamFromArray=Arrays.stream(li);
		//.peek((Integer val)-> System.out.println(val));
		StreamFromArray.forEach((Integer val)-> System.out.println(val));
		
		
	}

}
