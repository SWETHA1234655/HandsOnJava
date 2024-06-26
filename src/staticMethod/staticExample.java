package staticMethod;

public class staticExample {
	String name;
	String city;
	static int n=10;
	
	staticExample(String name,String city){
		this.name=name;
		this.city=city;
		this.n=n;
	}
	static void setIntValue() {
		n=20;
	}
	public void display() {
		System.out.println(name+" "+n+" "+city);
	}
	public static void main(String[] args) {
		staticExample.setIntValue();
		staticExample s=new staticExample("swetha","Trichy");
		s.display();
	}
	
	

}
