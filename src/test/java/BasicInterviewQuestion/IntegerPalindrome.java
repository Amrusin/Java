package BasicInterviewQuestion;

public class IntegerPalindrome {
    public static void main(String[] args) {
        int n = 121;
        int original = n;
        int reversed = 0;
        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        if (original == reversed)
            System.out.println(original + " is palindrome");
        else
            System.out.println(original + " is not palindrome");
    }
}