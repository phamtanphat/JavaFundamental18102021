package OOPHigher.Encapsulation;

public class Product {
    private String name;
    private float weight;

    //getter , setter : cập nhật và lấy dữ liệu thuộc tính

    public String getName(){
        return name;
    }

    public void setName(String name) throws Exception {
        if (name.isEmpty()){
            throw new Exception("Dữ liệu trống");
        }
        this.name = name;
    }

    // alt + insert

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) throws Exception {
        if (weight <= 0){
            throw new Exception("Dữ liệu sai");
        }
        this.weight = weight;
    }
}

