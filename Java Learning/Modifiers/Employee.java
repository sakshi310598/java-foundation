package Modifiers;

class Employee {

    public int employeeId; //public
    protected String employeeName; //protected
    int employeeSalary;  //default
    private double bonus; //private
    static String companyName = "Infosys"; //static
    final String COMPANY_CODE = "INFY001"; //final


    public Employee(int employeeId, String employeeName, int employeeSalary, double bonus){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
        this.bonus = bonus;
    }

    public double getBonus() {

        return bonus;
    }

    public void setBonus(double bonus) {

        this.bonus = bonus;
    }


    public void display(){
        System.out.println(employeeId);
        System.out.println(employeeName);
        System.out.println(employeeSalary);
        System.out.println(bonus);
        System.out.println(companyName);
        System.out.println(COMPANY_CODE);
    }
}
