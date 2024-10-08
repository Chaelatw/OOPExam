package exam;

public class Student extends Customer{
    private long studentID;
    private long studentCounter;
    private final double DISCOUNT = 0.05;


    public Student(String name, Size size, Cloth[] clothingItems) {
        super(name, size, clothingItems);
        this.studentID = studentCounter;
        studentCounter++;
    }
    public void printStudentCounter(){

    }

    public long getStudentID() {
        return studentID;
    }

    public long getStudentCounter() {
        return studentCounter;
    }


    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", studentCounter=" + studentCounter +
                '}';
    }
}
