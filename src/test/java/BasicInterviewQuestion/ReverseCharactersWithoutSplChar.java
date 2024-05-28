package BasicInterviewQuestion;

public class ReverseCharactersWithoutSplChar {
    public static void main(String[] args) {
        String s = "h&el$l%o9";
        String s1 = s.replaceAll("[^A-Za-z0-9]","s");
        int c =s1.length()-1;
        for (int i =0;i<s.length();i++) {
            if (s.charAt(i)>='a' &&  s.charAt(i)<='z' ||
                    s.charAt(i)>='0'&& s.charAt(i)<='9') {
                System.out.print(s1.charAt(c));
                c--;
            } else {
                System.out.print(s.charAt(i));
            }
        }
    }
}
