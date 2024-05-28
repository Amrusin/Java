package BasicInterviewQuestion;

public class ReverseString {
    public static void main(String[] args) {
        String s = "Bangalore";
        for (int i = s.length()-1;i>=0;i--) {
            System.out.print(s.charAt(i));
        }
        System.out.println();

        char[] st = s.toCharArray();
        for (int i = st.length-1;i>=0;i--) {
            System.out.print(st[i]);
        }
        System.out.println();

        String rev = "";
        for (int i =s.length()-1;i>=0;i--) {
            rev =rev+s.charAt(i);
        }
        System.out.print(rev);
    }
}
