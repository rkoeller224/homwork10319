package Inheritance;

public class SalariedEmployee extends Employee {
    private int weeklySalary;

    public SalariedEmployee(String firstName, String lastName, int employeeId, int weeklySalary) {
        super(firstName, lastName, employeeId);
        this.weeklySalary = weeklySalary;
    }

    public int getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(int weeklySalary) {
        this.weeklySalary = weeklySalary;
    }
    public void payCheck(){

        System.out.println(weeklySalary);

    }

}
