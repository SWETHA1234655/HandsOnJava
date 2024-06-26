package Sample_ds;
import java.util.Scanner;
public class Insertion_Sort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	//	int n=sc.nextInt();
		int[] arr= {23,56,3,7,90};
//		for(int i=0;i<n;i++) {
//			arr[i]=sc.nextInt();
//		}
		int key=0,j=0;
		
		for(int i=1;i<arr.length;i++) {
			key=arr[i];
			j=i-1;
			
			while(j >= 0 && arr[j] > key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
			
			
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
	}

}
