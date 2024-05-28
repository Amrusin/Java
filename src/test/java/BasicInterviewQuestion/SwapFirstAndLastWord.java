package BasicInterviewQuestion;

public class SwapFirstAndLastWord {
    public static void main(String[] args) {
        String s = "Hi Hello Welcome to";
        String[] str = s.split(" ");
        String temp = str[0];
        str[0] = str[str.length-1];
        str[str.length-1] = temp;
        for (String word  : str) {
            System.out.print(word+" ");
        }
    }
}
