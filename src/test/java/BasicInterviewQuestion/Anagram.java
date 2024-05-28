package BasicInterviewQuestion;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "Silent";
        String str2 = "Listen";
        if(areAnagram(str1, str2))
            System.out.println("It is Anagram");
        else
            System.out.println("It is not Anagram");
    }
    public static boolean areAnagram(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        if (s1.length()!=s2.length())
            return false;
        String s1Sorted = sortString(s1);
        String s2Sorted = sortString(s2);
        return s1Sorted.equals(s2Sorted);
    }
    public static String sortString(String s) {
        char[] ch = s.toCharArray();
        for (int i = 0;i<ch.length;i++) {
            for (int j = i+1;j<ch.length;j++) {
                if (ch[i]>ch[j]) {
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
            //comments
        }
        return new String(ch);
    }
}