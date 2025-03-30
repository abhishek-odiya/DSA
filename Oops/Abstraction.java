package DSA.Oops;

abstract class Animal{
    abstract void walk();

    Animal() {
        System.out.println("You are Creating a new Animal");
    }

    public void eat() {
        System.out.println("Animal eats");
    }
}


class Horse extends Animal{

    Horse() {
        System.out.println("Created a Horse");
    }

    public void walk() {
        System.out.println("Walks on 4 lags.");
    }
}


class Chicken extends Animal{
    public void walk() {
        System.out.println("Walks on 2 lags.");
    }
}


public class Abstraction {
    public static void main(String[] args) {
        Horse hor = new Horse();
        hor.walk();
        hor.eat();

    }
}
