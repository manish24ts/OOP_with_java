import java.util.*;
import java.io.*;
import java.lang.*;
class Copy
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter string:");
String strOrig = sc.nextLine();
String strCopy;
strCopy = strOrig;
System.out.println("String original: "+ strOrig);
System.out.println("String copied: "+ strCopy);
}
}             