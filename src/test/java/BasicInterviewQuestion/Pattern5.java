package BasicInterviewQuestion;
/*
        *
      * * *
    * * * * *
  * * * * * * *
 */

public class Pattern5 {
    public static void main(String[] args) {
        int n =4;
        int star = 1;
        for (int i =1;i<=n;i++) {
            for (int j=1;j<=n-i;j++) {
                System.out.print("  ");
            }
            for (int j=1;j<=star;j++) {
                System.out.print("* ");
            }
            System.out.println();
            star +=2;
        }
    }
}
