import java.lang.*;
interface A
{ public void meth1();
    public void meth2();
}
class MyClass implements A
{ public void meth1()
{ System.out.println("This is implementation of method1");
}
    public void meth2()
    { System.out.println("This is implementation of method2");
    }}
public class Implements
{ public static void main(String args[])
{ MyClass d=new MyClass();
    d.meth1();
    d.meth2();
}}