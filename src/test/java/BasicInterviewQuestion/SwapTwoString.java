package BasicInterviewQuestion;

public class SwapTwoString {
    public static void main(String[] args) {
        String first = "abc";
        String second = "def";
        first = first.concat(second); //abcdef
        second = first.substring(0, first.length()-second.length()); //abc
        first = first.substring(second.length()); //def
        System.out.println("first "+first);
        System.out.println("second "+second);
    }
}