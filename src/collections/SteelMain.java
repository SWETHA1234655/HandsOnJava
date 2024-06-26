package collections;

import java.util.*;

public class SteelMain {
	
	private Map<String,String> steelMap = new HashMap<>();
	
	public Map<String,String> getSteelMap(){
		return steelMap;
	}
	public void setSteelMap(Map<String,String> steelMap) {
		this.steelMap = steelMap;
	}
	
	public int findCountOfOrderBasedOnTheSteelType(String steelType) {
		int count=0;
		//System.out.println(steelMap);
		for(String str : steelMap.values()) {
			String s = str;
			if(steelType.equals(str)) {
				count++;
			}
		}
		
		return count;
			
		
		
	}
	public List<String>findOrderIdsBasedOnTheSteelType(String steelType){
		List<String> li=new ArrayList<>();
		for(Map.Entry<String,String> entry : steelMap.entrySet()) {
			if(entry.getValue().equals(steelType)) {
				li.add(entry.getKey());
			}
			
		}
		return li;
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		HashMap<String,String> h=new HashMap<>();
		
		SteelMain st=new SteelMain();
		
		System.out.println("Enter number of records to be added");
		int n=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the records(Order Id: Steel Type)");
		
		String[] str=new String[n];
		for(int i=0;i<n;i++) {
			str[i]=sc.nextLine();
		}
		
		for(int i=0;i<str.length;i++) {
			String[] s=str[i].split(":");
			h.put(s[0],s[1]);
			
			st.setSteelMap(h);
			}
		System.out.println(h);
		System.out.println("Enter the steel type ");
		String stType=sc.nextLine();
		if(st.findCountOfOrderBasedOnTheSteelType(stType)==0) {
			System.out.println("No order id found");
		}
		else {
			System.out.println("The order id based on "+ stType+" are "+st.findCountOfOrderBasedOnTheSteelType(stType));
		}
		
		System.out.println("Order Id based on the "+stType+" are "+st.findOrderIdsBasedOnTheSteelType(stType));
	}
	

}
