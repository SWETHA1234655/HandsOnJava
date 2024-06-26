package Streams;

import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class PeekStreamExample {
	public static void main(String[] args) {
		List<Integer> val=Arrays.asList(122,344,544,677,233);
		Stream<Integer> value=val.stream()
				.filter((Integer v)-> v >= 500)
				.peek((Integer val1)-> System.out.println(val1));
		value.count();
				
	}

}
