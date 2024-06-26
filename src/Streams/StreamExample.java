package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Stream;


public class StreamExample {
	public static void main(String[] args) {
		List<Integer> li=new ArrayList<>();
		li.add(3400);
		li.add(5000);
		li.add(2000);
		li.add(6234);
		li.add(7000);
		
		li.stream()
				.filter((Integer val )-> val >=3000 )
				.forEach((Integer val)-> System.out.println(val));
		
		
	}

}
