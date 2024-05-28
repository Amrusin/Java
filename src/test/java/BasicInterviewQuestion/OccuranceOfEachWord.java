package BasicInterviewQuestion;

import java.util.HashMap;

public class OccuranceOfEachWord {
    public static void main(String[] args) {
        String str = "I  am am from Bangalore";
        String s = str.toLowerCase();
        HashMap<String,Integer> map = new HashMap<>();
        String [] word = s.split("\\s+");
        for (int i = 0; i<word.length;i++) {
            if (map.containsKey(word[i])) {
                map.put(word[i],map.get(word[i])+1);
            } else {
                map.put(word[i],1);
            }
        }
        System.out.println(map);
    }
}