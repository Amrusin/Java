package BasicInterviewQuestion;

import java.util.HashMap;

public class StringElementOccurrence {
    public static void main(String[] args) {
        String s = "Kannada";
        String sLower = s.toLowerCase();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0;i<sLower.length();i++) {
            char c = sLower.charAt(i);
            if (map.containsKey(c)) {
                map.put(c,map.get(c)+1);
            } else {
                map.put(c,1);
            }
        }
        System.out.println("Element occurrence :");
        for (Character c : map.keySet()) {
            System.out.println(c+" : "+map.get(c));
        }
    }
}
