package handsonjava;

public class TicketInfo {
	private String name;
	private int noOfTickets;
	private String coach;
	private String mobileNumber;
	private String insurance;
	public TicketInfo()
	{
		super();
	}

	public TicketInfo(String name, int noOfTickets, String coach, String mobileNumber, String insurance) {
		super();
		this.name = name;
		this.noOfTickets = noOfTickets;
		this.coach = coach;
		this.mobileNumber = mobileNumber;
		this.insurance = insurance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfTickets() {
		return noOfTickets;
	}
	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}
	public String getCoach() {
		return coach;
	}
	public void setCoach(String coach) {
		this.coach = coach;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getInsurance() {
		return insurance;
	}

	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}

    double ticket_cost=0;
	public double calculateTicketCost()
	{
		//Fill the code here
		
		
		if(coach.equalsIgnoreCase("FirstAC")){
		    ticket_cost=noOfTickets*(2200+(2200*(5/100.0))+(2200*(4.5/100.0)));
		    System.out.println("ans:"+ticket_cost);
		}
		else if(coach.equalsIgnoreCase("SecondAC")){
		    ticket_cost=noOfTickets*(1700+(1700*(5/100.0))+(1700*(4.5/100.0)));
		}
		else if(coach.equalsIgnoreCase("ThirdAC")){
		    ticket_cost=noOfTickets*(1200+(1200*(4/100.0))+(1200*(4.5/100.0)));
		}
		else if(coach.equalsIgnoreCase("Sleeper")){
		    ticket_cost=noOfTickets*(520+(520*(2/100.0))+(520*(4.5/100.0)));
		}
		else if(coach.equalsIgnoreCase("Unreserve")){
		    ticket_cost=noOfTickets*200;
		}
		else {
			return -1;
		}
		
		
		return ticket_cost;
	}
    
    double total_cost=0;
	public double calculateTotalBookingCost()
	{
		
		//Fill the code here
//		if(coach.equalsIgnoreCase("Unreserve")) {
//			
//		}
		
		ticket_cost = calculateTicketCost();
		
		if(insurance.equals("yes")){
		    total_cost=ticket_cost+(noOfTickets*49);
		    System.out.println(total_cost);		}
		else if(insurance.equals("no")){
		    total_cost=ticket_cost;
		    
		}
		else {
			return -1;
		}
		
		return total_cost;
	}


}
