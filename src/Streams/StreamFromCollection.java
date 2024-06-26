package Streams;
import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamFromCollection {
	public static void main(String[] args) {
		
		List<Integer> li=Arrays.asList(356,746,567,364);
		
		Stream<Integer> streamFromCollection=li.stream()
				.filter((Integer val) -> val>500 )
				.sorted();
		//System.out.println(li);
		//System.out.println(streamFromCollection);
		List<Integer> output=streamFromCollection.collect(Collectors.toList());		
		System.out.println(output);
				
	}

}
