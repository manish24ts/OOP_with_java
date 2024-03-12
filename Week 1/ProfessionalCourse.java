import java.lang.*;
import java.util.*;
class ProfessionalCourse
{
public static void main(String args[])
{
int p,m,c,total;
Scanner sc=new Scanner(System.in);
System.out.println("Enter phy,math,chem marks");
p=sc.nextInt();
m=sc.nextInt();
c=sc.nextInt();
total=p+m+c;
if(m>=60 && p>=50 && c>=40 && (total>=200 || m+p>=150))
System.out.println("You are eligible for the course");
else
System.out.println("You are not eligible for the course");
}
}