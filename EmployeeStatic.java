public class EmployeeStatic{

    int EmpID;
    String Organisation;

    void emp_Details(){
        System.out.println("Emp_ID is: "+EmpID+"\n"+"College is:"+Organisation);
    }

    public static void main(String[] args) {
        EmployeeStatic es1=new EmployeeStatic();
        es1.EmpID=101;
        es1.Organisation="KIET";

        EmployeeStatic es2=new EmployeeStatic();
        es2.EmpID=102;
        es2.Organisation="KIET";

        EmployeeStatic es3=new EmployeeStatic();
        es3.EmpID=103;
        es3.Organisation="KIET";


    }

    
}
