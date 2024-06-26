package collections;

import java.util.*;

public class FantasyCreature {
	
		
		private Map<String,Integer> fantasyCreatureMap = new HashMap<>();
		
		public Map<String,Integer> getFantasyCreatureMap(){
			return fantasyCreatureMap;
		}
		
		public void setFantasyCreatureMap(Map<String,Integer> fantasyCreatureMap ) {
			this.fantasyCreatureMap=fantasyCreatureMap;
		}
		
		public int findTheHitPointsForTheGivenCreature(String creature) {
//			
//			for(Map.Entry<String,Integer> en : fantasyCreatureMap.entrySet()) {
//				if(entry.getKey().equals(creature)) {
//					
//				}
			if(fantasyCreatureMap.containsKey(creature)) {
				return fantasyCreatureMap.get(creature);
				
			}
			return -1;
			
		}
		
		public List<String>findTheCreatureNamesBasedOnTheHitPoints(){
			List<String> li=new ArrayList <>();
			
			for(Map.Entry<String, Integer> entry : fantasyCreatureMap.entrySet() ) {
				if(entry.getValue() >= 80) {
					li.add(entry.getKey());
					
				}
			}
			return li;
	 }
		
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
			HashMap<String,Integer> hm=new HashMap<>();
			
			FantasyCreature fc=new FantasyCreature();
			
			System.out.println("Enter number of creature to be added");
			int n=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the creature(creature name:hitPoints)");
			String[] str=new String[n];
			for(int i=0;i<n;i++) {
				str[i]=sc.nextLine();
			}
			for(int i=0;i<str.length;i++) {
				String[] s=str[i].split(":");
			//	int a=s[0],b=Integer.parseInt(s[1]);
				
				hm.put(s[0],Integer.parseInt(s[1]));
				
				fc.setFantasyCreatureMap(hm);
				
			}
			System.out.println("Enter the fantasy creature name");
			String fstr=sc.nextLine();
			
			if((fc.findTheHitPointsForTheGivenCreature(fstr)) != -1 ) {
				System.out.println("The hit points for the "+fstr+" is "+fc.findTheHitPointsForTheGivenCreature(fstr));
				System.out.println("Fantasy creature based on the condition are:"+fc.findTheCreatureNamesBasedOnTheHitPoints());
				
			}
			else {
				System.out.println("No creature fount");
				System.out.println("No fantasy creature were found for given condition");
				
			}
			
			
			
			
			
		}
		

	


}
