import java.util.Scanner;
class C{

	public static void main(String[] args){
				
	Scanner in = new Scanner(System.in);		

		System.out.println("Armstrong number:- ");
		//int n = in.nextInt();
		

		for(int i=1;i<=1000;i++){
		  int sum=0;
		  int n = i;
		  
		  while(n>0){
		    int rem = n%10;
		    sum+=(rem*rem*rem);
		    n/=10;
	          } 
		    			
	
      		  if(sum==i)
	             System.out.print(i + " ");
		}

	}



}
