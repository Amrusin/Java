package BasicInterviewQuestion;

public class GiveSpaceInBetweenString {
    public static void main(String[] args) {
        String s = "hello";
        for (int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            System.out.print(ch);
            for (int j = 0;j<=i;j++) {
                System.out.print(" ");
            }
        }
    }
}