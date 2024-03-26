import java.util.*;
import java.io.*;
import java.lang.*;
//Not sure about this code as well
class Frequency {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();
        int[] freq = new int[str.length()];
        int i, j;
        char[] string = str.toCharArray();

        for (i = 0; i < str.length(); i++) {
            freq[i] = 1;
        }

        for (j = 0; j < str.length() - 1; j++) {
            if (string[j] == string[j + 1]) {
                freq[j]++;
                string[j + 1] = '0';
            }
        }

        System.out.println("Character and their corresponding frequencies: ");

        for (i = 0; i < freq.length; i++) {
            if (string[i] != '0') {
                System.out.println(string[i] + " " + freq[i]);
            }
        }
    }
}