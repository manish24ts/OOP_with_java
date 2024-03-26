import java.util.*;
import java.io.*;
import java.lang.*;
class SubString
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter main string:");
String ms = sc.next();
System.out.println("Enter sub string:");
String ss = sc.next();
int i;
i = ms.indexOf(ss);
if(i>0)
System.out.println(ss+" is present in "+ms+" at "+i+" position");
else
System.out.println(ss+" is not present in "+ms);
}
}             