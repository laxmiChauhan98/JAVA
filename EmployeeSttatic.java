package Unit1;
public class EmployeeSttatic {
    static int Emp_ID;
    static String Org;

    static{
        Org="Kiet";
    }

    static void staticMethod(){
        System.out.println("This is a static method");
            System.out.println("ID: "+Emp_ID+" "+"Organisation is: "+Org);
    }

    void details(){
        System.out.println("ID: "+Emp_ID+" "+"Organisation is: "+Org);
    }

    public static void main(String[] args) {

      //  EmployeeSttatic.Org="Kiet";
        EmployeeSttatic es=new EmployeeSttatic();
        EmployeeSttatic.Emp_ID=101;
       
        es.details();

        EmployeeSttatic es2=new EmployeeSttatic();
        EmployeeSttatic.Emp_ID=102;
       
        es2.details();

        staticMethod();
    }
    
}
