
abstract class Animal
{
    abstract void cat();
    abstract void dog();
}
abstract class Cats extends Animal
{
    void cat() {
        System.out.println("Cat MEOWS !");
    }
}
class Dogs extends Cats
{
    void dog() {
        System.out.println("Dog BARKS !");
    }
}
class AnimalDemo
{
    public static void main(String args[])
    {
        Dogs d = new Dogs();
        d.dog();
        d.cat();
    }
}