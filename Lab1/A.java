import java.util.Scanner;
class A{

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);		

		System.out.println("Enter the number:- ");
		int n = in.nextInt();
		
		int a=0;
		int b=1;
		for(int i=0;i<n;i++){
		   System.out.print(a + " ");
		   
		   int temp=a;	 	   
	           a=b;
		   b=temp+b;	
		}

	}



}
