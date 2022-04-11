package aadarsh;

import java.util.*;

class LargestSmallest{
	
	void GetSmallLarge(int ar[]) {
		int small = Integer.MAX_VALUE;
		int lar = Integer.MIN_VALUE;

		for(int i:ar) {
			lar = Math.max(lar, i);
			small = Math.min(small, i);
		}
		System.out.println("Smallest - " + small);
		System.out.println("Largest - " + lar);
	}
	
}

public class C {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter size of array:- ");
		int n = in.nextInt();
		
		int ar[] = new int[n];
		for(int i=0;i<n;i++) ar[i] = in.nextInt();
		
		
		LargestSmallest obj =  new LargestSmallest();
		obj.GetSmallLarge(ar);
	}

}
