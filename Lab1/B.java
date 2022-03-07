import java.util.Scanner;
class B{

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);		

		System.out.println("Perfect number:- ");
		//int n = in.nextInt();
		

		for(int i=1;i<=1000;i++){
		  int sum=1;
		  
		  for(int j=2;j*j<=i;j++){
		  	if(i%j==0){
                           sum+=j;
			   if(j!=i/j) sum+=(i/j);			
			}
		  } 
		    			
	
      		  if(sum==i)
	             System.out.print(i + " ");
		}

	}



}
