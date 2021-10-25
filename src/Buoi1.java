public class Buoi1 {
    // function
    public static void main(String[] args) {
        /*
         kieu dữ liệu
         String : kiểu chuỗi => 2 ký tự trở lên => "xin chao"
         int : kiểu số nguyên => đại diện cho số => 3
         float : kiểu số thực (số có phần thập phần 1.5) => 1.5
         boolean : kiểu lý luận (1 : true , 2 : false)

         khai báo biến
         type variable = value

        String name = "Phạm Tấn Phát";
         age = 28 (Number)
         address = Quận 1 (String)
         isMale (boolean)
         height : 1.75f
        int age = 28;
        String address = "Quận 10";
        boolean isMale = true;
        float height = 1.75f;
        String myFavorite = "Xem đá banh";


        System.out.println("Tên : " + name);
        System.out.println("Tuối : " + age);
        System.out.println("Địa chỉ : " + address);
        System.out.println("IsMale : " + isMale);
        System.out.println("Chiều cao : " + height);
        System.out.println("Sở thích " + myFavorite);


        Toán tử
        */

//        a += 1; // (a = a + 1)
//         a++
//         gán a trước
//         sau đó a = a + 1
//        int b = ++a;
//        System.out.println("a " + a);
//        System.out.println("b " + b);

        int a = 5;
        int b = 6;

        int ketQua = a++ - --b + --b - a++ + b-- - a-- - b++ - --a;

        // 5 - --b + --b - a++ + b-- - a-- - b++ - --a;  a = 6 , b = 6
        // 5 - 5 + --b - a++ + b-- - a-- - b++ - --a;  a = 6 , b = 5
        // 5 - 5 + 4 - a++ + b-- - a-- - b++ - --a;  a = 6 , b = 4
        // 5 - 5 + 4 - 6 + b-- - a-- - b++ - --a;  a = 7 , b = 4
        // 5 - 5 + 4 - 6 + 4 - a-- - b++ - --a;  a = 7 , b = 3
        // 5 - 5 + 4 - 6 + 4 - 7 - b++ - --a;  a = 6 , b = 3
        // 5 - 5 + 4 - 6 + 4 - 7 - 3 - --a;  a = 6 , b = 4
        // 5 - 5 + 4 - 6 + 4 - 7 - 3 - 5;  a = 5 , b = 4
        //  -13 ;  a = 5 , b = 4
        System.out.println("a " + a);
        System.out.println("b " + b);
        System.out.println("ketqua " + ketQua);

    }
}


