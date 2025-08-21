class EmployeeDetails{

    int Emp_id;
    String Emp_name;
    

    EmployeeDetails(){
        System.out.println("!!!!Default constructor is invoking here!!!!");
       
    }

    EmployeeDetails(int id, String name){
        Emp_id=id;
        Emp_name=name;
        System.out.println("!!!!Parameterize constructor is invoking now!!!!");
    }

    EmployeeDetails(EmployeeDetails obj){
        this.Emp_id=obj.Emp_id;
        this.Emp_name=obj.Emp_name;

        System.out.println("!!Copy Constructor is involing now!!");
    }

 
    public void showDetails(){
    System.out.println("Employee ID: "+Emp_id+"\nEmployee name: " +Emp_name);
    }
    
}
public class EmployeeConstructor{
    public static void main(String[] args) {

        //default

        EmployeeDetails ed = new EmployeeDetails();
        ed.showDetails();

      //default with value change
         System.out.println("-----------------------------------");
         EmployeeDetails ed1 = new EmployeeDetails();
         ed1.Emp_id=120;
         ed1.Emp_name="Vasu";
          
         ed1.showDetails();
   
         //parameterized
          System.out.println("-----------------------------------");
          EmployeeDetails ed2 = new EmployeeDetails(111,"Shikha Chauhan");
          ed2.showDetails();


          //Copy constructor 
           System.out.println("-----------------------------------");
           EmployeeDetails ed3 = new EmployeeDetails(ed1);   
           System.out.println("Details of Copy constructor are:");
           ed3.showDetails();
               
    }

}
