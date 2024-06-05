import java.io.*;
import java.util.*;
class FileExists
{
    public static void main(String args[])
    {
        System.out.println("Enter the file name:");
        Scanner sc = new Scanner(System.in);
        String Fname = sc.next();
        File f = new File(Fname);
        try
        {
            if(f.exists())
            {
                System.out.println("File exists");
            }
            else
            {
                f.createNewFile();
                System.out.println("File created "+ f.getName());
            }
        }
        catch(Exception e)
        {
            System.out.println("e");
        }
    }
}