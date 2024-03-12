import java.lang.*;
import java.util.*;
class ThreeSubjectMarks
{
 public static void main(String[] args)
 {
    int a,b,c,s;
    float p;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter three subject marks");
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    s=(a+b+c);
    p=s/3;
    System.out.println("Percentage="+p+"%");
    if(p>=90)
    System.out.println("A grade");
    else if(p>=80 && p<90)
    System.out.println("B grade");
    else if(p>=70 && p<80)
    System.out.println("C grade");
    else if(p>=60 && p<70)
    System.out.println("D grade");
    else if(p>=50 && p<60)
    System.out.println("E grade");
    else if(p<50)
    System.out.println("Failed");
 }
}