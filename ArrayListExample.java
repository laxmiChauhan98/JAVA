import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<String> fruits=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");
      

        System.out.println(fruits);
        for(String s:fruits){
            System.out.println(s);
        }

        Iterator itr=fruits.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


        fruits.add(1,"Guava");
        System.out.println(fruits);

        System.out.println(fruits.get(3));

        System.out.println(fruits.set(1,"ABC"));
        System.out.println(fruits);

    fruits.remove(2);
   System.out.println(fruits);

   fruits.remove("Grapes");
 
   System.out.println(fruits);

   int s= fruits.size();
   System.out.println(s);

   System.out.println(fruits.contains("Apple"));


//    Collections.sort(fruits);
//    System.out.println(fruits);


//    fruits.clear();
//    System.out.println(fruits);

    }
    
}
