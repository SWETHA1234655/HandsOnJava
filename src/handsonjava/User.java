package handsonjava;

import java.util.StringTokenizer;

public class User {
	public static int CountWords(String s1,String s2){
		StringTokenizer st=new StringTokenizer(s1, " ");
		int c = 0;
		while(st.hasMoreTokens())
		{
			String s3 = st.nextToken();
			if(s3.equals(s2))
			{
				c++;
			}
		}
		return c;
	}

}
