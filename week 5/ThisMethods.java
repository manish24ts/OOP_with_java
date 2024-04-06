class A
{
    A()
    {
        System.out.println("Hello A");
    }
    A(int x)
    {
        this();
        System.out.println(x);
    }
}
class ThisMethods
{
    public static void main(String args[])
    {
        A a = new A(5);
    }
}