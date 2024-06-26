package Sample_ds;
import java.util.Scanner;
public class Quick_sort {
	
	private static void quicksort(int[] arr,int low,int high) {
		
		if(low<high) {
		
		int p=divide(arr,low,high);
		
		quicksort(arr,low,p-1);
		quicksort(arr,p+1,high);
		}
		
	}
	private static int divide(int[] arr,int low,int high) {
		
		int i=low-1;
		int pivot=arr[high];
		
		for(int j=low;j<high;j++) {
			if(arr[j]<pivot) {
				i++;
				
				int t=arr[i];
				arr[i]=arr[j];
				arr[j]=t;
			}
			
			
		}
		int t=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=t;
		
		return i+1;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		quicksort(arr,0,arr.length-1);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		
	}
}
