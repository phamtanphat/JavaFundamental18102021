public class OOP {
    public static void main(String[] args) {

        // object và class

//        int a = 10;
//
//        System.out.println(a);
//        System.out.println(teo);

        // Kiểu nguyên thủy : String , int , boolean , float
        // Kiểu vùng nhớ : Khởi tạo vùng nhớ để chứa giá trị
        Person teo = new Person();
        teo.name = "Nguyễn Văn Tèo";
        teo.age = 10;
        teo.address = "Long An";

        System.out.println("Tên " + teo.name);
        System.out.println("Tuổi " + teo.age);
        System.out.println("Địa chỉ " + teo.address);
    }
}
