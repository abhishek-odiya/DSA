package DSA.Oops;

// Interface main Constructor nahi bana sakte hai
// Static

interface Bird{

    public void fly();
}


interface Herbivore {
}


class Bees implements Bird, Herbivore{           //This is how we implement Multiple inheritance
    public void fly() {
        System.out.println("They fly");
    }
}

public class Interface {
    public static void main(String[] args) {

        Bees b = new Bees();
        b.fly();

    }
}
