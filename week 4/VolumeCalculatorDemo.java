import java.util.Scanner;

public class VolumeCalculatorDemo{
    public void CalculateVolume(int side){
        double volume = side*side*side;
        System.out.println("volume of cude :"+volume);
    }
    public void CalculateVolume(double length,double height,double width){
        double volume = length*height*width;
        System.out.println("volume of cudoid :"+volume);
    }
    public void CalculateVolume(double radius){
        double volume = (4.0/3.0)*Math.PI*Math.pow(radius, 3);
        System.out.println("volume of Sphere :"+volume);
    }
    public static void main(String[] args) {
        VolumeCalculatorDemo volumeCalculator = new VolumeCalculatorDemo();
        System.out.println("Enter side of cude");
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        volumeCalculator.CalculateVolume(side);
        System.out.println("Enter length, height and breadth of cuboid"); 
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        int height = sc.nextInt();
        volumeCalculator.CalculateVolume(length, height, breadth);
        System.out.println("Enter radius");
        double radius = sc.nextDouble();
        volumeCalculator.CalculateVolume(radius);
    }
}