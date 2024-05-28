package BasicInterviewQuestion;

import java.util.HashMap;
import java.util.LinkedHashSet;

public class CountVowelsWithoutDuplicate {
    public static void main(String[] args) {
        String str = "India";
        String s = str.toLowerCase();
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (int i= 0;i<s.length();i++) {
            set.add(s.charAt(i));
        }
        int count = 0;
        for (Character ch : set) {
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                System.out.println(ch);
                count++;
            }
        }
        System.out.println(count);
    }
}