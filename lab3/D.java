import java.util.*;
public class D
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("1. for Term Deposit");
        System.out.println("2. for Recurring Deposit");
        System.out.print("Enter your choice: ");
        int ch = in.nextInt();
        double p = 0.0, r = 0.0, a = 0.0;
        int n = 0;
        
        switch (ch) {
            case 1:
                System.out.print("Enter Principal: ");
                p = in.nextDouble();
                System.out.print("Enter Interest Rate: ");
                r = in.nextDouble();
                System.out.print("Enter time in years: ");
                n = in.nextInt();
                a = p * Math.pow(1 + r / 100, n);
                System.out.println("Maturity amount = " + a);
                break;
            case 2:
                System.out.print("Enter Monthly Installment: ");
                p = in.nextDouble();
                System.out.print("Enter Interest Rate: ");
                r = in.nextDouble();
                System.out.print("Enter time in months: ");
                n = in.nextInt();
                a = p*n + p*((n*(n + 1))/2)*(r / 100) * (1/12.0);
                System.out.println("Maturity amount = " + a);
                break;
            default:
            System.out.println("Invalid choice");
        }
    }
}