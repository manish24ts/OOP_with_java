import java.io.*;
import java.util.*;
class DeleteFile
{
    public static void main(String args[])
    {
        System.out.println("Enther the file name:");
        Scanner sc = new Scanner(System.in);
        String Fname = sc.next();
        File f = new File(Fname);
        if(f.delete())
        {
            System.out.println("Deleted the file: "+ f.getName());
        }
        else
        {
            System.out.println("The file "+ f.getName() + "does not exists");
        }
    }
}