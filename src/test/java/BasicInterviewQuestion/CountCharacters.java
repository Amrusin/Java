package BasicInterviewQuestion;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class CountCharacters {
    public static void main(String[] args) {
        String s = "baababc";
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i= 0;i<s.length();i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch))
                map.put(ch,map.get(ch)+1);
            else
                map.put(ch,1);
        }
        System.out.println("Map "+map);
        for (char c : map.keySet()) {
            System.out.print(c+""+map.get(c));
        }
    }
}
