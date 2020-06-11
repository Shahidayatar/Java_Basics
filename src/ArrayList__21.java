import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayList__21 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<String>();
        names.add("shahid ");
        names.add("Karthik ");
        names.add("Daniel ");
        names.add("vandesh ");
        System.out.println(names);
        System.out.println(names.get(0));// wat to access it


        System.out.println(names.set(0,"adil"));
        System.out.println(names);// we have changed shahid to adil// there are many method ..


        // using collections

        Collections.sort(names);
        System.out.println(names);



        // Arraylist for integers
        ArrayList <Integer> numbers= new ArrayList<Integer>();
        numbers.add(9);
        numbers.add(2);
        numbers.add(7);
        numbers.add(1);

        System.out.println(numbers);
        Collections.sort(numbers);

        System.out.println(numbers);


    }



}
