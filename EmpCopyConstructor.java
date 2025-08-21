public class EmpCopyConstructor {

    int Emp_id;             //instance variables
    String Emp_name;

 
    EmpCopyConstructor(int Emp_id, String Emp_name){  //Parameterized Constructor 
        this.Emp_id=Emp_id;
        this.Emp_name=Emp_name;
    }
   

    EmpCopyConstructor(EmpCopyConstructor obj){  //Copy Constructor
        Emp_id=obj.Emp_id;
        Emp_name=obj.Emp_name;
    }

    public void printDetails(){    //Method
        System.out.println("Details of the Employee are: " +"\n      "+Emp_id+" "+Emp_name);
    }

    public static void main(String[] args) {


        // EmpCopyConstructor ecc = new EmpCopyConstructor(101, "Laxmi");

        // ecc.printDetails();   //printing old values

        // EmpCopyConstructor copy;

        // copy=ecc; //not acceptable

        // copy.printDetails();  //printing ecc values

        // copy.Emp_id=202;  //changing emp_id of copy

        // ecc.printDetails();  //ecc values are affecting here


        EmpCopyConstructor ecc= new EmpCopyConstructor(101,"Laxmi" );
        ecc.printDetails();

        EmpCopyConstructor copy= new EmpCopyConstructor(ecc);
        copy.printDetails();

        copy.Emp_id=202;
        copy.Emp_name="Shikha";
        System.out.println("Details after changing copy'emp_id are :" );
        copy.printDetails();

        ecc.printDetails(); 
        
    }
        
}

