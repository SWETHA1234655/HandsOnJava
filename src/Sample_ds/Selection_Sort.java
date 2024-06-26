package Sample_ds;
import java.util.Scanner;
public class Selection_Sort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr= {12,10,4,56,1};
		int mi=-1;
		
		for(int i=0;i<arr.length;i++) {
			mi=i;
			for(int j=i+1;j<arr.length;j++) { 
				if(arr[mi]>arr[j] ){
					mi=j;
					
				}
				int t=arr[mi];
				arr[mi]=arr[i];
				arr[i]=t;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
