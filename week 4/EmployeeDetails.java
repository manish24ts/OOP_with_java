class Employee{
    String name,email;
    int id;
    Employee(String name)
    {
        this.name = name;
    }
    Employee(String name,String email)
    {
        this.name = name;
        this.email = email;
    }
    Employee(String name,String email,int id)
    {
        this.name = name;
        this.email = email;
        this.id = id;
    }
    public void printName(){
        System.out.println("Name: "+name);
    }
    public void printNameEmail(){
        System.out.println("Name: "+name);
        System.out.println("Email: "+email);
    }
    public void printDetails(){
        System.out.println("Name: "+name);
        System.out.println("Email: "+email);
        System.out.println("ID :"+id );
    }
    public static void main(String[] args) {
        Employee a = new Employee("Chobha");
        a.printName();
        a.printDetails();
        Employee b = new Employee("Alice", "ALice@gmail.com");
        b.printName();
        b.printNameEmail();
        b.printDetails();
        Employee c = new Employee("Alice", "ALice@gmail.com",1022);
        c.printName();
        c.printNameEmail();
        c.printDetails();
    }
}