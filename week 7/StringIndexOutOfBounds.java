import java.util.*;
class StringIndexOutOfBounds{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string and index");
        String s = sc.next();
        int i = sc.nextInt();
        try
        {
            System.out.println(s.charAt(i));
        }
        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
    }
}