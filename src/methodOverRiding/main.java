package methodOverRiding;

public class main {
	
	public static void main(String[] args) {
		
		Bank b=new Bank();
		b.getBalance();
		Atm a=new Atm();
		a.getBalance();
		Bank b1=new Atm();
		b1.getBalance();
	}

}
