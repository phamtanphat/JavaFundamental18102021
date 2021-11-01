package OOPHigher.Encapsulation;

import java.io.Closeable;

public class DemoEncapsulation {

    public static void main(String[] args) {
        Product product1 = new Product();
        try{
            product1.setName("Product1");
            product1.setWeight(1);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(product1.getName());
        System.out.println(product1.getWeight());

        // try catch
//        try {
//            Object a = null;
//            int ketQua = a.hashCode();
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        System.out.println("Tiếp tục");


    }
}
