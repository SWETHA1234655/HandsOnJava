package Sample_ds;
import java.util.*;

public class Max_min {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int sum=0;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		//System.out.println(sum);
		for(int i=0;i<n;i++) {
			arr[i]=sum-arr[i];
			//arr[1]=sum-arr[i];
			
		}
		
		System.out.println();
		Arrays.sort(arr);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("Min :"+arr[0]);
		System.out.println("max :"+arr[arr.length-1]);
		
	}

}
