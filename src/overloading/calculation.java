package overloading;

public class calculation {
	
	public void add(int a,int b) {
		System.out.println("integer alone");
	}
	public void add(int a,float b) {
		System.out.println("Coimbination of int and float");
	}
	public void add(String a,String b) {
		System.out.println("Strings");
	}
	
	public static void main(String[] args) {
		calculation c=new calculation();
		c.add(12, 0);
		c.add(20, 0.0f);
		c.add("Swetha", "arun");
		
	}

}
