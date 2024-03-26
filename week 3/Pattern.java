import java.util.*;
import java.io.*;
import java.lang.*;
class Pattern
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a word:");
String word = sc.nextLine();
int length = word.length();
for (int i = 0; i < length; i++) {
    if (i == length / 2) {
        System.out.println(word);
    } else {
        if (i != length) {
            System.out.println(word.charAt(i));
        } else {
            System.out.println();
        }
    }
}
}
}      

