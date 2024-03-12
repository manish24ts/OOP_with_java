import java.lang.*;
import java.util.*;
class ConvertingDays
{
public static void main(String args[])
{
int n,days,weeks,months,years;
Scanner sc=new Scanner(System.in);
System.out.println("Enter total no. of days to convert");
n=sc.nextInt();
years=n/365;
months=(n%365)/12;
weeks=((n%365)/12)/7;
days=n-((years*365)+(months*12)+(weeks*7));
System.out.println(n+" days= " +years+" years "+months+" months "+weeks+ " weeks "+days+" days ");
}
}