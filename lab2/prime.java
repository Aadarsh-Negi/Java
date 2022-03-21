
import java.util.*;

public class prime{

	static boolean check(int n){
		if(n<=1) return false;

		for(int i=2;i*i<=n;i++) if(n%i==0) return false;
		
		return true;		
	}	


	public static void main(String args[]){
		System.out.println("Enter a number:-");
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		
		if(check(n)) System.out.println("Prime number");
		else System.out.println("not a prime number");

	}
	



}
