package BasicInterviewQuestion;

public class ReverseASentence {
    public static void main(String[] args) {
        String s = "Hi Hello Welcome";
        String str []  = s.split(" ");
        for (int i = str.length-1;i>=0;i--) {
            System.out.print(str[i]+" ");
        }
    }
}
