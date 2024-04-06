class Animal
{
    void SetName()
    {
        System.out.println("This is Animal class");
    }
}
class Dog extends Animal
{
    void dog()
    {
        System.out.println("This is dog class");
    }
}
class SingleInheritance
{
    public  static  void  main(String args[])
    {
        Dog d = new Dog();
        d.dog();
        d.SetName();
    }
}