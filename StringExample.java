import java.util.Scanner;

public class StringExample {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String a=sc.next();

        System.out.println(a);
        // String b=sc.next();
        
        String name="Laxmi";

       int len= name.length();
       System.out.println(len);

       System.out.println(name.toUpperCase());

       System.out.println(name.substring(1, 4).toUpperCase());

       String s="LAXMI";
       if(name.equals(s)){
        System.out.println("Yes");
       }
       else{
        System.out.println("No");
       }

       if(name.compareTo(s)>0){
        System.out.println("Name comes after s");
       }
       else{
        System.out.println("Name comes before s");
       }

    }
    
}
