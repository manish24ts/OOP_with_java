import java.io.*;
import java.util.*;
class FileExistsOrNot
{
    public static void main(String args[])
    {
        System.out.println("Enter the file name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        File f = new File(name);
        if(f.exists())
        {
            System.out.println("The name of the file is "+ f.getName());
            if(f.canRead())
            {
                System.out.println("The file is readable");
            }
            else
            {
                System.out.println("The file is not readable");
            }
            if(f.canWrite())
            {
                System.out.println("The file is writable");
            }
            else
            {
                System.out.println("The file is not writable");
            }
            System.out.println("The length of the file is "+ f.length());
        }
        else
            System.out.println("The file doesnt exist");
    }
}