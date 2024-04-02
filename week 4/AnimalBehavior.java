class Animal {
    public void makeSound() {
        System.out.println("Animal makes a generic sound");
    }

    public void move() {
        System.out.println("Animal moves in a generic way");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }

    @Override
    public void move() {
        System.out.println("Dog walks or runs");
    }
}
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }

    @Override
    public void move() {
        System.out.println("Cat walks or jumps");
    }
}

class Bird extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bird chirps");
    }

    @Override
    public void move() {
        System.out.println("Bird flies");
    }
}

public class AnimalBehavior {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();
        dog.move();

        Animal cat = new Cat();
        cat.makeSound();
        cat.move();

        Animal bird = new Bird();
        bird.makeSound();
        bird.move();
    }
}
