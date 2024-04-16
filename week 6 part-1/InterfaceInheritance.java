import java.lang.*;
interface A
{ public void meth1();
}
interface B extends A
{ public void meth2();
}
class MyClass implements B
{ public void meth1()
{ System.out.println("This is method1");
}
    public void meth2()
    { System.out.println("This is method2");
    }
}
public class InterfaceInheritance
{ public static void main(String args[])
{ MyClass d=new MyClass();
    d.meth1();
    d.meth2();
}}