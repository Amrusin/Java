package BasicInterviewQuestion;

public class Palindrome {
    public static void main(String[] args) {
        String s = "madam";
        if (checkPalindrome(s))
            System.out.println(s+" is palindrome");
        else
            System.out.println(s+" is not a palindrome");
    }
    public static boolean checkPalindrome(String s) {
        for (int i =  0 ; i < s.length(); i++) {
            int first = 0;
            int last = s.length()-1;
            while(first<last) {
                if (s.charAt(first)!=s.charAt(last)) {
                    return false;
                }
                first++;
                last--;
            }
        }
        return true;
    }
}
