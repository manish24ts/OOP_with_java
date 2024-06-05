import java.io.*;
import java.util.*;
class FileCount
{
    public static void main(String args[])
    {
        System.out.println("File names are :");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        File f = new File(name);
        String fList[] = f.list();
        int c=0;
        for(String fName:fList)
        {
            File f1 = new File(fName);
            if(f1.isFile())
            {
                System.out.println("File name "+ fName);
            }
            else if(f1.isDirectory())
            {
                System.out.println("Directory name "+ fName);
            }
            c++;
        }
        System.out.println("Total files "+ c);
    }
}