package Inheritance;

public class CommissionedEmployee extends  Employee {
    public double grossSales;
    public float commissionRate;
    public CommissionedEmployee(String firstName, String lastName, int employeeId,double grossSales,float commissionRate) {
        super(firstName, lastName, employeeId);

        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }
    public void payCheck(){
        System.out.println(commissionRate * grossSales);
    }
}
