import java.lang.*;
class Member
{
    String name,mobile,adress;
    int age;
    double salary;
    Member(String name,int age,String mobile,String adress,double salary)
    {
        this.name = name;
        this.age = age;
        this.mobile = mobile;
        this.adress = adress;
        this.salary = salary;
    }
    public void printDetails()
    {
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Mobile : "+mobile);
        System.out.println("Adress : "+adress);
        System.out.println("Salary : "+salary);
    }
}
class Employee extends Member
{
    String specialization;
    Employee(String specialization,String name,int age,String mobile,String adress,double salary)
    {
        super(name, age, mobile, adress, salary);
        this.specialization = specialization;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Specialization :"+ specialization);
    }
}
class Manager extends Member
{
    String destination;
    Manager(String destination,String name,int age,String mobile,String adress,double salary)
    {
        super(name, age, mobile, adress, salary);
        this.destination = destination;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Destination :"+destination);
    }
}
public class Company {
    public static void main(String args[])
    {
        Employee e = new Employee("CSIT","Manish",19,"9988778899","Hyderbad",1000000);
        e.printDetails();
        Manager m = new Manager("CSIT","Shobha",18,"7005606500","Hyderbad",1000000);
        m.printDetails();
    }
}
