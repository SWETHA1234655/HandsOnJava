package Sample_ds;

import java.util.Scanner;

public class Merge_sort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		mergesort(arr,0,arr.length-1);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		
		
		
	}
	private static void mergesort(int[] arr,int l,int r) {
		
		if(l<r) {
			int mid=(l+r)/2;
			mergesort(arr,l,mid);
			mergesort(arr,mid+1,r);
			merge(arr,l,mid,r);
			
		}
	}
	private static void merge(int[] arr,int l,int mid,int r) {
		
		int n1=mid-l+1;
		int n2=r-mid;
		
		int[] la=new int[n1];
		int[] ra=new int[n2];
		
		for(int x=0;x<n1;x++) {
			la[x]=arr[l+x];
			
		}
		for(int x=0;x<n2;x++) {
			ra[x]=arr[mid+1+x];
		}
		
		int i=0,j=0,k=l;
		
		while(i<n1 && j<n2) {
			if(la[i]<=ra[j]) {
				arr[k]=la[i];
				i++;
				
			}
			else {
				arr[k]=ra[j];
				j++;
			}
			k++;
			
		}
		while(i<n1) {
			arr[k]=la[i];
			i++;
			k++;
			
		}
		while(j<n2) {
			arr[k]=ra[j];
			j++;
			k++;
		}
		
	}
	

}
