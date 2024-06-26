package collections;
import java.util.*;
public class StackEx {
	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(10);
		s.push("swe");
		s.push(2.3);
		System.out.println(s);
		Object o=s.pop();
		System.out.println(s);
		Object ob=s.peek();
		System.out.println(ob);
		System.out.println(s.search(10));
		System.out.println(s.empty());
	}

}
