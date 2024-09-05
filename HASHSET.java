import java.util.HashSet;
import java.util.Iterator;

public class HASHSET {
    public static void main(String[] args) {
        // creating a hashset
        HashSet<Integer> set=new HashSet<>();

        // inserting
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        // print the set
        System.out.println("The set is "+set);

        // size
        System.out.println("The size of the set is "+set.size());

        // search
        if(set.contains(1)){
            System.out.println("Yes it contains the element ");
        }
        else{
            System.out.println("it doesn't contains the element");
        }

        // delete
        set.remove(3);
        System.out.println("The size of the set after deleting an element "+set.size());

        // iterator
        Iterator it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}