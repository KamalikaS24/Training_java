import java.io.*;
import java.util.*;

public class Circular_prime
{
    public static boolean isprime(int n)
    {
        if (n <= 1) return false;
        for(int i = 2; i <= Math.sqrt(n); i++)
        {
            if(n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = Integer.toString(n);
        int c = s.length();
        int h = c;
        int g = n;
        
        while(h-- > 0)
        {
            int rem = g % 10;
            g = (rem * (int)(Math.pow(10, c-1))) + (g / 10);
            
            if(!isprime(g))
            {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
