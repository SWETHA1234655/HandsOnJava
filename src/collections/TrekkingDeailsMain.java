package collections;

import java.util.*;

public class TrekkingDeailsMain {
	
	private Map<String,Integer> detailsMap=new HashMap<>();
	
	public Map<String,Integer> getDetailsMap(){
		return detailsMap;
	}
	public void setDetailsMap(Map<String,Integer> detailsMap) {
		this.detailsMap=detailsMap;
	}
	
	public int findCountOfMountainsBasedOnThePeakPoint(int minimumPeak,int maximumPeak) {
		int count=0;
		//for(Map.Entry<String,Integer> entry=)
		for(Integer i : detailsMap.values()) {
			if(minimumPeak <=i && maximumPeak >= i) {
				count++;
			}
		}
		if(count==0) {
			return -1;
		}
		else {
			return count;
		}
		
		
	}
	public List<String>findMuntainsBasedOnPeakPoint(int peakPoint){
		
		List<String> li=new ArrayList<>();
		
		for(Map.Entry<String,Integer> entry : detailsMap.entrySet()) {
			if(entry.getValue() <= peakPoint) {
				li.add(entry.getKey());
			}
		}
		return li;
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		HashMap<String,Integer> h=new HashMap<>();
		
		TrekkingDeailsMain tm=new TrekkingDeailsMain();
		
		System.out.println("Enter the number");
		
		int n=sc.nextInt();
		sc.nextLine();
		
		System.out.println("(Mountain name:Peak point)");
		
		String[] str=new String[n];
		
		for(int i=0;i<n;i++) {
			str[i]=sc.nextLine();
		}
		
		for(int i=0;i<str.length;i++) {
			String[] s=str[i].split(":");
			h.put(s[0], Integer.parseInt(s[1]));
			
			tm.setDetailsMap(h);
		}
		
		System.out.println("Enter the minimum and maximum peak points");
		int n1=sc.nextInt();sc.nextLine();
		int n2=sc.nextInt();sc.nextLine();
		
		if(tm.findCountOfMountainsBasedOnThePeakPoint(n1,n2) != -1) {
			System.out.println("The total count of mountains are"+tm.findCountOfMountainsBasedOnThePeakPoint(n1,n2));
			
		}
		else {
			System.out.println("No mountains were found");
		}
		
		System.out.println("Enter the peak point to be searched");
		int n3=sc.nextInt();
		sc.nextLine();
		if(tm.findMuntainsBasedOnPeakPoint(n3).size()==0){
			System.out.println("No mountains were found");
			
		}
		else {
		System.out.println("Mountains based on the condions are "+tm.findMuntainsBasedOnPeakPoint(n3));
	}
	}

}
