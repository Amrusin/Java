package BasicInterviewQuestion;
/*
        1
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
 */

public class Pattern4 {
    public static void main(String[] args) {
        int n =5;
        int add=1;
        for (int i=1;i<=n;i++) {
            for (int j=1;j<=n-i;j++) {
                System.out.print("  ");
            }
            int x=1;
            for (int j=1;j<=add;j++) {
                System.out.print(x+" ");
                if (j<i)
                    x++;
                else
                    x--;
            }
            add +=2;
            System.out.println();
        }
    }
}