import java.util.Random;

public class RandomDemo {

    public static void main(String[] args) {

        Random rand = new Random();

        System.out.println("Integer random number: " + rand.nextInt());

        System.out.println("Integer random number from 0 to 100: " + rand.nextInt(100));

        System.out.println("Boolean random value: " + rand.nextBoolean());

        System.out.println("Double random number: " + rand.nextDouble());

        System.out.println("Float random number: " + rand.nextFloat());

        System.out.println("Long random number: " + rand.nextLong());

        System.out.println("Gaussian random number: " + rand.nextGaussian());
    }
}
