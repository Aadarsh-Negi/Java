package aadarsh;

import java.util.*;

class digit{
	int num;
	digit(int x){
		num=x;
	}
	
	int CountDigits() {
		int cnt=0;
		while(num>0) {
			cnt++;
			num/=10;
		}
		return cnt;
	}
	
}

public class A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a number:- ");
		int n = in.nextInt();
		
		digit obj =  new digit(n);
		System.out.print("" + obj.CountDigits());

	}

}
