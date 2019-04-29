package Employee;

public class ContractedEmployee extends Employee {

    String federalTaxId;
    double hoursWorked;
    double rate;

    public ContractedEmployee(String employeeId, String name, String federalTaxId) {
        super(employeeId, name);
        this.federalTaxId = federalTaxId;
    }

    public String getFederalTaxId() {
        return federalTaxId;
    }

    public void setFederalTaxId(String federalTaxId) {
        this.federalTaxId = federalTaxId;
    }

    public double getHourlyRate() {
        return rate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.rate = hourlyRate;
    }

    public double getNumberOfHoursWorked() {
        return hoursWorked;
    }

    public void setNumberOfHoursWorked(double numberOfHoursWorked) {
        this.hoursWorked = numberOfHoursWorked;
    }

    public void calculatePay() {
        setMonthlyAvarage(rate * hoursWorked);
    }

    @Override
    public String toString() {
        return "Contracted Employee's '" + getName() +
                "' with Federal Tax ID:" + getFederalTaxId() +
                " avarage monthly salary is $" + String.format("%.2f", getAverageMonthlySalary());
    }
}
