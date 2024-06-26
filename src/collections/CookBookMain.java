package collections;

import java.util.*;

public class CookBookMain {
	
	private Map<String,Integer>recipeMap = new HashMap<>();
	
	public Map<String,Integer> getRecipeMap(){
		return recipeMap;
	}
	public void setRecipeMap(Map<String,Integer> recipeMap) {
		this.recipeMap=recipeMap;
	}
	
	public int countRecipesUnderTime(int preparationTime) {
		int count=0;
		for(Map.Entry<String,Integer> entry : recipeMap.entrySet()) {
			if(entry.getValue()<= preparationTime) {
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
	
	public List<String>getRecipesUnderTime(int preparationTime){
		List<String> li=new ArrayList<>();
		for(Map.Entry<String,Integer> entry:recipeMap.entrySet()) {
			if(entry.getValue() <= preparationTime) {
				li.add(entry.getKey());
			}
		}
		return li;
	}
	
	public static void main(String[] args) {
		
		HashMap<String,Integer> h=new HashMap<>();
		CookBookMain cb=new CookBookMain();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the recipes(Recipe name:preparation time");
		String[] str=new String[n];
		for(int i=0;i<n;i++) {
			str[i]=sc.nextLine();
		}
		for(int i=0;i<str.length;i++) {
			String[] s=str[i].split(":");
			h.put(s[0],Integer.parseInt(s[1]));
			cb.setRecipeMap(h);
		}
		System.out.println("Enter the preparation time to be searched");
		int n1=sc.nextInt();
		sc.nextLine();
		
		System.out.println("The recipes with preparation time less "+n1+" is "+cb.countRecipesUnderTime(n1));
		
		System.out.println("Enter the preparation time to identify the recipe names");
		for(String i : cb.getRecipesUnderTime(n1) ) {
			System.out.println(i);
			
		}
		
		
	}
	

}
