package handsonjava;

import java.util.*;
public class Main{
    public static void main (String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     sc.nextLine();
     String[] products=new String[n];
     int[] discount=new int[n];
     int min_value=Integer.MAX_VALUE;
     for(int i=0;i<n;i++){
         String[] details=sc.nextLine().split(",");
         products[i]=details[0];
         discount[i]= Main.result(details[1],details[2]);
         if(discount[i]<min_value){
             min_value=discount[i];
         }
     }
         for(int i=0;i<n;i++){
             if(min_value==discount[i]){
                 System.out.println(products[i]);
             }
         }
       
    }
    public static int result(String p,String d){
        int price=Integer.parseInt(p);
        int dis=Integer.parseInt(d);
        return price*dis /100;
    } 
     
    
}