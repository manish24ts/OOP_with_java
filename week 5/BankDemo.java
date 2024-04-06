abstract class Bank
{
    abstract void getBalance();
}
class A extends Bank
{
    double balance = 100;
    void getBalance()
    {
        System.out.println("Balance is: "+ balance);
    }

}
class B extends Bank
{
    double balance = 150;
    void getBalance()
    {
        System.out.println("Balance is: "+ balance);
    }
}
class C extends Bank
{
    double balance = 200;
    void getBalance()
    {
        System.out.println("Balance is: "+ balance);
    }
}
class BankDemo
{
    public static void main(String args[])
    {
        A a = new A();
        a.getBalance();
        B b = new B();
        b.getBalance();
        C c = new C();
        c.getBalance();
    }
}