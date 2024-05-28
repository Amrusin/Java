package BasicInterviewQuestion;

public class MaximumLength {
    public static void main(String[] args) {
        String[] s  = {"123","4567","23","7658","95"};
        String max_length = s[0];
        for (int i=0;i<s.length;i++) {
            if (s[i].length()>s[0].length())
                max_length = s[i];
        }
        for (int i=0;i<s.length;i++) {
            if (s[i].length()==max_length.length())
                System.out.println(s[i]);
        }
    }
}