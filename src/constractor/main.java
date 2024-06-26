package constractor;

public class main {
	
	public static void main(String[] args) {
		
		fruits f=new fruits("mango",150);
		
		System.out.println(f.toString());
		
		f.name="apple";
		f.price=200;
		
		System.out.println(f.name+" "+f.price);
	}

}
