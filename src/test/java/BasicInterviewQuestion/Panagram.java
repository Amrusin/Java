package BasicInterviewQuestion;

import java.util.HashSet;

public class Panagram {
    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";
        if (isPanagram(s)) {
            System.out.println("It is Panagram");
        } else {
            System.out.println("It is not Panagram");
        }
    }
    public static boolean isPanagram(String s) {
        s = s.toLowerCase();
        HashSet<Character> set = new HashSet<>();
        for (int i = 0;i<s.length();i++) {
            if (s.charAt(i)>='a' && s.charAt(i)<='z')
                set.add(s.charAt(i));
        }
        return set.size()==26;
    }
}