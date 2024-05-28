package BasicInterviewQuestion;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        a = a+b;  // a= 30
        b = a-b;  // b= 10
        a = a-b;  // a= 20
        System.out.println("A-->"+a);
        System.out.println("B-->"+b);
    }
}
