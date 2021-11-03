package OOPHigher.Inheritance;

public class DemoInheritance {
    public static void main(String[] args) {
//        Animal animal1 = new Animal();
//        animal1.name = "Animal1";
//        animal1.weight = 1;
//
//        animal1.eat();
//
//        Cat cat1 = new Cat();
//        cat1.name = "my cat1";
//        cat1.weight = 2;
//
//        cat1.eat();

//        Animal animal = new Cat();
//
//        animal.name = "Cat";

        // runtime
        Cat cat = new Cat("Cat 1 ", 1 ,"Grey");
        cat.eat();
        System.out.println(cat);
        // over load : phương thức  nạp chồng

        showMessage("Error",new Throwable("Lỗi 404"));
    }

    public static void showMessage(String message){
        System.out.println(message);
    }

    public static void showMessage(String message , Throwable t){
        System.out.println(message);
        System.out.println(t.getMessage());
    }
}
