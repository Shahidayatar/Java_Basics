import java.util.Collections;
import java.util.HashMap;

public class HashMap22 {
    public static void main(String[] args) {
        HashMap<String,String> phones= new HashMap<String,String>();// must be atleast 2 data types
        phones.put("shahid","iphone");// here we use put instead of add
        phones.put("adil","Nokia n500");
        phones.put("daniel","One plus");
        System.out.println(phones);

        System.out.println(phones.values());

        System.out.println(phones.get("shahid"));


        for (String i : phones.keySet()) {// usinf loop to print all keys
            System.out.println(i);
        }
        for (String i : phones.values()) {// usinf loop to print all values
            System.out.println(i);
        }
    }
}
