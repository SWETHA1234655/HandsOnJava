package handsonjava;

import java.util.Scanner;

public class Test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total no.of employees:");
        
        int n=sc.nextInt();
        
        if(n<=1) {
        	System.out.println("Please enter a valid employee count");
        	return;
        	}
       
        int[] arr=new int[n];
       
        System.out.println("Enter the age for "+ n +" employees:");
        for(int i=0;i<n;i++){
        	
            arr[i]=sc.nextInt();
            if(arr[i]<28 || arr[i]>40) {
            	System.out.println("Invalid age encountered!"); 
            	return;
            }
        }
        
        Test t=new Test();
        t.calculateAverge(arr,n);
    }
        
        public void calculateAverge(int[] arr,int n){
            float sum=0;
                for(int i=0;i<n;i++){
                    
                    sum=sum+arr[i];
                }
                System.out.printf("The average age is: %.2f",sum/n);
                
                
        }
        
    
}