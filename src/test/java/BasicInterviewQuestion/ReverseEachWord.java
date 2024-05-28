package BasicInterviewQuestion;

public class ReverseEachWord {
    public static void main(String[] args) {
        String str = "Hi Hello Welcome";
        String [] s = str.split(" ");
        String rev = "";
        for (int i = 0;i<s.length;i++) {
            for (int j=s[i].length()-1;j>=0;j--) {
                rev += s[i].charAt(j);
            }
            rev = rev.concat(" ");
        }
        System.out.println(rev);
    }
}
