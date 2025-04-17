0import java.util.Scanner;
public class Amicable
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n1=sc.nextInt();
	    int n2=sc.nextInt();
	   
	    
	    int sum=0;
	    int temp=n2;
	    
	    for(int i=1;i<n1;i++){
	        if(n1%i==0){
	            sum+=i;
	        }
	    }
	    if(sum==n2){
	        System.out.println("Amicable");
	    }
	    else{
	        System.out.println("Not amicable");
	}
	    }
		
}
