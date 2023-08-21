// Superclass
class AnimalCategory {
    String name;

    AnimalCategory(String name) {
        this.name = name;
    }

    void speak() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass inheriting from Animal
class Dog extends AnimalCategory {
    Dog(String name) {
        super(name); // Calling the superclass constructor
    }

    @Override
    void speak() {
        System.out.println("Dog barks");
    }
}

// Subclass inheriting from Animal
class Cat extends AnimalCategory {
    Cat(String name) {
        super(name); // Calling the superclass constructor
    }


    void speak() {
        System.out.println("Cat meows");
    }
}

public class Animal {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");

        System.out.println("Dog's name: " + dog.name);
        dog.speak();

        System.out.println("Cat's name: " + cat.name);
        cat.speak();
    }
}
