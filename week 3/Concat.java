import java.util.*;
import java.io.*;
class Concat
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter two strings:");
String str1 = sc.nextLine();
String str2 = sc.nextLine();
String str3 = str1.concat(str2);
System.out.println(str3);
}
}