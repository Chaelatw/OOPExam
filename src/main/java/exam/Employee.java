package exam;

public class Employee extends Customer{
    protected final double DISCOUNT = 0.10;

    public Employee(String name, Size size, Cloth[] clothingItems) {
        super(name, size, clothingItems);
    }
}
