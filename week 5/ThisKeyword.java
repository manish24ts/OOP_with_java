class A
{
    void m()
    {
        System.out.println("Hello CSIT");
    }
    void n()
    {
        System.out.println("Hello Students");
        this.m();
        m();
    }
}
class ThisKeyword
{
    public static void main(String args[])
    {
        A a = new A();
        a.n();
    }
}