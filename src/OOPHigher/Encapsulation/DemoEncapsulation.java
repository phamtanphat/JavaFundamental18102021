package OOPHigher.Encapsulation;

public class DemoEncapsulation {

    public static void main(String[] args) {
        Product product1 = new Product();
//        try{
//            product1.setName("");
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }


        // try catch

        try {
            Object a = null;
            int ketQua = a.hashCode();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Tiếp tục");


    }
}
