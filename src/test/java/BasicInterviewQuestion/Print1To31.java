package BasicInterviewQuestion;

public class Print1To31 {
    public static void main(String[] args) {
        int n = 1;
        for (int i=1;i<=5;i++) {
            if (i==1) {
                System.out.print(n+" ");
            } else {
                n = ((n*2)+1);
                System.out.print(n+" ");
            }
        }
    }
}