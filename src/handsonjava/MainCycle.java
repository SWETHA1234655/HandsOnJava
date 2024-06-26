package handsonjava;
import java.util.Scanner;
public class MainCycle {
	public static CycleSavy ex(String d) {
		CycleSavy obj = new CycleSavy();
		String[] details=d.split(":");
		obj.setC_id(details[0]);
		obj.setC_name(details[1]);
		obj.setC_type(details[2]);
		obj.setAccess(details[3]);
		obj.setPrice(Double.parseDouble(details[4]));
		
		return obj;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String str=sc.nextLine();
		CycleSavy c=ex(str);
		System.out.println("Cycle Details");
		System.out.println("Car id:"+c.getC_id());
		System.out.println("Car name:"+c.getC_name());
		System.out.println("Car type:"+c.getC_type());
		System.out.println("Wanted Accessories:"+c.getAccess());
		System.out.println("Cycle price:"+c.getPrice());
		//c.setPrice(Double.parseDouble(details[4]));
		//c.setC_type(details[2]);
		//c.setAccess(details[3]);
		System.out.println("Bill amount:"+c.calculateBillAmount());
		//String a = new String("a");
		//System.out.println( a.equals("a"));
		
	}

}
