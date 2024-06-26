package Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;


public class DistinctStreamExample {
	public static void main(String[] args) {
		
		List<Integer> li=new ArrayList();
		li.add(12);
		li.add(11);
		li.add(11);
		li.add(9);
		li.add(10);
		li.add(14);
		li.add(12);
		
		li.stream().distinct()
		.forEach((Integer val)-> System.out.println(val));
		
		
	}

}
