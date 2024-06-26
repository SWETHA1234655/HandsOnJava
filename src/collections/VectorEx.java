package collections;
import java.util.*;
public class VectorEx {
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("swe");
		v.add(20);
		v.addElement("arun");
		System.out.println(v);
		v.remove(1);
		System.out.println(v);
		
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		v.add("cts");
		v.add("tcs");
		System.out.println(v);
	}

}
