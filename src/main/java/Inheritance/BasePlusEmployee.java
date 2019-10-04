package Inheritance;

public class BasePlusEmployee extends CommissionedEmployee {
    public double baseSalary;
    public BasePlusEmployee(String firstName, String lastName, int employeeId, double grossSales, float commissionRate,double baseSalary) {
        super(firstName, lastName, employeeId, grossSales, commissionRate);
        this.baseSalary = baseSalary;

    }
    public void payCheck(){
        System.out.println(commissionRate * grossSales + baseSalary);
    }
}
