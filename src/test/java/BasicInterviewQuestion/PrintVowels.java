package BasicInterviewQuestion;

public class PrintVowels {
    public static void main(String[] args) {
        String  s = "Welcome";
        String str = s.toLowerCase();
        for (int i = 0;i<str.length();i++) {
            char ch = str.charAt(i);
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                System.out.print(ch+" ");
        }
    }
}