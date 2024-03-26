import java.util.*;
import java.io.*;
import java.lang.*;
class Compare
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter two string:");
String str1 = sc.nextLine();
String str2 = sc.nextLine();
if(str1.equals(str2))
System.out.println("Equal");
else
System.out.println("Not Equal");
}
}             