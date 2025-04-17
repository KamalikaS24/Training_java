import java.util.*;
public class Anagram
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String arr[] = s1.split(" ");
		
		int len = arr.length;
		String ans="";
		int max =0;
		for(int i=0;i<len;i++)
		{
		    String ss = arr[i];
		    int Len = ss.length();
		    if(max < Len)
		    {
		        max = Len;
		        ans = ss;
		    }
		}
 		System.out.print(ans +" -> "+ max);
		
	}
}


