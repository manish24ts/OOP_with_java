import java.util.*;
import java.io.*;
import java.lang.*;
class RemoveChar
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter main string:");
String str = sc.next();
System.out.println("String :" +str);
System.out.println("Enter position:");
int pos = sc.nextInt();
String res = str.substring(0,pos)+str.substring(pos+1);
System.out.println("String after removing a character: "+res);
}
}             