

abstract class Collegee{
    abstract void Register();
    abstract void Infrastructure();
    abstract void Students();
    abstract void Staff();
    void medicalFacility(){
        System.out.println("Medical Facilities are optional");
    }
}
class KIETT extends Collegee{
    void Register(){
        System.out.println("Kiet is registered with AKTU");
    }
    void Infrastructure(){
        System.out.println("KIET has digital classrooms and labs");
    }
    void Students(){
        System.out.println("Admissions through counselling");
    }
    void Staff(){
        System.out.println("Kiet has well trained staff");
    }
    void medicalFacility(){
        System.out.println("Kiet has its own hospital inside campus");
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        Collegee cg;
        cg=new KIETT();
        cg.Register();
        cg.Infrastructure();
        cg.Students();
        cg.Staff();
        cg.medicalFacility();
    }  
}
