package exam;

public class Main {
    public static void main(String[] args) {
       Cloth clothingItem1 = new Cloth("Jeans", 20.00, Size.S);
       Cloth clothingItem2 = new Cloth("T-shirt", 8.00, Size.M);
       Cloth clothingItem3 = new Cloth("Hat", 2.00, Size.L);
        Cloth[] shoppingBag = {clothingItem3,clothingItem2,clothingItem1};
        System.out.println();

        Student student1 = new Student("Mike", Size.L, shoppingBag);
        Student student2 = new Student("Jane", Size.S, shoppingBag);
        Student[] listOfStudents = {student1,student2};
        System.out.println();

        HourlyEmployee hourlyEmployee1 = new HourlyEmployee("Alex", 40, 20f, Size.S, shoppingBag);
        System.out.println();



    }
}
