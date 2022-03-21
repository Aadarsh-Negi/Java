
import java.util.*;

public class tran{
  // transpose of a matrix
	public static void main(String args[]){
		
		int n,m;		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter n:-");
		n=in.nextInt();

		System.out.println("Enter m:-");
		m=in.nextInt();

		
		
		int mat[][] = new int[n][m];
		
		for(int i=0;i<n;i++) for(int j=0;j<m;j++) mat[i][j]=in.nextInt();

		int tran[][] = new int[m][n];
		for(int i=0;i<n;i++) for(int j=0;j<m;j++) tran[j][i]=mat[i][j];
		
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++)
				System.out.print(tran[i][j] + " ");
			System.out.print("\n");
		}
		

	}
	



}
