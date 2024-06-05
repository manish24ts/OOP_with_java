import java.io.*;
import java.util.*;
class Append
{
    public static void main(String args[])
    {
        System.out.println("Enter the file name:");
        Scanner sc = new Scanner(System.in);
        String Fname = sc.next();
        try
        {
            String line;
            FileOutputStream b = new FileOutputStream(Fname,true);
            System.out.println("Enter the string:");
            line = sc.next();
            String l = line + "\n";
            b.write(l.getBytes());
            b.flush();
        }
        catch(Exception e)
        {
            System.out.println("e");
        }
        System.out.println("String inserted successfully");
    }
}