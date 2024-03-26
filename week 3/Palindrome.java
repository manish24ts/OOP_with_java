import java.util.*;
class Palindrome
{
public static void main(String args[])
{
String original, reverse = ""; // Objects of String class
int i;
Scanner in = new Scanner(System.in);
System.out.println("Enter a string/number to check if it is a palindrome");
original = in.nextLine();
int length = original.length();
for (i = length - 1; i>= 0; i-- )
reverse = reverse + original.charAt(i);
if (original.equals(reverse))
System.out.println("Entered string is a palindrome.");
else
System.out.println("Entered string isn't a palindrome.");
}
}