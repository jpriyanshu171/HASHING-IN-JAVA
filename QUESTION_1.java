import java.util.HashMap;

public class QUESTION_1 {
    public static void majorityElement(int a[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
            } else {
                map.put(a[i], 1);
            }
            for(int e:map.keySet()){
                if(map.get(e)>a.length/3){
                    System.out.println(e);
                }
            }
        }
    }

    public static void main(String[] args) {
        int a[]={1,3,2,5,1,3,1,5,1};
        majorityElement(a);
    }
}
