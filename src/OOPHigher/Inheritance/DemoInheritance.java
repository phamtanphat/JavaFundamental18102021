package OOPHigher.Inheritance;

public class DemoInheritance {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.name = "Animal1";
        animal1.weight = 1;

        animal1.eat();

        Cat cat1 = new Cat();
        cat1.name = "my cat1";
        cat1.weight = 2;

        cat1.eat();
    }
}