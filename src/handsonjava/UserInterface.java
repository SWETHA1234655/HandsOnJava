package handsonjava;

import java.util.Scanner;

public class UserInterface {
	
	public static MovieTickets extractDetails(String movieDetails){
		//Fill the code here
		String[] details=movieDetails.split(":");
		MovieTickets mt=new MovieTickets(details[0],details[1],Integer.parseInt(details[2]),details[3],details[4],details[5]);
		return mt;  
			//return null;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Fill the code here
		System.out.println("Enter the details");
		String str=sc.nextLine();
		
		MovieTickets mv=extractDetails(str);
		if(mv.calculatePrice() == 0 || (mv.generateTicketId().equals("Invalid movie details"))){
		    System.out.println("Invalid movie details");
		}
		else{
    		System.out.println("Movie Name: "+mv.getMovieName());
    		System.out.println("Screen Number: "+mv.getScreenNumber());
    		System.out.println("Number of tickets: "+mv.getNoOfTickets());
    		System.out.println("Show Timing: "+mv.getTime());
    		System.out.println("Ticket Cost: "+mv.calculatePrice());
    		System.out.println("TicketId: "+mv.generateTicketId());
    		System.out.println("Thank you! Your payment received via "+mv.getModeOfPayment()+",our movie tickets are confirmed." );
		}
		
		
		
		

	}


}
