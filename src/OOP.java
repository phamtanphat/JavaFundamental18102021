public class OOP {
    public static void main(String[] args) {

        // object và class

//        int a = 10;
//
//        System.out.println(a);
//        System.out.println(teo);

        // Kiểu nguyên thủy : String , int , boolean , float
        // Kiểu vùng nhớ : Khởi tạo vùng nhớ để chứa giá trị

        // ctrl : P : xem gợi ý
        Person teo = new Person("Nguyễn Văn Tèo",10 , "Long An");
//        teo.name = "Nguyễn Văn Tèo";
//        teo.age = 10;
//        teo.address = "Long An";

        teo.showInfo();
//        System.out.println(teo.name);
    }
}
