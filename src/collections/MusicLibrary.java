package collections;

import java.util.*;

public class MusicLibrary {
	Map<String,String> songMap =new HashMap<>();
	
	public Map<String,String> getSongMap(){
		return songMap;
	}
	public void setSongMap(Map<String,String> songMap) {
		this.songMap=songMap;
	}
	
	public int getSongCountByArtistName(String artistName) {
		int count=0;
		for(String i: songMap.values()) {
			if(artistName.equals(i))
			count++;
		}
		if(count==0) {
			return 0;
		}
		else {
			return count;
		}
		
	}
	public List<String> filterSongTitleByArtistName(String artistName){
		List<String> li=new ArrayList<>();
		
		for(Map.Entry<String,String> entry:songMap.entrySet()) {
			if(entry.getValue().equals(artistName)) {
				li.add(entry.getKey());
			}
		}
		return li;
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<String,String> h=new HashMap<>();
		MusicLibrary ml=new MusicLibrary();
		System.out.println("Enter the item to be added");
		int n=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the records(song title:artist name)");
		String[] str=new String[n];
		for(int i=0;i<n;i++) {
			str[i]=sc.nextLine();
		}
		
		for(int i=0;i<str.length;i++) {
			String[] s=str[i].split(":");
			h.put(s[0], s[1]);
			
			ml.setSongMap(h);
		}
		
		System.out.println("Enter the artist name");
		String name=sc.nextLine();
		System.out.println("The count of songs by "+name+" is "+ml.getSongCountByArtistName(name));
		
		if(ml.filterSongTitleByArtistName(name).size()!=0) {
			for(String st:ml.filterSongTitleByArtistName(name)) {
				System.out.println(st);
			}
	//	System.out.println("The list of songs by "+name+" is:"+ml.filterSongTitleByArtistName(name));
		}
	}
	

}
