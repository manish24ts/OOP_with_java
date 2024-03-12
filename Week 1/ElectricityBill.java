import java.lang.*;
import java.util.*;
class ElectricityBill
{
 public static void main(String[] args)
 {
    double eb,nu;
    String name;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter number of units");
    nu=sc.nextInt();
    System.out.println("Enter name");
    name = sc.next();
     if(nu<=200)
      eb = nu*0.8;
    else if(nu>200 && nu<=300)
      eb = nu*0.9;
    else 
     eb = nu;
    if(eb<100)
eb=100;
if(eb>400)
eb = eb + eb*0.15;
      System.out.println("Consumer name "+name);
      System.out.println("Electricity bill is "+eb);
}
}