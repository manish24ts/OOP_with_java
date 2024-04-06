class ParentClass
{
    int a;
    void SetData(int a)
    {
        this.a = a;
    }
}
class SubClass1 extends ParentClass
{
    void DisplayData()
    {
        System.out.println("a = "+a+" sub class 1");
    }
}
class SubClass2 extends ParentClass
{
    void DisplayData()
    {
        System.out.println("a = "+a+" sub class 2");
    }
}
class HieraricalInheritance
{
    public static void main(String args[])
    {
        SubClass1 s1 = new SubClass1();
        SubClass2 s2 = new SubClass2();
        s1.SetData(100);
        s1.DisplayData();
        s2.SetData(200);
        s2.DisplayData();
    }
}