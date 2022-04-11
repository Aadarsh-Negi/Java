package aadarsh;

import java.util.*;

class factorial{
	
	void GetAll(int ar[]) {
		
		for(int i:ar) {
			long res = 1;
			for(int j = 1;j<=i;j++) res*=j;
			
			System.out.println("Factorial of " + i + " = " + res);	
		}
	}
	
}

public class D {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter size of array:- ");
		int n = in.nextInt();
		
		int ar[] = new int[n];
		for(int i=0;i<n;i++) ar[i] = in.nextInt();
		
		
		factorial obj =  new factorial();
		obj.GetAll(ar);
	}

}
