package Sample_ds;
import java.util.Scanner;
public class Bubble_Sorting {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr= {1,2,3,4,5,6};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;i++) {
				if(arr[j]>arr[j+1]) {
					int t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}
				
			}
			
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
		}
	}

}
