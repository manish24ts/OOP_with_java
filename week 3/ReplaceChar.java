import java.util.*;
import java.io.*;
import java.lang.*;
class ReplaceChar
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string:");
String str = sc.nextLine();
System.out.println("Enter a char to replace:");
char c = sc.next().charAt(0);
System.out.println("Enter a new char to replace with:");
char nc = sc.next().charAt(0);
String str1 = str.replace(c,nc);
System.out.println(str1);
}
}             