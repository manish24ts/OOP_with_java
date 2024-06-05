import java.io.*;
import java.util.*;
class NumberingLine
{
    public static void main(String args[])
    {
        System.out.println("Enther the file name:");
        Scanner sc = new Scanner(System.in);
        String Fname = sc.next();
        File f = new File(Fname);
        int l = 0;
        try
        {
            FileReader a = new FileReader(f);
            BufferedReader b = new BufferedReader(a);
            String line;
            while((line=b.readLine())!=null)
            {
                l++;
                System.out.println(l+") "+line);
            }
        }
        catch(Exception e)
        {
            System.out.println("e");
        }
    }
}