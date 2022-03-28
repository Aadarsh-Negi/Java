import java.util.*;
public class B{

    static int getSum(int n){
        int res=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                res+=i;
                if(i!=n/i) res+=n/i;
            }
        }
        return res;

    }

    public static void main(String[] args){
        
        Scanner in =  new Scanner(System.in);
            System.out.print("enter the value of n and m :- ");

        int n = in.nextInt();
        int m = in.nextInt();

        int sumN = getSum(n);
        int sumM = getSum(m);

        if(sumN/n == sumM/m) System.out.print("friendly pair");
        else System.out.print("not a friendly pair");





        

    }
}