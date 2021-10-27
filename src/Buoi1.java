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

        a += 1; // (a = a + 1)
         a++
         gán a trước
         sau đó a = a + 1
        int b = ++a;
        System.out.println("a " + a);
        System.out.println("b " + b);

        int a = 5;
        int b = 6;

        int ketQua = ++a - --b - --a - b-- + a-- + b-- - b++;
         6 - --b - --a - b-- + a-- + b-- - b++; a = 6 , b = 6
         6 - 5 - --a - b-- + a-- + b-- - b++; a = 6 , b = 5
         6 - 5 - 5 - b-- + a-- + b-- - b++; a = 5 , b = 5
         6 - 5 - 5 - 5 + a-- + b-- - b++; a = 5 , b = 4
         6 - 5 - 5 - 5 + 5 + b-- - b++; a = 4 , b = 4
         6 - 5 - 5 - 5 + 5 + 4 - 3; a = 4 , b = 4
         6 - 5 - 5 - 5 + 5 + 4 - 3; a = 4 , b = 4
         - 3 a = 4 , b = 4
        System.out.println("a " + a);
        System.out.println("b " + b);
        System.out.println("ket qua " + ketQua);


        Câu điều kiện if else
        */
//        int age = 18;

        // Nếu như tuổi bé hơn 18 : Dưới vị thành niên
        // Nếu như tuổi 18 trở lên : Trên vị thành niên

//        if (age < 18){
//            System.out.println("Dưới vị thành niên");
//        }else{
//            System.out.println("Trên vị thành niên");
//        }

//        int a = 7;
//        int b = 6;
//
//        // a - b > 0 => 1
//        // a - b = 0 => 0
//        // a - b < 0 => -1
//
//        int ketQua = a - b;
//        if (ketQua < 0){
//            System.out.println("-1");
//        }else if(ketQua == 0){
//            System.out.println("0");
//        }else{
//            System.out.println("1");
//        }

        int total = -100;
        // Nếu total lớn hơn 100k => Giảm 10%
        // Nếu total bé hơn 500k và lớn hơn 200k => Giảm 15%
        // Nếu total lớn hơn 500k => Giảm 20%

        // Total ?
        String message = "";
        if (total > 0) {
            if (total > 500000) {
                total = (int) (total * 0.8);
                message = "Giảm 20 %";
            } else if (total > 200000) {
                total = (int) (total * 0.85);
                message = "Giảm 15 %";
            } else if (total > 100000) {
                total = (int) (total * 0.9);
                message = "Giảm 10 %";
            } else {
                message = "Không được giảm";
            }
        } else {
            message = "Dữ liệu nhập sai";
        }

        System.out.println(message);
        System.out.println("Total : " + total);
    }
}


