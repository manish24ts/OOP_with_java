import java.util.*;
class SingleCatch{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] a = {10,20,30,40};
        System.out.println("Enter index and denominators");
        String i = sc.next();
        String d = sc.next();
        try
        {
            int index = Integer.parseInt(i);
            int D = Integer.parseInt(d);
            double res = a[index]/D;
            System.out.println(res);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}