package BasicInterviewQuestion;

import java.util.HashMap;
import java.util.Map;

public class PrintDuplicateWordWithCount {
    public static void main(String[] args) {
        String str = "Hi i i mugilan";
        String [] s = str.split(" ");
        HashMap<String,Integer> map = new HashMap<>();
        for (int i=0;i<s.length;i++) {
            if (map.containsKey(s[i])) {
                map.put(s[i],map.get(s[i])+1);
            } else {
                map.put(s[i],1);
            }
        }
        for(Map.Entry<String , Integer> m : map.entrySet()) {
            if (m.getValue()>1) {
                System.out.println(m.getKey()+" "+m.getValue());
            }
        }
    }
}
