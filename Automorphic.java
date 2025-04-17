import java.util.Scanner;
public class Automorphic
{
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int rem;
    int c=0;
    int ans=0;
    int temp=num;
    int newnum=num;
    while(num!=0)
    {
      num/=10;
      c++;
    }
    while(temp!=0){
      rem=temp%10;
      ans+=Math.pow(rem,c);
      temp=temp/10;
  }
    if(ans==newnum){
      System.out.print("true");
    }
    else{
      System.out.print("false");
    }
  }
}