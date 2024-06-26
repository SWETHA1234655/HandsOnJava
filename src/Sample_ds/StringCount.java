package Sample_ds;
import java.util.Scanner;
public class StringCount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
//		int n=sc.nextInt();
//		System.out.println("1 str:");
//		String[] str1=new String[n];
//		
//		System.out.println("1 str values:");
//		for(int i=0;i<str1.length;i++) {
//			str1[i]=sc.next();
//		}
//		
//		int n1=sc.nextInt();
//		System.out.println("2 str");
//		String[] str2=new String[n1];
//		System.out.println("2 str values:");
//		for(int i=0;i<str2.length;i++) {
//			str2[i]=sc.next();
//		}
//		
	//	System.out.println("1 str:");
        String[] str1={"abc","abc","ab"};
        
        
   //     System.out.println("2 str");
        String[] str2={"abc","ab"};
		
		//int[] result=new int[str2.length];
		int i;
		//int j=0;
		for(i=0;i<str2.length;i++) {
			int count=0;
			for(int j=0;j<str1.length;j++) {
				if(str2[i].equals(str1[j])) {
					count ++;
					//System.out.println(str2[i]);
					//i++;
				}
			}		
			System.out.println(count+" ");
		}
		
		
		
		//j++;
		
	
		
	}

}
