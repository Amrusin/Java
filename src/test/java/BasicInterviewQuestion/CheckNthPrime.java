package BasicInterviewQuestion;

public class CheckNthPrime {
    public static void main(String[] args) {
        int n = 7;
        if (checkPrime(n))
            System.out.println(n + " is prime");
        else
            System.out.println(n + " is not prime");
    }

    public static boolean checkPrime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }
        return count == 2;
    }
}
