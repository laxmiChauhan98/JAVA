public class methodCode {

    int id;
    String name;
     //Default Constructor
     methodCode(){
        System.out.println("Defaul values are:"+id  +" "+name);
         System.out.println("This is a default constructor");

        }

        //Parameterized Constructor
        methodCode(int id, String name){

            this.id=id;
            this.name=name;
            System.out.println("This is parameterized constructor");

        }

        //Copy Constructor
        methodCode(methodCode obj){
            id=obj.id;
            name=obj.name;
            System.out.println("This is Copy constructor");
        }
        //Method
     public void displayMethod(){
         System.out.println("Hello from display Method");
        System.out.println("Details are: " +id+ "  "+ name);
   
    }

    public static void main(String[] args) {

    methodCode m1=new methodCode();
  
    m1.id=101;
    m1.name="Laxmi";
    m1.displayMethod();
    

    System.out.println("-----------------------------");

    methodCode m2=new methodCode();
    m2.id=102;
    m2.name="Laxmi Chauhan";

    m2.displayMethod();
    System.out.println("-----------------------------");

    methodCode m3 =new methodCode(111,"MyName");
    m3.displayMethod();
    System.out.println("-----------------------------");


    methodCode copy = new methodCode(m3);
    copy.displayMethod();
 }
}
    



