package Employee;

public class SalariedEmployee extends Employee {

    private String socialSecurityNumber;
    private double fixedPay;

    public SalariedEmployee(String employeeId, String name, String socialSecurityNumber) {
        super(employeeId, name);
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getFixedMonthlyPayment() {
        return fixedPay;
    }

    public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
        this.fixedPay = fixedMonthlyPayment;
    }

    public void calculatePay() {
        setMonthlyAvarage(fixedPay);
    }

    @Override
    public String toString() {
        return "Contracted Employee's '" + getName() +
                "' with SSN" + getSocialSecurityNumber() +
                "' avarage monthly salary is $" + String.format("%.2f", getAverageMonthlySalary());
    }
}