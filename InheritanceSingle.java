
class Employee{

    int id;
    String name;
    String org;

    void details(){
        System.out.println("Details are: "+id+" "+name+" "+org);
    }

}
class Facultyy extends Employee{

    String dept;
    String subject;

    void facultyDetails(){
        System.out.println("Department is: "+dept+" \nSubject is: "+subject);
    }

}

public class InheritanceSingle {
    public static void main(String[] args) {
        Facultyy f1=new Facultyy();
        f1.id=101;
        f1.name="Shikha";
        f1.org="KIET";
        f1.subject="Java";
        f1.dept="CS";

        f1.details();
        f1.facultyDetails();
    }    
}
