import java.io.*;
import java.util.*;
class FileCopy
{
    public static void main(String args[])
    {
        System.out.println("Enter the file name:");
        Scanner sc = new Scanner(System.in);
        String Fname = sc.next();
        File f = new File(Fname);
        try
        {
            FileReader a = new FileReader(f);
            BufferedReader b = new BufferedReader(a);
            String line;
            FileWriter fileWriter = new FileWriter("Output.txt");
            while((line=b.readLine())!=null)
            {
                fileWriter.write(line+"\n");
                fileWriter.flush();
            }
            System.out.println("File copied successfully");
            fileWriter.close();
            b.close();
        }
        catch(Exception e)
        {
            System.out.println("e");
        }
    }
}