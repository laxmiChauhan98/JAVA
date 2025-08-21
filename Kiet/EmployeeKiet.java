package Kiet;

public class EmployeeKiet {

    public String Emp_Name;   //public access modifier
    private int Salary;     //private
    protected int Emp_id;     //  protected
    String Organisation;        //default

   protected void employeeDetails(){
        System.out.println("Details of Kiet Employees are:" +"\n"+Emp_id+" "+Emp_Name+" "+Salary+" "+Organisation);
    }

    public static void main(String[] args) {
        EmployeeKiet ek=new EmployeeKiet();
        ek.Emp_Name="Divya";
        ek.Emp_id=1;
        ek.Salary=200000;
        ek.Organisation="KIET GROUPS";

        ek.employeeDetails();

    }
    


    
}
