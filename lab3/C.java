import java.util.*;

public class C{

    static int replace(int n){
        int res=0;
        
        int f=1;

        while(n>0){
            int last = n%10;
            last = Math.max(1,last);
            last*=f;
            res+=last;
            n/=10;
            f*=10;
        }


        return res;

    }

    public static void main(String[] args){
        
        Scanner in =  new Scanner(System.in);
            System.out.print("enter the value of n:- ");

        int n = in.nextInt();

        int res = replace(n);
        

        
         System.out.print("new number:- "+ res);





        

    }
}