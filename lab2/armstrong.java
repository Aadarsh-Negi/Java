
import java.util.*;

public class armstrong{

	static boolean check(int n){
		int sum=0;
		int copy=n;

		while(copy>0){
			int l=copy%10;
			sum+=(l*l*l);
			copy/=10; 			
		}		
		return sum==n;		
	}	


	public static void main(String args[]){
		System.out.println("Enter a number:-");
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		
		if(check(n)) System.out.println("Armstrong number");
		else System.out.println("not an armstrong number");

	}
	



}
