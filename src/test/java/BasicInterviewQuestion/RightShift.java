package BasicInterviewQuestion;

public class RightShift {
    public static void main(String[] args) {
        String s = "Hi Welcome to Bangalore";
        rotateAndPrintWords(s);
    }
    public static void rotateAndPrintWords(String str) {
        // Split the string into words
        String[] words = str.split(" ");
        int len = words.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
               int num = (i + j + 1) % len;
                String n = words[num];
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}