package exam;

public class HourlyEmployee extends Employee{
    private float hoursWorked;
    private double hourlyWage;


    public HourlyEmployee(String name, float hoursWorked, double hourlyWage, Size size, Cloth[] clothingItems) {
        super(name, size, clothingItems);
        this.hoursWorked = hoursWorked;
        this.hourlyWage = hourlyWage;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

}
