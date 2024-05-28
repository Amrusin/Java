package BasicInterviewQuestion;

public class PrintPrimeNumber {
    public static void main(String[] args) {
        int n =30;
        for (int i =1;i<=n;i++) {
            if (isPrime(i))
                System.out.print(i+" ");
        }
    }
    public static boolean isPrime(int n) {
        int count = 0;
        for (int i = 1;i<=n;i++) {
            if (n%i==0)
                count++;
        }
        return count==2;
    }
}
