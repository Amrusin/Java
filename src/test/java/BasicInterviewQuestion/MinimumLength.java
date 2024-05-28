package BasicInterviewQuestion;

public class MinimumLength {
    public static void main(String[] args) {
        String[] s = {"abc","abcd","bd","abd","ab"};
        String min_length = s[0];

        for (int i = 1 ;i<s.length;i++) {
            if (s[i].length()<min_length.length())
                min_length = s[i];
        }
        for (int i = 0;i<s.length;i++) {
            if (s[i].length()==min_length.length())
                System.out.println(s[i]);
        }
    }
}