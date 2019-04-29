package Employee;

public abstract class Employee implements Payable {

    private String name;
    private String id;
    private double monthlyAvarage;

    public Employee(){}

    public Employee(String employeeId, String name) {
        this.name = name;
        this.id = employeeId;
    }

    public abstract void calculatePay();

    public String getEmployeeId() {
        return id;
    }

    public void setEmployeeId(String employeeId) {
        this.id = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMonthlyAvarage(double avarageMonthlySalary) {
        this.monthlyAvarage = avarageMonthlySalary;
    }

    public double getAverageMonthlySalary() {
        return monthlyAvarage;
    }

    @Override
    public String toString() {
        return "Employee's '" + name + "' avarage monthly salary is " + String.format("%.2f", getAverageMonthlySalary());
    }
}
