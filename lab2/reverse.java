
import java.util.*;

public class reverse{

	static int rev(int n){
		int new_n=0;


		while(n>0){
			new_n*=10;
			new_n+=n%10;
			n/=10; 			
		}		
		return new_n;		
	}	


	public static void main(String args[]){
		System.out.println("Enter a number:-");
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		
		System.out.println("Reverse number = "+rev(n));
		

	}
	



}
