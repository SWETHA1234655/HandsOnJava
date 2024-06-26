package handsonjava;
import java.util.Scanner;

public class studentMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student's Id:");
		int id=sc.nextInt();
		System.out.println("Enter Student's Name:");
		String name =sc.next();
		System.out.println("Enter student's address:");
		String address=sc.next();
		
		
		while(true) {
			System.out.println("Whether the student is from NIT(Yes/No):");
			String collegeName =sc.next();
			
			if(collegeName.equalsIgnoreCase("Yes")) {
				collegeName="NIT";
				Student stu = new Student(id,name,address);
				System.out.println(stu);
				return;
				
				}
			else if(collegeName.equalsIgnoreCase("No")) {
				System.out.println("Enter College name:");
				String clg=sc.next();
				Student stu1=new Student(id,name,address,clg);
				System.out.println(stu1);
				return;
			}
			else {
				System.out.println("Wrong Input");
			}
			
		}
			
		
	}

}
