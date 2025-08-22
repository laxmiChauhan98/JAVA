public class EmployeeStatic{

   static String msg="This is a nested class";
   static class NestedClass{
    static void nestedDiaplay(){
        System.out.println(msg);
    }          

    }

    int EmpID;
    static String Organisation;  //static varibale

    static{   //Static block
        Organisation="Kiet";
    }

    void emp_Details(){
        System.out.println("Emp_ID is: "+EmpID+"\n"+"College is: "+Organisation);
    }

    static void staticDetails(){
        System.out.println("Static details are: "+Organisation);

    }

    public static void main(String[] args) {
      //  EmployeeStatic.Organisation="Kiet";
        EmployeeStatic es1=new EmployeeStatic();
        es1.EmpID=101;

        es1.emp_Details();

      //  es1.Organisation="KIET";

        EmployeeStatic es2=new EmployeeStatic();
        es2.EmpID=102;

        es2.emp_Details();
     //   es2.Organisation="KIET";

        EmployeeStatic es3=new EmployeeStatic();
        es3.EmpID=103;

        es3.emp_Details();
      //  es3.Organisation="KIET";


      staticDetails();

    //   EmployeeStatic.NestedClass ns=new EmployeeStatic.NestedClass();
    //   ns.nestedDiaplay();

    NestedClass.nestedDiaplay();


    }

    
}
