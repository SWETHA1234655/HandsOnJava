package Sample_ds;
import java.util.Scanner;
public class Array_Lrotation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter dimention:");
		int di=sc.nextInt();
		for(int i=di;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<di;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
