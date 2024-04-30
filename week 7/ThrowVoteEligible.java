import java.util.*;
class ThrowVoteEligible{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = sc.nextInt();
        if(age<18)
        {
            System.out.println("Not eligible");
            throw new NotEligibleToVoteException("Age less than 18");
        }
        else
        {
            System.out.println("Eligible to vote");
        }
    }
}
class NotEligibleToVoteException extends RuntimeException
{
    NotEligibleToVoteException(String s)
    {
        super(s);
    }
}