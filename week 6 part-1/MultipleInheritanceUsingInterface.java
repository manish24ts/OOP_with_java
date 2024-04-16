
import java.lang.*;
interface A
{ public void meth1();
}
interface B
{ public void meth2();
}
class MyClass implements A,B
{ public void meth1()
{ System.out.println("Method 1");
}
    public void meth2()
    { System.out.println("Method 2");
    }
}
public class MultipleInheritanceUsingInterface
{ public static void main(String args[])
{ MyClass d=new MyClass();
    d.meth1();
    d.meth2();
}}