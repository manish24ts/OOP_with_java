import java.io.*;
import java.util.*;
class NumberCharacters
{
    public static void main(String args[])
    {
        System.out.println("Enter the file name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        File f = new File(name);
        int l=0,w=0,c=0;
        try
        {
            FileReader a = new FileReader(f);
            BufferedReader b = new BufferedReader(a);
            String line;
            while((line = b.readLine())!= null)
            {
                l++;
                String word[] = line.split(" ");
                for(String str:word)
                {
                    w++;
                    c = c + str.length();
                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("The no. of lines are "+ l);
        System.out.println("The no. of words are "+ w);
        System.out.println("The no. of characters are "+ c);
    }
}