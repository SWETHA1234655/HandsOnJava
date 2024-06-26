package Inheritance;

public class Main {
	
	public static void main(String[] args) {
		
		Bank b=new Bank();
		
		b.transactions();

		b.acc_no=1234;
		
		b.ifsc_code="acfd";
		
		System.out.println(b.acc_no+" "+b.ifsc_code);
	}
	
	
	
	
	
	
	

}
