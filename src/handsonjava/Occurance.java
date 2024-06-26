package handsonjava;
import java.text.ParseException;
import java.util.Scanner;
public class Occurance {
	public static void main(String[] args)throws ParseException {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		int b=User.CountWords(s1,s2);
		System.out.println(b);
		
	}
	

}
