package handsonjava;

import java.util.Scanner;

public class UserInter {
	public static TicketInfo extractDetails(String ticketDetails) {
		// Fill the code here
		String[] details = ticketDetails.split(":");
		TicketInfo ticket = new TicketInfo(details[0], Integer.parseInt(details[1]), details[2], details[3],
				details[4]);

		return ticket;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// Fill the code here
		System.out.println("Enter the passenger details");
		String str = sc.nextLine();
		TicketInfo ti = extractDetails(str);
		if (ti.calculateTicketCost() == -1 || ti.calculateTotalBookingCost() == -1) {
			System.out.println("Invalid Passenger details");
		} else {
			System.out.println("Passenger Name: " + ti.getName());
			System.out.println("Number of Tickets: " + ti.getNoOfTickets());
			System.out.println("Coach: " + ti.getCoach());
			System.out.println("Mobile Number: " + ti.getMobileNumber());
			System.out.println("Insurance Required: " + ti.getInsurance());
			System.out.println("Total Booking Charge:Rs." + (int)ti.calculateTotalBookingCost());
			// System.out.println("Total Booking Charge: "+ti.calculateTicketCost());

		}
	}

}
