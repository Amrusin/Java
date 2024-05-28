package BasicInterviewQuestion;

import java.util.HashMap;
import java.util.Map;

public class PrintDuplicateCharacterInString {
    public static void main(String[] args) {
        String s = "goibbo";
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch,map.get(ch)+1);
            } else {
                map.put(ch,1);
            }
        }
        for(Map.Entry<Character , Integer> m : map.entrySet()) {
            if (m.getValue()>1) {
                System.out.println(m.getKey()+" "+m.getValue());
            }
        }
    }
}
