import java.util.*;
import java.io.*;
import java.lang.*;
class UpperLower
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string:");
String str1 = sc.nextLine();
StringBuffer newStr = new StringBuffer(str1);
for(int i = 0;i<str1.length();i++)
{
    
    char ch = str1.charAt(i);
    if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z')
    {
    if(Character.isLowerCase(ch))
    newStr.setCharAt(i, Character.toUpperCase(ch));
    else
    newStr.setCharAt(i, Character.toLowerCase(ch));
    }
}
System.out.println("Modified string: "+ newStr);
}
}             