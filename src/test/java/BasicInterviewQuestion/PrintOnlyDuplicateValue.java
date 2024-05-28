package BasicInterviewQuestion;

import java.util.HashMap;
import java.util.Map.Entry;

public class PrintOnlyDuplicateValue {
    public static void main(String[] args) {
        int[] a = {5,3,1,4,3,5};
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i =0;i<a.length;i++) {
            if (map.containsKey(a[i])) {
                map.put(a[i],map.get(a[i])+1);
            } else {
                map.put(a[i],1);
            }
        }
        for (Entry<Integer,Integer> m : map.entrySet()) {
            if (m.getValue()>1) {
                System.out.println(m.getKey()+" "+m.getValue());
            }
        }
    }
}
