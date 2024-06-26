package handsonjava;
public class MovieTickets {
	
	private String movieName;
	private String screenNumber;
	private int noOfTickets;
	private String mobileNumber;
	private String time;
	private String modeOfPayment;
	
	
	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getScreenNumber() {
		return screenNumber;
	}

	public void setScreenNumber(String screenNumber) {
		this.screenNumber = screenNumber;
	}

	public int getNoOfTickets() {
		return noOfTickets;
	}

	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getModeOfPayment() {
		return modeOfPayment;
	}

	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}

	public MovieTickets(String movieName, String screenNumber, int noOfTickets, String mobileNumber, String time, String modeOfPayment) {
		super();
		this.movieName = movieName;
		this.screenNumber = screenNumber;
		this.noOfTickets = noOfTickets;
		this.mobileNumber = mobileNumber;
		this.time = time;
		this.modeOfPayment = modeOfPayment;
	}
	
	public MovieTickets() {
		super();
		
	}
		
	public double calculatePrice(){
		double Amount_paid=0.0;	
		if(noOfTickets<=0){
		    return 0;
		}
		if(screenNumber.equals("S1")){
		    Amount_paid=noOfTickets*280+35;
		}
		else if(screenNumber.equals("S2")){
		    Amount_paid=noOfTickets*250+35;
		}
		else if(screenNumber.equals("S3")){
		    Amount_paid=noOfTickets*520+35;
		}
		else if(screenNumber.equals("S4")){
		    Amount_paid=noOfTickets*400+35;
		}
		else if(screenNumber.equals("S5")){
		    Amount_paid=noOfTickets*180;
		}
		else{
		    return 0;
		}
			
		return Amount_paid;
	}
	
	public String generateTicketId(){
		String str;
		if(screenNumber.equals("S1") || screenNumber.equals("S2")|| screenNumber.equals("S3") || screenNumber.equals("S4") || screenNumber.equals("S5") && noOfTickets>0 ){
	        String Ticket_id=movieName.replaceAll(("[AEIOUaeiou ]"),"").substring(0,2);
	    	str = Ticket_id+screenNumber+"N"+noOfTickets;
		}
		else{
	    	return "Invalid movie details";
		}
		return str;
	}


}
