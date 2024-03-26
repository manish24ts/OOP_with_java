import java.util.*;
import java.io.*;
public class ReverseString
{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string: ");
String s1 = sc.nextLine();
System.out.println("Original string: "+s1);
StringBuilder reverseString = new StringBuilder(s1);
reverseString.reverse(); 
String result = reverseString.toString();
System.out.println("Reversed string: "+result); 
}
}