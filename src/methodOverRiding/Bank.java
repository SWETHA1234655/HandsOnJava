package methodOverRiding;

public class Bank {
	
	public void getBalance() {
		System.out.println("base class");
	}

}
class Atm extends Bank{
	
	public void getBalance() {
		System.out.println("child class");
	}
}


