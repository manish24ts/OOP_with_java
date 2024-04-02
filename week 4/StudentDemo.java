class Student
{
    String name;
    int age;
    String address;
    public Student(){
        this.name = "Unknown";
        this.age = 0;
        this.address = "Not available";
    }
    public void SetInfo(int age,String name) {
        this.name = name;
        this.age = age;
    }
    public void SetInfo(int age,String name,String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public void displayDetails(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Address :"+address);
    }
}
public class StudentDemo{
    public static void main(String[] args) {
        Student st = new Student();
        st.displayDetails();
        st.SetInfo(30, "Hi");
        st.displayDetails();
        st.SetInfo(30, "Hello", "hyd");
        st.displayDetails();
    }
}