import java.util.HashMap;
import java.util.Map;

public class DUPLICATE_WORDS {
    public static void duplicateWords(String s1){
        String words[]=s1.toLowerCase().split("\\W+");
        Map<String, Integer> map =new HashMap<>();
        for(String word:words){
            if(map.containsKey(word)){
                map.put(word,map.get(word)+1);
            }
            else{
                map.put(word,1);
            }
        }
    }
    public static void main(String[] args) {

    }
}
