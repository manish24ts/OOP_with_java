import java.util.*;
class InsufficientFundsException extends RuntimeException
{
    InsufficientFundsException(String s)
    {
        System.out.println(s);
    }
}
class ThrowBalance{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double bal = 100000;
        System.out.println("Enter withdrawal amount:");
        double w = sc.nextDouble();
        if(w<bal)
        {
            bal = bal - w;
            System.out.println("Withdrawal successful");
        }
        else
        {
            throw new InsufficientFundsException("Low balance");
        }
    }
}