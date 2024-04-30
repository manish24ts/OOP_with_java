import java.util.*;
class NullPointer{
    public static void main(String args[]){
        int Array[] = null;
        try
        {
            System.out.println("Array length is "+ Array.length);
        }
        catch(NullPointerException e)
        {
            System.out.println(e);
        }
    }
}