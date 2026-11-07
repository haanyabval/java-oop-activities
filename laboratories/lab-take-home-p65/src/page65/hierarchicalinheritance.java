// Laboratory Take Home: Bank Account (Abstraction) and Hierarchical Inheritance (Laboratory Activity Take Home, p. 65)
package page65;

public class hierarchicalinheritance {
    // Parent class
    static class Animal {
        String name;
        Animal(String name) {
            this.name = name;
        }
        void eat() {
            System.out.println(name + " is eating.");
        }
    }
    // Child class 1
    static class Dog extends Animal {
        Dog(String name) {
            super(name);
        }
        void bark() {
            System.out.println(name + " says: Woof woof!");
        }
    }
    // Child class 2
    static class Cat extends Animal {
        Cat(String name) {
            super(name);
        }
        void meow() {
            System.out.println(name + " says: Meow meow!");
        }
    }
    // Main Method
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Kitty");
        dog.eat();
        dog.bark();
        System.out.println();
        cat.eat();
        cat.meow();
    }
}
