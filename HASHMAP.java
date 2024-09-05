import java.util.HashMap;
import java.util.Map;

public class HASHMAP {
    public static void main(String[] args) {
        // creating a hashmap
        HashMap<String,Integer> map=new HashMap<String,Integer>();

        // inserting
        map.put("India",120);
        map.put("China",150);
        map.put("USA",50);
        map.put("Nepal",10);
        map.put("UK",30);
        map.put("China",180);

        // print the map
        System.out.println(map);

        // size
        System.out.println("The size of the map is "+map.size());

        // search
        if(map.containsKey("China")){
            System.out.println("Key is present in the map");
        }
        else{
            System.out.println("Key is not present in the map");
        }
        System.out.println(map.get("China"));

        // remove
        map.remove("Nepal");
        map.remove("UK",30);

        // iterator
        for(Map.Entry<String,Integer> it : map.entrySet()){
            System.out.println(it.getKey()+" "+ it.getValue());
        }
    }
}
