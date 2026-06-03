class Animal {

    void makeSound() {
        System.out.println("Animals produce sounds");
    }
}

class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Bark Bark!");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {

        Animal a = new Animal();
        Dog d = new Dog();

        a.makeSound();
        d.makeSound();
    }
}