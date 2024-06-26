package handsonjava;

import java.util.Scanner;
class CinemaTicket{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of ticket:");
        int ref=50;
        int not=sc.nextInt();
        if(not<5 || not>40){
            System.out.println("Minimum of 5 and Maximum of 40 Tickets");
            return;
        }
       
       double total_cost=0,ticket_cost=0,coupon=0,total_cost1=0,total_cost2=0;
       System.out.println("Do you want refreshment:");
       char rmt=sc.next().charAt(0);
       System.out.println("Do you have coupon code");
       char cc=sc.next().charAt(0);
       
       System.out.println("Enter the circle:");
       char c=sc.next().charAt(0);
       if(c!='k' && c!='q') {
    	   System.out.println("Invalid Input");
    	   return;
       }
       if(c=='k') {
    	   total_cost=not*75;
    	   
       }
       if(c=='q') {
    	   total_cost=not*150;
    	   
       }
       
       
       if(not>20) {
      	 total_cost=total_cost-total_cost*0.10;
      	
      	}
       if(cc=='y') {
      	 total_cost=total_cost-total_cost*0.02;
      	
       }
    	
         if(rmt=='y') {
           	total_cost=total_cost+(not*50);
           	}
         
        
       
        System.out.println("Ticket_cost:"+total_cost);
        
        
        
        
        
    }
}
