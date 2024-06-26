package Interface;

public class language extends frontend implements backend {
	
	public void first() {
		System.out.println("Abstrct class");
	}

	@Override
	public void result() {
		// TODO Auto-generated method stub
		System.out.println("Backend Interface implements....");
	}

}
