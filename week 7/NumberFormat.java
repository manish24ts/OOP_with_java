import java.util.*;
class NumberFormat{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        String n1 = sc.next();
        String n2 = sc.next();
        try
        {
            int a = Integer.parseInt(n1);
            int b = Integer.parseInt(n2);
            double res = a/b;
            System.out.println(res);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(NumberFormatException e)
        {
            System.out.println(e);
        }
    }
}