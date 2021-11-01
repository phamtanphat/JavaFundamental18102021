public class Person {
    // 1 : Thuộc tính : thể hiện của lớp đối tượng
    String name;
    int age;
    String address;

    // 2 : Phương thức
    public void showInfo(){
        System.out.println("Name " + name);
        System.out.println("Age " + age);
        System.out.println("Address " + address);
    }

    // 3 : Phương thức khởi tạo (constructor)
    public Person(String name , int age , String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

}
