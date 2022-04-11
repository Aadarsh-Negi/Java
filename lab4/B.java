package aadarsh;

import java.util.*;

class prime{
	int x,y;
	prime(int x,int y){
		this.x = x;
		this.y = y;
	}
	void GetPrimes() {
		
		for(int i=x;i<=y;i++) {
			boolean ok = true;
			if(i==1) ok=false;
			for(int j=2;j*j<=i;j++) {
				if(i%j==0) {
					ok = false;
					break;
				}
			}
			if(ok) System.out.print(i+" ");
		}
		
	}
	
}

public class B {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a range l to r:- ");
		int l = in.nextInt();
		int r = in.nextInt();
		
		prime obj =  new prime(l,r);
		obj.GetPrimes();
	}

}
