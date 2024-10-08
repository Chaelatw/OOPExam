package exam;

public class Cloth {
    private String name;
    private double price;
    private Size size;

    public Cloth(String name, double price, Size size){
        this.price = price;
        this.name = name;
        this.size = size;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }



}
