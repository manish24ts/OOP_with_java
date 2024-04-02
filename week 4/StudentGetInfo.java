class Student
{
    public void GetInfo()
    {
        System.out.println("I am Student");
    }
}
class undergrad extends Student
{
    @Override
    public void GetInfo()
    {
        System.out.println("I am under grad");
    } 
}
class postGrad extends Student
{
    @Override
    public void GetInfo()
    {
        System.out.println("I am post grad");
    } 
}
class Doctorate extends Student
{
    @Override
    public void GetInfo()
    {
        System.out.println("i am doing Doctorate");
    } 
}
class StudentGetInfo
{
    public static void main(String[] args) {
        Student std = new Student();
        Student std1 = new undergrad();
        Student std2 = new postGrad();
        Student std3 = new Doctorate();
        std.GetInfo();
        std1.GetInfo();
        std2.GetInfo();
        std3.GetInfo();
    }
}
