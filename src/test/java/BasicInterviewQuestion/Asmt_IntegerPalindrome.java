package BasicInterviewQuestion;

public class Asmt_IntegerPalindrome {
    public static void main(String[] args) {
        int n = 121;
        String s = Integer.toString(n);
        boolean value = Palindrome.checkPalindrome(s);
        if (value)
            System.out.println(s+" is palindrome");
        else
            System.out.println(s+" is not a palindrome");
    }
}