 public class EmployeeFinal {

    String Org="KIET";

    final void detailsOfEmp(){
        System.out.println(Org);
     }
  
    }

    class Faculty extends EmployeeFinal{

        // void detailsOfEmp(){
        //     System.out.println("Welcome to overriding");
        // }

        public static void main(String[] args) {
            
        Faculty f=new Faculty();
        f.detailsOfEmp();

        }


    }

    
