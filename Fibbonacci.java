import java.util.*;
public class Fibbonacci
{   
    public static int fun(int n)
    {
        if(n<=1)
            return 1;
        return n*fun(n-1);
    }
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(fun(n));
	}
}
