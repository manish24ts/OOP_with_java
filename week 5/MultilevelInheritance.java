class SuperClass
{
    int x;
    void Set()
    {
        System.out.println("I am in Super Class");
    }
}
class SubClass extends SuperClass
{
    int y;
    void Set1()
    {
        System.out.println("I am in sub class");
    }
}
class SubClass1 extends SubClass
{
    int z;
    void Set2()
    {
        System.out.println("I am in sub class 1");
    }
}
class MultilevelInheritance
{
    public static void main(String args[])
    {
        SubClass1 s = new SubClass1();
        s.x = 10;
        s.y = 20;
        s.z = 30;
        System.out.println("x = "+s.x+" y = "+s.y+" z = "+s.z);
        s.Set();
        s.Set1();
        s.Set2();
    }
}