
class Employee {
    private String name;
    private double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public double calculateSalary() {
        return baseSalary;
    }

    public String getName() {
        return name;
    }
}
class Manager extends Employee {
    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }
    @Override
    public double calculateSalary() {
        return super.calculateSalary() + bonus;
    }
}

// Subclass Engineer
class Engineer extends Employee {
    public Engineer(String name, double baseSalary) {
        super(name, baseSalary);
    }
}
class Salesperson extends Employee {
    private double salesCommission;

    public Salesperson(String name, double baseSalary, double salesCommission) {
        super(name, baseSalary);
        this.salesCommission = salesCommission;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + salesCommission;
    }
}
public class EmployeePayrollSystem {
    public static void main(String[] args) {
        Employee manager = new Manager("John Doe", 50000, 10000);
        Employee engineer = new Engineer("Alice Smith", 60000);
        Employee salesperson = new Salesperson("Bob Johnson", 40000, 5000);

        // Calculate and print salaries
        System.out.println("Salary of " + manager.getName() + ": $" + manager.calculateSalary());
        System.out.println("Salary of " + engineer.getName() + ": $" + engineer.calculateSalary());
        System.out.println("Salary of " + salesperson.getName() + ": $" + salesperson.calculateSalary());
    }
}
