package BasicInterviewQuestion;

// input --> my name is ty.your name is king
//outpput --> ty is name my your name is king
public class ReverseBeforeDot {
    public static void main(String[] args) {
        String s = "my name is ty.your name is king.king's wife is queen";
        String[] st = s.split("\\.");
        for (int i = 0; i < st.length; i++) {
            if (i == 0) {
                String[] str = st[i].split(" ");
                for (int j = str.length - 1; j >= 0; j--) {
                    System.out.print(str[j] + " ");
                }
            } else {
                System.out.print(st[i] + " ");
            }
        }
    }
}