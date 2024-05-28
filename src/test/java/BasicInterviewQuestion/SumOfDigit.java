package BasicInterviewQuestion;

public class SumOfDigit {
    public static void main(String[] args) {
        String s = "a1%23$65";
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                sum += Character.getNumericValue(ch);
            }
        }
        System.out.println(sum);
        //alternative method
        int add = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch > '0' && ch <= '9') {
                int n = s.charAt(i) - 48;
                add += n;
            }
        }
        System.out.println(add);
    }
}