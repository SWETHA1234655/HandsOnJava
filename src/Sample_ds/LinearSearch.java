package Sample_ds;
import java.util.Scanner;
public class LinearSearch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		int tar=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			
				if(arr[i]==tar) {
					System.out.println(arr[i]+" ");
				}
				
			
		}
	}

}
