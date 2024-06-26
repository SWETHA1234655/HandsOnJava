package collections;
import java.util.*;
public class AsprientMain {
		
	private Map<String,Double>aspirantMap = new HashMap<>();

	public Map<String, Double> getAspirantMap() {
		return aspirantMap;
	}

	public void setAspirantMap(Map<String, Double> aspirantMap) {
		this.aspirantMap = aspirantMap;
	}
	
	public double findAspirantMark(String rollNumber) {
		if(aspirantMap.containsKey(rollNumber)) {
			return aspirantMap.get(rollNumber);
		}
		else
			return -1;
		
	}
	
	public List<String> findAspirantsSelectedForTheSuperBatch(){
		List<String> id = new ArrayList<>();
		for(Map.Entry<String,Double> entry : aspirantMap.entrySet()) {
			if(entry.getValue()>=80) {
				id.add(entry.getKey());
			}
		}
		return id;
 	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<String,Double> h = new HashMap<>();
		AsprientMain am = new AsprientMain();
		System.out.println("Enter number of records to be added:");
		int n=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the details (Roll number:mark scored)");
		String[] str=new String[n];
		for(int i=0;i<n;i++) {
			str[i]=sc.nextLine();
		}
		for(int i=0;i<str.length;i++) {
			String m[]  = str[i].split(":"); 
			h.put(m[0],Double.parseDouble(m[1]));
			am.setAspirantMap(h);
		}
	
		System.out.println("Enter the roll number to be searched");
		String rol = sc.next();
		if(am.findAspirantMark(rol)==-1.0)
			System.out.println(rol+ " is invalid");
		else
			System.out.println("Mark scored : "+am.findAspirantMark(rol));
		
		if((am.findAspirantsSelectedForTheSuperBatch()).size()==0) {
			System.out.println("none of the students were selected");
		}
		else {
			System.out.println("Students selected for super batch are : ");
			for(String i : am.findAspirantsSelectedForTheSuperBatch()){
				System.out.println(i);
			}
		}
		
	}
	

}
