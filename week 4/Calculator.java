import java.util.Scanner;

class Calculator{
    public int add(int num1,int num2){
        return num1 + num2;
    }
    public int subtract(int num1,int num2){
        return num1 - num2;
    }
    public int multiply(int num1,int num2){
        return num1 * num2;
    }
    public double divide(int num1,int num2){
       if(num2==0){
        throw new ArithmeticException("Cannot divide with zero");
       }
       return num1/num2 ;
    }
    public double add(double num1,double num2){
        return num1 + num2;
    }
    public double subtract(double num1,double num2){
        return num1 - num2;
    }
    public double multiply(double num1,double num2){
        return num1 * num2;
    }
    public double divide(double num1,double num2){
       if(num2==0){
        throw new ArithmeticException("Cannot divide with zero");
       }
       return num1/num2 ;
    }
    public static void main(String[] args) {
        Calculator calci = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Addition :"+calci.add(a, b));
        System.out.println("Subtraction :"+calci.subtract(a, b));
        System.out.println("Multiplication :"+calci.multiply(a, b));
        System.out.println("DIvision :"+calci.divide(a, b));
        System.out.println("Enter two double values:");
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        System.out.println("Addition :"+calci.add(c,d));
        System.out.println("Subtraction :"+calci.subtract(c,d));
        System.out.println("Multiplication :"+calci.multiply(c,d));
        System.out.println("DIvision :"+calci.divide(c,d));
    }
}