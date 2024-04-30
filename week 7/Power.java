import java.util.*;
class PowerFunctionException extends RuntimeException
{
    PowerFunctionException(String s)
    {
        System.out.println(s);
    }
}
class Power{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number and power:");
        int  n = sc.nextInt();
        int  p = sc.nextInt();
        if(n<0 || p<0)
        {
            throw new PowerFunctionException("Number or power should not be negative");
        }
        else if(n==0 && p==0)
        {
            throw new PowerFunctionException("Number and power cant be negative");
        }
        else
        {
            System.out.println("answer is "+ Math.pow(n,p));
        }
    }
}